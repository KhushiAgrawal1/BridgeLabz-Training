package com.Stream_API.Top_5_Trending_Movies;

import java.util.*;
import java.util.stream.*;

public class TopTrendingMovies {

    public static void main(String[] args) {

        List<Movie> movies = Arrays.asList(
                new Movie("Inception", 8.8, 2010),
                new Movie("Interstellar", 8.6, 2014),
                new Movie("Avengers: Endgame", 8.4, 2019),
                new Movie("Joker", 8.5, 2019),
                new Movie("Dune", 8.2, 2021),
                new Movie("Tenet", 7.5, 2020),
                new Movie("Avatar 2", 7.8, 2022)
        );
        
 List<Movie> top5Movies = movies.stream().filter(m -> m.releaseYear > 2010)
 .sorted(Comparator.comparingDouble((Movie m) -> m.rating).
 reversed().thenComparingInt(m -> m.releaseYear).reversed()).limit(5).collect(Collectors.toList());

        // Print result
        top5Movies.forEach(System.out::println);
    }
}

