package jimenez.karina.recycle1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.mi_tarjeta.view.*

class LugarAdapter (lugares:ArrayList<Lugar>,contexto:Context): RecyclerView.Adapter<LugarAdapter.ViewHolder>(){


    var lugares:ArrayList<Lugar>?=null
    var contexto:Context?=null

    init {
        this.lugares = lugares
        this.contexto = contexto
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val vistaLugar:View = LayoutInflater.from(contexto).inflate(R.layout.mi_tarjeta,parent,false)
        val lugarViewHolder = ViewHolder(vistaLugar)
        vistaLugar.tag = lugarViewHolder
        return lugarViewHolder
    }

    override fun getItemCount(): Int {
       return lugares!!.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nombre!!.text = lugares!![position].nombre
        holder.descripcion!!.text = lugares!![position].descripcion

        Picasso.get().load(lugares!![position].foto).into(holder.imagen)

    }

    class ViewHolder (vista:View):RecyclerView.ViewHolder(vista){
        var imagen:ImageView?=null
        var nombre:TextView?=null
        var descripcion:TextView?=null

        init {
            imagen = vista.imageView
            nombre = vista.tvEncabezado
            descripcion = vista.tvDescripcion
        }

    }
}