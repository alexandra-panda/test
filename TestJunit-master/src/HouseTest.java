import junit.framework.TestCase;

public class HouseTest extends TestCase {

	public Locator mockupLocator(){
		return new Locator(new Door(),new Window(),new Roof());
	}

	public void testDoor() {
		Locator locator = mockupLocator();
		House h = new House(locator);
		Door d = h.getDoor();
	}
	public void testRoof() {
		Locator locator = mockupLocator();
		House h = new House(locator);
		Roof r = h.getRoof();
	}
	public void testWindow() {
		Locator locator = mockupLocator();
		House h = new House(locator);
		Window w = h.getWindow();
	}
}
