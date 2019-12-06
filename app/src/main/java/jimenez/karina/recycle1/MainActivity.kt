package jimenez.karina.recycle1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val lugares = ArrayList<Lugar>()
        lugares.add(Lugar(nombre = "Egipto",foto = "https://dam.vanidades.com/wp-content/uploads/2019/07/piramides-egipto-770x513.jpg",descripcion = "DescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcion"))
        lugares.add(Lugar(nombre = "Egipto",foto = "https://dam.vanidades.com/wp-content/uploads/2019/07/piramides-egipto-770x513.jpg",descripcion = "DescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcion"))
        lugares.add(Lugar(nombre = "Egipto",foto = "https://dam.vanidades.com/wp-content/uploads/2019/07/piramides-egipto-770x513.jpg",descripcion = "DescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcion"))
        lugares.add(Lugar(nombre = "Egipto",foto = "https://dam.vanidades.com/wp-content/uploads/2019/07/piramides-egipto-770x513.jpg",descripcion = "DescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcion"))
        lugares.add(Lugar(nombre = "Egipto",foto = "https://dam.vanidades.com/wp-content/uploads/2019/07/piramides-egipto-770x513.jpg",descripcion = "DescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcionDescripcion"))

        myRecycler.adapter = LugarAdapter(lugares, contexto = this)
        myRecycler.layoutManager = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)
    }
}
