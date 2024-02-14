package com.rplgames.activitymaster.todoapp.Categories

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rplgames.activitymaster.R
import com.rplgames.activitymaster.todoapp.TaskCategory

class CategoriesAdapter(private val categories:List<TaskCategory>, private val onItemSelected:(Int) -> Unit) :
    RecyclerView.Adapter<CategoriesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_task_categorie, parent,
            false)
        return CategoriesViewHolder(view)
        //Este codigo lo que hace es que hace un viewHolder para cada uno de los Items y dentro de
        // ViewHolder va a tener todo el Layout (es el que esta en CategoriesViewHolder)
        //CategoriesViewHolder(view: View)

    }

    //---------------------------------------------------------------------------------------------
    override fun getItemCount(): Int {
        //Lo que hace esto es que el listado simpre sera de 5 o el numero que le pongas
        return categories.size
    }

    //La funcion getItemCount() se puede simplificar

    //override fun getItemCount() = categories.size

    //---------------------------------------------------------------------------------------------

    override fun onBindViewHolder(holder: CategoriesViewHolder, position: Int) {
        holder.render(categories[position], onItemSelected)
    }


}