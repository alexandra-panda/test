
public class Roof implements IRoof{

	@Override
	public boolean isLeaky() {
		return false;
	}

	@Override
	public void fixLeak() {
		try{
			System.out.println("Fixing roof...");
			Thread.sleep(1000);
			System.out.println("Roof fixed.");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
