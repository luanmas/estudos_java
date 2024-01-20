package entities;

public class Comment {
	private String commentary;
	
	public Comment() {
	}
	
	public Comment(String commentary) {
		this.commentary = commentary;
	}

	public String getCommentary () {
		return this.commentary;
	}
	
	public void setCommentary (String commentary) {
		this.commentary = commentary;
	}
}
