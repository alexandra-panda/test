
public class Door implements IDoor{
	
	@Override
	public void openDoor() {
		try{
			System.out.println("Opening door...");
			Thread.sleep(1000);
			System.out.println("Door opened.");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public void closeDoor() {
		try{
			System.out.println("Closing door...");
			Thread.sleep(1000);
			System.out.println("Door closed.");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
