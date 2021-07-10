package compare.Weather;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class APIAutomation {
	
	JsonPath js;
	
	public Weather getApidata(String city, String key)
	{
		RestAssured.baseURI = "https://api.openweathermap.org/data/2.5/";
		RequestSpecification request = RestAssured.given();
		Response response = request.queryParam("q",city)
        							.queryParam("appid", key)
        							.get("/weather");
		 
		 js = response.jsonPath();
		 
		Float temp = js.get("main.temp");
		Float tempInCelsius = temp-(float)273.15;
		
		Integer humid = js.get("main.humidity");
		System.out.println("From API  temp-"+tempInCelsius+" Humidity-"+humid);
		 Weather obj1= new Weather();
	        obj1.setTemp(tempInCelsius.toString());
	        obj1.setHumid(humid.toString());
	        return obj1;
	}
	
	
	
	
}
