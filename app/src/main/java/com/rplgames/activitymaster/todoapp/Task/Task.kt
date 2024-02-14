package com.rplgames.activitymaster.todoapp.Task

import com.rplgames.activitymaster.todoapp.TaskCategory

// val name es el nombre de la tarea
// TaskCategory es para saber las categorias
// isSelected es para es para que comience deseleccionada la celda
data class Task(val name:String, val category: TaskCategory, var isSelected:Boolean = false){

}