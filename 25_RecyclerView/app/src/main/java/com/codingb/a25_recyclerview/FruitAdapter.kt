package com.codingb.a25_recyclerview

import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item_fruit.view.*

class FruitAdapter(
    val fruits : ArrayList<Fruit>   //using the constructer of the FruitAdapter to recieve the data
) : RecyclerView.Adapter<FruitAdapter.FruitViewHolder>() {

    //1) The RecyclerView.Adapter needs an generic type View holder
    //   so implementing this FtuitViewHolder class
    class FruitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) //extending ViewHolder

    //2)Adpater is abstract class so implementing these functions down

    //2.1)creating the viewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitViewHolder {
        //to create object of FruitViewHolder
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.list_item_fruit , parent , false
        )
        return FruitViewHolder(itemView)
    }

    //2.2)used to map the data items to the views
    override fun onBindViewHolder(holder: FruitViewHolder, position: Int) {
        //mapping the data to the views
        holder.itemView.tvFruitName.text = fruits[position].name
        holder.itemView.tvOrigin.text = fruits[position].origin
        holder.itemView.tvQuantity.text = fruits[position].quantity.toString()
    }

    override fun getItemCount(): Int {      //used to return the size/length of the view
        return fruits.size      //telling how many items to be shown on the screen
    }
}