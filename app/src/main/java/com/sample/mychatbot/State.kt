package com.sample.mychatbot

sealed interface State {
    data object Idea : State
    data object Loading : State
    data class Success (val Data : String): State
    data class Error (val Error : String): State

}