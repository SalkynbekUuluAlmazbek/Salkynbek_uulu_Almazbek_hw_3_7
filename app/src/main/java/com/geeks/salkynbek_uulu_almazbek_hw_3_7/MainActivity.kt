package com.geeks.salkynbek_uulu_almazbek_hw_3_7

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.geeks.salkynbek_uulu_almazbek_hw_3_7.databinding.ActivityMainBinding
import com.geeks.salkynbek_uulu_almazbek_hw_3_7.adapter.CarAdapter

class MainActivity : AppCompatActivity(), CarAdapter.ItemClick {

    private val arrayListCars = ArrayList<Car>()
    private lateinit var adapter: CarAdapter
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = CarAdapter(arrayListCars, this@MainActivity)
        }

        arrayListCars.add(Car(R.drawable.honda_e, "Honda e 2020 года", "Honda",
            "Изображенный на фотографиях автомобиль был выпущен в 2020 году. Автомобиль предназначен для рынка Великобритании и Ирландии.",
            "Gray", "36 000 $"))
        arrayListCars.add(Car(R.drawable.honda_fit, "Honda Fit Sport 2020 года", "Honda",
            "Изображенный на фотографиях автомобиль был выпущен в 2020 году. Автомобиль предназначен для рынка Китая",
            "Blue", "26 990 $"))
        arrayListCars.add(Car(R.drawable.subaru_wrx, "Subaru WRX STi Baby Drive Movie 2006 года", "Subaru",
            "Изображенный на фотографиях автомобиль был выпущен в 2006 году, в кузове GDB.",
            "Red", "34 800 $"))
        arrayListCars.add(Car(R.drawable.subaru_sti, "Subaru WRX S4 STI Sport 2020 года", "Subaru",
            "Изображенный на фотографиях автомобиль был выпущен в 2020 году. Автомобиль предназначен для рынка Японии.",
            "White", "36 000 $"))
        arrayListCars.add(Car(R.drawable.honda_e, "Honda e 2020 года", "Honda",
            "Изображенный на фотографиях автомобиль был выпущен в 2020 году. Автомобиль предназначен для рынка Великобритании и Ирландии.",
            "Gray", "36 000 $"))
        arrayListCars.add(Car(R.drawable.honda_fit, "Honda Fit Sport 2020 года", "Honda",
            "Изображенный на фотографиях автомобиль был выпущен в 2020 году. Автомобиль предназначен для рынка Китая",
            "Blue", "26 990 $"))
        arrayListCars.add(Car(R.drawable.subaru_wrx, "Subaru WRX STi Baby Drive Movie 2006 года", "Subaru",
            "Изображенный на фотографиях автомобиль был выпущен в 2006 году, в кузове GDB.",
            "Red", "34 800 $"))
        arrayListCars.add(Car(R.drawable.subaru_sti, "Subaru WRX S4 STI Sport 2020 года", "Subaru",
            "Изображенный на фотографиях автомобиль был выпущен в 2020 году. Автомобиль предназначен для рынка Японии.",
            "White", "36 000 $"))


        adapter = CarAdapter(arrayListCars, this)
        binding.recyclerView.adapter = adapter
    }

    override fun onClick(car: Car) {
        val intent = Intent(this@MainActivity, DetailActivity::class.java)
        intent.putExtra("image", car.image)
        intent.putExtra("title", car.title)
        intent.putExtra("description", car.description)
        intent.putExtra("color", car.color)
        intent.putExtra("sum", car.sum)
        startActivity(intent)
    }
}
