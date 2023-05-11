package org.example.sectionFive.movies;

import org.example.sectionFive.util.Input;

import java.util.Arrays;

public class MovieApplication {
    public static void main(String[] args) {
        int attempt = 0;
        Input movie = new Input();
        Movie[] movieList = Arrays.copyOf(MoviesArray.findAll(), 100);

        System.out.println("-----------------------MOVIES-----------------------");
        System.out.println();

        while (true) {
            System.out.println("\tWhat would you like to do?");
            System.out.println("\t0 - Exit");
            System.out.println("\t1 - View all movies");
            System.out.println("\t2 - View movies in animated category");
            System.out.println("\t3 - View movies in drama category");
            System.out.println("\t4 - View movies in horror category");
            System.out.println("\t5 - View movies in sci-fi category");
            System.out.println("\t6 - View movies in musical category");
            System.out.println("\t7 - View movies in comedy category");

            int decision = movie.getInt();
            attempt++;

            if (decision == 0) {
                break;
            } else if (decision == 1) {
                viewAllMovies(movieList);
            } else if (decision >= 2 && decision <= 7) {
                viewMoviesByCategory(movieList, decision);
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }

        System.out.println("See you later! Here's how many times you viewed our Movies: " + attempt);
    }

    private static void viewAllMovies(Movie[] movies) {
        System.out.println("All movies: ");
        for (Movie movie : movies) {
            System.out.println(movie.getName());
            System.out.println("--------------------");
        }
    }

    private static void viewMoviesByCategory(Movie[] movies, int category) {
        String categoryName = getCategoryName(category);
        System.out.println(categoryName + " movies: ");
        for (Movie movie : movies) {
            if (movie.getCategory().equals(categoryName.toLowerCase())) {
                System.out.println(movie.getName());
                System.out.println("--------------------");
            }
        }
    }

    private static String getCategoryName(int category) {
        return switch (category) {
            case 2 -> "Animated";
            case 3 -> "Drama";
            case 4 -> "Horror";
            case 5 -> "Sci-Fi";
            case 6 -> "Musical";
            case 7 -> "Comedy";
            default -> "";
        };
    }
}
