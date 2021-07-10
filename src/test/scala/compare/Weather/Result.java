package compare.Weather;

public class Result {

	public static void main(String args[])
	{
		Weather uiObj= new UIAutomation().getUIData();
		Weather apiObj= new APIAutomation().getApidata("Bangalore", "7fe67bf08c80ded756e598d6f8fedaea");
		
		System.out.println(Weather.compareTemp(uiObj, apiObj,2));
		System.out.println(Weather.comparehumid(uiObj, apiObj, 10));
	}
}
