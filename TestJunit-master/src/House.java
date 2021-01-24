public class House {
	Door door;
	Window window;
	Roof roof;

	House(Locator locator) {
		door = locator.getDoor();
		window = locator.getWindow();
		roof = locator.getRoof();
	}

	public Door getDoor() {
		return door;
	}

	public void setDoor(Door door) {
		this.door = door;
	}

	public Window getWindow() {
		return window;
	}

	public void setWindow(Window window) {
		this.window = window;
	}

	public Roof getRoof() {
		return roof;
	}

	public void setRoof(Roof roof) {
		this.roof = roof;
	}
}