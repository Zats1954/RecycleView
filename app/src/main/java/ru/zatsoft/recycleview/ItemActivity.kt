package ru.zatsoft.recycleview

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import ru.zatsoft.recycleview.databinding.ActivityItemBinding
import ru.zatsoft.recycleview.databinding.ActivitySecondBinding

class ItemActivity : AppCompatActivity() {

    private lateinit var binding: ActivityItemBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityItemBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbarMain)
        supportActionBar?.setTitle(" ")
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.toolbarMain.setNavigationOnClickListener {
            onBackPressed()
        }

        var cloth: Clothes? = null
        if (intent.hasExtra("cloth")) {
            cloth = intent.extras?.getParcelable("cloth")
        }
        if (cloth != null) {
            binding.itemImage.setImageResource(cloth.image)
            binding.itemTitle.text = cloth.name
            binding.itemDescription.text = cloth.description
        }

        binding.display.setOnLongClickListener {
                val dialog = AlertDialog.Builder(this)
                val inflater = this.layoutInflater
                val dialogView = inflater.inflate(R.layout.update_dialog, null)
                dialog.setView(dialogView)
                val editName = dialogView.findViewById<EditText>(R.id.name_dialog)
                val editDescription = dialogView.findViewById<EditText>(R.id.description_dialog)
            editName.setText(cloth?.name)
            editDescription.setText(cloth?.description)

                dialog.setTitle("Обновить запись")
                dialog.setMessage("Введите данные ниже")
                dialog.setPositiveButton("Обновить"){_,_ ->
                    binding.itemTitle.text = editName.text.toString()
                    binding.itemDescription.text = editDescription.text.toString()
                    val newCloth = Clothes(editName.text.toString(),cloth!!.image,editDescription.text.toString())
                }
                dialog.setNegativeButton("Отмена"){_,_ ->
                }
                dialog.create().show()
                false
            }
    }
}
