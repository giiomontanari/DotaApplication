package com.giovanni.dotaapplication.core.commons

interface State<out T> {
    object Loading : State<Nothing>
    object Error : State<Nothing>
    data class Success<T>(val data: T) : State<T>
}