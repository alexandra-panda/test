
public class Locator {
	Door door;
	Window window;
	Roof roof;
	public Locator(Door door, Window window, Roof roof){
		this.door = door;
		this.window = window;
		this.roof = roof;
	}
	protected Door getDoor(){
		return door;
	}
	protected Roof getRoof(){
		return roof;
	}
	protected Window getWindow(){
		return window;
	}
}


