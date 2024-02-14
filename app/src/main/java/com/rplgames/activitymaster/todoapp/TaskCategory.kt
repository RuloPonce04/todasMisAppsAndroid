package com.rplgames.activitymaster.todoapp

sealed class TaskCategory(var isSelected:Boolean = true) {
    //si no comparten el mismo atributo se usaria este y no se pondria nada en el class TaskCategori
    //data class Personal(var isSelected:Boolean) : TaskCategory()
    //pero como si es el mismo atributo lo dejamos como objetos
    object Personal : TaskCategory()
    object Business : TaskCategory()
    object Other : TaskCategory()
}
