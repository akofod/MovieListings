package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Movie implements Serializable {
	private static final long serialVersionUID = 1L;
	private String title;
	private String rating;
	private String runtime;
	private String description;
	private ArrayList<String> showings;
	
	public Movie() {}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getRuntime() {
		return runtime;
	}

	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ArrayList<String> getShowings() {
		return showings;
	}

	public void setShowings(ArrayList<String> showings) {
		this.showings = showings;
	}
}
