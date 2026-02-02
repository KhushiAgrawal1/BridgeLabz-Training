package com.Stream_API.Top_5_Trending_Movies;

class Movie {
    String name;
    double rating;
    int releaseYear;

    Movie(String name, double rating, int releaseYear) {
        this.name = name;
        this.rating = rating;
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return name + " | Rating: " + rating + " | Year: " + releaseYear;
    }
}

