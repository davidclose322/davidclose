public abstract class AbstractAnimal {
	protected Color color;
	
	public AbstractAnimal() {
		
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public abstract void draw();
}
