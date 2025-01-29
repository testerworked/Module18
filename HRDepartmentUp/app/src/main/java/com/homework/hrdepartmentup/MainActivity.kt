package com.homework.hrdepartmentup

/**
 * Приложение «Отдел кадров»
 * Необходимо написать приложение на основепройденного материала,
 * содержащее в себе данные о персонале организации.
 * В качестве элемента, располагающего в себе данные использовать LazyColumn.
 *
 * Имеющийся список персонала содержит в себе объекты класса со свойствами имени,
 * фамилии, должности. Список состоит не менее чем из 24 персон.
 * Штатное расписание должностей можно определить самостоятельно.
 * Список перемешан, элементы располагаются в произвольном порядке.
 *
 * На экране устройства с имеющейся вертикальной прокруткой при правильной работе
 * приложения мы видим сгруппированный по должности вывод персонала
 * под соответствующим заголовком, которые отображаются в отсортированном порядке по имени.
 *
 * Кроме того функционально организована возможность по нажатию
 * на текстовый элемент «В конец» и «В начало» перейти в конец списка,
 * начало списка соответственно.
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