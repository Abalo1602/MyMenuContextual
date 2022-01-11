package iesmurgi.org.mymenucontextual

import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image: ImageView = findViewById(R.id.image)
        registerForContextMenu(image)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu,
        v: View,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)

        menuInflater.inflate(R.menu.menu, menu)
        menu.setHeaderTitle("Menu imagen")
    }

    private fun showMessage(msg: CharSequence) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        showMessage(item.title)

        return when (item.itemId) {
            R.id.descargar -> {
                descargar()
                true
            }
            R.id.compartir -> {
                compartir()
                true
            }
            R.id.copiar -> {
                copiar()
                true
            }
            else -> super.onContextItemSelected(item)
        }
    }

    private fun descargar() {

    }

    private fun compartir() {

    }

    private fun copiar() {

    }


    override fun onContextMenuClosed(menu: Menu) {
        showMessage("Menú cerrado")
    }
}