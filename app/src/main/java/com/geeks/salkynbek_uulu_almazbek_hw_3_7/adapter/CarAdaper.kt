package com.geeks.salkynbek_uulu_almazbek_hw_3_7.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.geeks.salkynbek_uulu_almazbek_hw_3_7.Car
import com.geeks.salkynbek_uulu_almazbek_hw_3_7.R

class CarAdapter(
    private val adapterArrayList: ArrayList<Car>,
    private val onClick: ItemClick
) : RecyclerView.Adapter<CarAdapter.CarViewHolder>() {

    interface ItemClick {
        fun onClick(car: Car)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_car, parent, false)
        return CarViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        val car = adapterArrayList[position]
        holder.onBind(car)
        holder.itemView.setOnClickListener { onClick.onClick(car) } // Установка слушателя кликов
    }

    override fun getItemCount(): Int {
        return adapterArrayList.size
    }


    class CarViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val imageViewCar: ImageView = itemView.findViewById(R.id.imageViewCar)
        private val name: TextView = itemView.findViewById(R.id.textViewName)
        private val title: TextView = itemView.findViewById(R.id.textViewTitle)
        private val description: TextView = itemView.findViewById(R.id.textViewItemDescription)
        private val color: TextView = itemView.findViewById(R.id.textViewColor)
        private val summa: TextView = itemView.findViewById(R.id.textViewSum)

        fun onBind(car: Car) {
            imageViewCar.setImageResource(car.image ?: 0)
            name.text = car.name
            title.text = car.title
            description.text = car.description
            color.text = car.color
            summa.text = car.sum
        }
    }
}

