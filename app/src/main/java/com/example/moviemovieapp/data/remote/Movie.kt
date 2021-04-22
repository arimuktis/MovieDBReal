 package com.example.moviemovieapp.data.remote


import com.google.gson.annotations.SerializedName

data class Movie(
    @SerializedName("dates")
    val dates: Dates,
    @SerializedName("page")
    val page: Int, // 1
    @SerializedName("results")
    val results: List<Result>,
    @SerializedName("total_pages")
    val totalPages: Int, // 46
    @SerializedName("total_results")
    val totalResults: Int // 907
) {
    data class Dates(
        @SerializedName("maximum")
        val maximum: String, // 2021-04-22
        @SerializedName("minimum")
        val minimum: String // 2021-03-05
    )

    data class Result(
        @SerializedName("adult")
        val adult: Boolean, // false
        @SerializedName("backdrop_path")
        val backdropPath: String, // /inJjDhCjfhh3RtrJWBmmDqeuSYC.jpg
        @SerializedName("genre_ids")
        val genreIds: List<Int>,
        @SerializedName("id")
        val id: Int, // 399566
        @SerializedName("original_language")
        val originalLanguage: String, // en
        @SerializedName("original_title")
        val originalTitle: String, // Godzilla vs. Kong
        @SerializedName("overview")
        val overview: String, // In a time when monsters walk the Earth, humanity’s fight for its future sets Godzilla and Kong on a collision course that will see the two most powerful forces of nature on the planet collide in a spectacular battle for the ages.
        @SerializedName("popularity")
        val popularity: Double, // 5405.33
        @SerializedName("poster_path")
        val posterPath: String, // /pgqgaUx1cJb5oZQQ5v0tNARCeBp.jpg
        @SerializedName("release_date")
        val releaseDate: String, // 2021-03-24
        @SerializedName("title")
        val title: String, // Godzilla vs. Kong
        @SerializedName("video")
        val video: Boolean, // false
        @SerializedName("vote_average")
        val voteAverage: Double, // 8.3
        @SerializedName("vote_count")
        val voteCount: Int // 4497
    )
}