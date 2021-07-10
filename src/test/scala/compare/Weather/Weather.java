package compare.Weather;
import java.lang.Math;
public class Weather {

	private String temp;
	private String humid;
	public String getTemp() {
		return temp;
	}
	public void setTemp(String temp) {
		this.temp = temp;
	}
	public String getHumid() {
		return humid;
	}
	public void setHumid(String humid) {
		this.humid = humid;
	}
	public static boolean compareTemp(Weather obj1, Weather obj2,int tempVariance) {
		
		
		if(Math.abs(Integer.parseInt(obj1.temp)-Float.parseFloat(obj2.temp))<= tempVariance)
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
		
	}
public static boolean comparehumid(Weather obj1, Weather obj2,int humidvariance) {
		
		
		if(Math.abs(Integer.parseInt(obj1.humid)-Integer.parseInt(obj2.humid))<= humidvariance)
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
		
	}
}

