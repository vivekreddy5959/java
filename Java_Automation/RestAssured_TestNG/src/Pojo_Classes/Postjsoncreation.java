package Pojo_Classes;

public class Postjsoncreation {
	private int userId;
	private String title;
	private String body;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}

	  public Postjsoncreation(int userId, String title, String body) {
	        this.userId = userId;
	        this.title = title;
	        this.body = body;
	    }

}
