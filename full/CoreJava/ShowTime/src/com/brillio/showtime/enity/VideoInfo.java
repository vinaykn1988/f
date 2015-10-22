package com.brillio.showtime.enity;

public class VideoInfo {
	private int videoId;
	private String title;
	private int year;
	private String director;
	private String cast;
	private String genre;
	private String vLanguage;
	private String movieIndustry;
	private float imdbRating;
	private String imagePath;
	public VideoInfo() {
		// TODO Auto-generated constructor stub
	}
	public VideoInfo(int videoId, String title, int year, String director, String cast, String genre, String vLanguage,
			String movieIndustry, float imdbRating, String imagePath) {
		this.videoId = videoId;
		this.title = title;
		this.year = year;
		this.director = director;
		this.cast = cast;
		this.genre = genre;
		this.vLanguage = vLanguage;
		this.movieIndustry = movieIndustry;
		this.imdbRating = imdbRating;
		this.imagePath = imagePath;
	}
	public int getVideoId() {
		return videoId;
	}
	public void setVideoId(int videoId) {
		this.videoId = videoId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getCast() {
		return cast;
	}
	public void setCast(String cast) {
		this.cast = cast;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getvLanguage() {
		return vLanguage;
	}
	public void setvLanguage(String vLanguage) {
		this.vLanguage = vLanguage;
	}
	public String getMovieIndustry() {
		return movieIndustry;
	}
	public void setMovieIndustry(String movieIndustry) {
		this.movieIndustry = movieIndustry;
	}
	public float getImdbRating() {
		return imdbRating;
	}
	public void setImdbRating(float imdbRating) {
		this.imdbRating = imdbRating;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	@Override
	public String toString() {
		return String.format(
				"VideoInfo [videoId=%s, title=%s, year=%s, director=%s, cast=%s, genre=%s, vLanguage=%s, movieIndustry=%s, imdbRating=%s, imagePath=%s]",
				videoId, title, year, director, cast, genre, vLanguage, movieIndustry, imdbRating, imagePath);
	}
	
}
