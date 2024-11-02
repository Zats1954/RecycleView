package ru.zatsoft.recycleview

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ru.zatsoft.recycleview.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding
    private lateinit var clothing: List<Clothes>
    private lateinit var recycleView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        clothing = mutableListOf<Clothes>(
            Clothes("Куртка Oiata",R.drawable.oiata, "Мужская Уличная водонепроницаемая в стиле пэчворк, с карманами, с капюшоном"),
            Clothes("Куртка Parker",R.drawable.parker, "Теплая Вельветовая мужская куртка Паркер овечья шерсть свободная повседневная куртка"),
            Clothes("Куртка Fliso",R.drawable.fliso, "Зимняя теплая толстая мужская куртка с капюшоном из полиэстера"),
            Clothes("Куртка Browon",R.drawable.browon, "Зимняя теплая мужская одноцветная флисовая куртка с воротником-стойкой"),
            Clothes("Ветровка CHRLCK",R.drawable.chrlck, "Дышащая ветрозащитная ветровка CHRLCK унисекс кемпинг охота бег треккинговая куртка для рыбалки"),
            Clothes("Пальто  Mauroicardi",R.drawable.mauroicardi, "Пальто Mauroicardi Длинное Теплое Однобортное Шерстяное пальто с напуском"),
            Clothes("Куртка Oiata",R.drawable.oiata, "Мужская Уличная водонепроницаемая в стиле пэчворк, с карманами, с капюшоном"),
            Clothes("Куртка Parker",R.drawable.parker, "Теплая Вельветовая мужская куртка Паркер овечья шерсть свободная повседневная куртка"),
            Clothes("Куртка Fliso",R.drawable.fliso, "Зимняя теплая толстая мужская куртка с капюшоном из полиэстера"),
            Clothes("Куртка Browon",R.drawable.browon, "Зимняя теплая мужская одноцветная флисовая куртка с воротником-стойкой"),
            Clothes("Ветровка CHRLCK",R.drawable.chrlck, "Дышащая ветрозащитная ветровка CHRLCK унисекс кемпинг охота бег треккинговая куртка для рыбалки"),
            Clothes("Пальто  Mauroicardi",R.drawable.mauroicardi, "Пальто Mauroicardi Длинное Теплое Однобортное Шерстяное пальто с напуском"),
            Clothes("Куртка Oiata",R.drawable.oiata, "Мужская Уличная водонепроницаемая в стиле пэчворк, с карманами, с капюшоном"),
            Clothes("Куртка Parker",R.drawable.parker, "Теплая Вельветовая мужская куртка Паркер овечья шерсть свободная повседневная куртка"),
            Clothes("Куртка Fliso",R.drawable.fliso, "Зимняя теплая толстая мужская куртка с капюшоном из полиэстера"),
            Clothes("Куртка Browon",R.drawable.browon, "Зимняя теплая мужская одноцветная флисовая куртка с воротником-стойкой"),
            Clothes("Ветровка CHRLCK",R.drawable.chrlck, "Дышащая ветрозащитная ветровка CHRLCK унисекс кемпинг охота бег треккинговая куртка для рыбалки"),
            Clothes("Пальто  Mauroicardi",R.drawable.mauroicardi, "Пальто Mauroicardi Длинное Теплое Однобортное Шерстяное пальто с напуском"),
            Clothes("Куртка Oiata",R.drawable.oiata, "Мужская Уличная водонепроницаемая в стиле пэчворк, с карманами, с капюшоном"),
            Clothes("Куртка Parker",R.drawable.parker, "Теплая Вельветовая мужская куртка Паркер овечья шерсть свободная повседневная куртка"),
            Clothes("Куртка Fliso",R.drawable.fliso, "Зимняя теплая толстая мужская куртка с капюшоном из полиэстера"),
            Clothes("Куртка Browon",R.drawable.browon, "Зимняя теплая мужская одноцветная флисовая куртка с воротником-стойкой"),
            Clothes("Ветровка CHRLCK",R.drawable.chrlck, "Дышащая ветрозащитная ветровка CHRLCK унисекс кемпинг охота бег треккинговая куртка для рыбалки"),
            Clothes("Пальто  Mauroicardi",R.drawable.mauroicardi, "Пальто Mauroicardi Длинное Теплое Однобортное Шерстяное пальто с напуском"),
            )
        binding.rvList.layoutManager = LinearLayoutManager(this)
        binding.rvList.adapter = CustomAdapter(clothing as MutableList<Clothes>)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.exit)
            finish()
        return super.onOptionsItemSelected(item)
    }
}