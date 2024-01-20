package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date moment;
	private String title;
	private String content;
	private List<Comment> comments = new ArrayList<>();
	private Integer likes;

	public Post() {
	}

	public Post(Date moment, String title, String content, Integer likes) {
		this.content = content;
		this.moment = moment;
		this.title = title;
		this.likes = likes;
	}
	
	public Integer getLikes() {
		return this.likes;
	}
	
	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public List<Comment> getComments() {
		return this.comments;
	}
	
	public void addComment(Comment comment) {
		this.comments.add(comment);
	}
	
	public String toString () {
		StringBuilder sb = new StringBuilder();
		sb.append(this.title + "\n");
		sb.append(this.likes + " Likes - ");
		sb.append(sdf.format(this.moment) + "\n");
		sb.append(this.content + "\n");
		sb.append("Comments: \n");
		
		for(Comment c: comments) {
			sb.append(c.getCommentary() + "\n");
		}
		
		return sb.toString();
	}
	
	
}
