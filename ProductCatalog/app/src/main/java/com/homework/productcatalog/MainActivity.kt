package com.homework.productcatalog

/**
 *Приложение «Каталог товаров»
 *
 * Необходимо написать приложение на основе пройденного материала содержащее
 * в себе каталог товаров (товары могут быть выбраны на свой выбор).
 * Приложение содержит два списка: LazyColumn и LazyRow. В каждом списке содержатся товары.
 * Перед каждым списком имеется заголовок. Ячейка списка содержит картинку, название и цену.
 *
 * Примерный вариант отображения содержимого может выглядеть так:
 */
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}