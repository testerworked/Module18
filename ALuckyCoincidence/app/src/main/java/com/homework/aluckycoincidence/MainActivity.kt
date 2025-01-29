package com.homework.aluckycoincidence

/**
 *Приложение «Удачное совпадение»
 *
 * Необходимо написать приложение на основе пройденного материала, имитирующее игру,
 * в которой получаешь выигрыш, если три картинки по горизонтали одинаковые.
 *
 * Приложение содержит LazyVerticalGrid.
 *
 * Список картинок включает не более 6 – 8 элементов, картинки могут быть разного
 * содержания (фрукты, овощи, предметы обихода). LazyVerticalGrid размещает
 * в себе эти картинки рандомно и должен вмещать в себя 100 штук.
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