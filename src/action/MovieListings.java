package action;

import java.util.Collection;

import model.Movie;
import model.MovieDAO;

import com.opensymphony.xwork2.ActionSupport;

public class MovieListings extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private String movieID;
	private Movie selectedMovie;
	private Collection<Movie> allMovies;

	public String selectOne() {
		MovieDAO m = new MovieDAO();
		this.selectedMovie = m.getMovie(this.movieID);
		return SUCCESS;
	}
	
	public String selectAll() {
		MovieDAO m = new MovieDAO();
		this.allMovies = m.getMovieList();
		return SUCCESS;
	}

	public String getMovieID() {
		return movieID;
	}

	public void setMovieID(String movieID) {
		this.movieID = movieID;
	}

	public Movie getSelectedMovie() {
		return selectedMovie;
	}

	public void setSelectedMovie(Movie selectedMovie) {
		this.selectedMovie = selectedMovie;
	}

	public Collection<Movie> getAllMovies() {
		return allMovies;
	}

	public void setAllMovies(Collection<Movie> allMovies) {
		this.allMovies = allMovies;
	}
}
