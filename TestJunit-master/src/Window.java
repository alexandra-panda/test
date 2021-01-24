
public class Window implements IWindow{

	@Override
	public void openWindow() {
		try{
			System.out.println("Opening window...");
			Thread.sleep(1000);
			System.out.println("Window opened.");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public void closeWindow() {
		try{
			System.out.println("Closing window...");
			Thread.sleep(1000);
			System.out.println("Window closed.");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
