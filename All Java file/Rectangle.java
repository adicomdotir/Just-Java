public class Rectangle {
	private float length;
	private float width;

	public Rectangle() {
		length = 1.0f;
		width = 1.0f;
	}

	public Rectangle(float l, float w) {
		length = l;
		width = w;
	}

	public void setLength(float length) { this.length = length; }
	public float getLength() { return length; }
	public void setWidth(float width) { this.width = width; }
	public float getWidth() { return width; }

	public double getArea() {
		return width * length;
	}

	public double getPerimeter() {
		return 2 * (width + length);
	}

	@Override
	public String toString() {
		return "Rectangle[length=" + getLength() + ",width=" + getWidth() + "]";
	}
}