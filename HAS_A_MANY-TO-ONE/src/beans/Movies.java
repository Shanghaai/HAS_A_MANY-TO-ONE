package beans;

public class Movies {

	private String movieName;
	private int mid;
	private Actor actorName;
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public Actor getActorName() {
		return actorName;
	}
	public void setActorName(Actor actorName) {
		this.actorName = actorName;
	}
}
