package model;

/**
 * @author alexh - aheinrichs
 * CIS175 - Fall 2022
 * Sep 21, 2022
 */
public class MessageDisplay {
	
	private String message;
	private int size;
	private String color;
	private String font;

	public MessageDisplay() {
		super();
	}
	
	public MessageDisplay(String message, int size, String color, String font) {
		this.message = message;
		this.size = size;
		this.color = color;
		this.font = font;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFont() {
		return font;
	}

	public void setFont(String font) {
		this.font = font;
	}

}
