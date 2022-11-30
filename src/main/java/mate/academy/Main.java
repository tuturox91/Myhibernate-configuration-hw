package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        movieService.add(new Movie("Mad Max","Fire road"));
        movieService.add(new Movie("Man of steel","Terminators is here"));
        movieService.add(new Movie("Lion Killer","Girl with sniper rifle"));
        Movie movie = movieService.get(1L);
        Movie movie1 = movieService.get(2L);
    }
}
