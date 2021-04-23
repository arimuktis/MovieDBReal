package com.example.moviemovieapp.data.remote


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Movie(
    val adult: Boolean, // false
    val backdrop_path: String, // /inJjDhCjfhh3RtrJWBmmDqeuSYC.jpg
    val genre_ids: List<Int>,
    val id: Int, // 399566
    val original_language: String, // en
    val original_title: String, // Godzilla vs. Kong
    val overview: String, // In a time when monsters walk the Earth, humanity’s fight for its future sets Godzilla and Kong on a collision course that will see the two most powerful forces of nature on the planet collide in a spectacular battle for the ages.
    val popularity: Double, // 5405.33
    val poster_path: String, // /pgqgaUx1cJb5oZQQ5v0tNARCeBp.jpg
    val release_date: String, // 2021-03-24
    val title: String, // Godzilla vs. Kong
    val video: Boolean, // false
    val vote_average: Double, // 8.3
    val vote_count: Int // 4497
) : Parcelable {
    val baseImageUrl: String get() = "https://image.tmdb.org/t/p/w500"
}