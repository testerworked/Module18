package com.homework.hrdepartment

/**
 * Приложение «Отдел кадров»
 * Необходимо написать приложение на основе пройденного материала,
 * содержащее в себе данные о персонале организации. В качестве элемента,
 * располагающего в себе данные использовать Flow-контейнеры.
 * Есть список персонала, который включает объекты класса со свойствами имени,
 * фамилии, должности и зарплаты. Список состоит из 12 персон, допустим,
 * 3 – инженера, 3 – врача, 3 – программиста, 3 – учителя. Список перемешан,
 * элементы располагаются в произвольном порядке. На экране устройства
 * с имеющейся горизонтальной прокруткой при правильной работе мы видим по 3 элемента,
 * которые отображаются в отсортированном порядке по имени и должности.
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