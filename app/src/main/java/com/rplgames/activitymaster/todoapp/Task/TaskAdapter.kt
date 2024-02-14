package com.rplgames.activitymaster.todoapp.Task

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rplgames.activitymaster.R
//Lo que pongas dentro de  private val onTaskSelected: (Int) parentesis de es lo que va a devolver
class TaskAdapter (var tasks:List<Task>, private val onTaskSelected: (Int) -> Unit) : RecyclerView.Adapter<TaskViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_todo_task, parent,
            false)
        return TaskViewHolder(view)
    }

    override fun getItemCount() = tasks.size

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder.render(tasks[position])
        holder.itemView.setOnClickListener{ onTaskSelected(position)}
    }

}