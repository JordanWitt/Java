package org.example.sectionFive.movies;
import java.util.Scanner;
import java.util.Arrays;

public class MovieApplication {
    public static void main(String[] args) {
        int attempt = 0;
        Scanner scanner = new Scanner(System.in);
        Movie[] movieList = Arrays.copyOf(MoviesArray.findAll(), 200);

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
            System.out.println("\t8 - Add a new movie");

            int decision = scanner.nextInt();
            attempt++;

            if (decision == 0) {
                break;
            } else if (decision == 1) {
                viewAllMovies(movieList);
            } else if (decision >= 2 && decision <= 7) {
                viewMoviesByCategory(movieList, decision);
            } else if (decision == 8) {
                addNewMovie(movieList, scanner);
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }

        System.out.println("See you later! Here's how many times you viewed our Movies: " + attempt);
        scanner.close();
    }

    private static void viewAllMovies(Movie[] movies) {
        System.out.println("All movies: ");
        for (Movie movie : movies) {
            if (movie != null) {
                System.out.println(movie.getName());
                System.out.println("--------------------");
            }
        }
    }

    private static void viewMoviesByCategory(Movie[] movies, int category) {
        String categoryName = getCategoryName(category);
        System.out.println(categoryName + " movies: ");
        for (Movie movie : movies) {
            if (movie != null && movie.getCategory().equalsIgnoreCase(categoryName)) {
                System.out.println(movie.getName());
                System.out.println("--------------------");
            }
        }
    }

    private static void addNewMovie(Movie[] movies, Scanner scanner) {
        scanner.nextLine(); // Consume the newline character

        System.out.println("Enter the name of the movie:");
        String name = scanner.nextLine();

        System.out.println("Enter the category of the movie:");
        String category = scanner.nextLine();

        Movie newMovie = new Movie(name, category);

        // Find the first available slot in the movie array
        int index = -1;
        for (int i = 0; i < movies.length; i++) {
            if (movies[i] == null) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            movies[index] = newMovie;
            System.out.println("Movie added successfully!");
        } else {
            System.out.println("Movie list is full. Unable to add a new movie.");
        }

        System.out.println("--------------------");
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
