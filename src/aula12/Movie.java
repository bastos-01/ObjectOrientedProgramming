package aula12;

public class Movie{
	
	private String name;
	private Double score;
	private String rate;
	private String genre;
	private Double time;
	
	public Movie(String name, Double score, String rate, String genre, Double time) {
		this.name = name;
		this.score = score;
		this.rate = rate;
		this.genre = genre;
		this.time = time;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return  String.format("%-40s%15.1f%15s%15s%15.0f", name,score,rate,genre,time);
	}

	public Double getScore() {
		return score;
	}

	public Double getTime() {
		return time;
	}

	public void setTime(Double time) {
		this.time = time;
	}
	
	public String getGenre() {
		return genre;
	}


	
	
	
	
	
	

	
	

}
