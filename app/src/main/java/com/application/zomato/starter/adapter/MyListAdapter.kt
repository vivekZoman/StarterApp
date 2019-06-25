package com.application.zomato.starter.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.application.zomato.starter.R
import java.util.ArrayList
import android.util.Log
import android.widget.Toast
import com.application.zomato.starter.data.Restaurant

class MyListAdapter : RecyclerView.Adapter<MyListAdapter.ViewHolder>() {

    /**
     * Change the type of data in list to support your data
     */
    var items : List<Restaurant> = ArrayList()

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {

        /**
         * change R.id.layout_item_basic to your layout id
         */
    Log.v("testing","OncreateHolder")
        val view = LayoutInflater.from(p0.context).inflate(R.layout.frameimage,p0, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.v("testing","OnBindViewHolder")

        holder.bindData(items[position])
    }

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {

        init{
            view.setOnClickListener ( object: View.OnClickListener{
                override fun onClick( v: View?){
                    Toast.makeText(v?.context, "Restaurant name is: "+restro?.restaurantName, Toast.LENGTH_LONG).show()
                }
            })
        }

       // private val textView : TextView = view.findViewById(R.id.text)
        private val nameView :TextView = view.findViewById(R.id.name)
        private val addressView :TextView = view.findViewById(R.id.address)

        private val descriptionView :TextView = view.findViewById(R.id.description)

        var restro : Restaurant?= null

        fun bindData(s : Restaurant) {
            /**
             * use data and set on the view
             */
            restro = s;
            nameView.text = s.restaurantName;
            addressView.text  = s.restaurantAddress;
            descriptionView.text = s.description;

            //textView.text = s
        }

    }
}