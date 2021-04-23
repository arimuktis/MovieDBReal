package com.example.moviemovieapp.ui.movie

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.example.moviemovieapp.data.remote.MovieRepository

class MovieViewModel @ViewModelInject constructor (private  val repository: MovieRepository) : ViewModel() {
}