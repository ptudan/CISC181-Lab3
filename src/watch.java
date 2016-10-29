
public class watch {
	private int hour;
	private int minute;
	private int seconds;
	
	public watch(){
		hour = 12;
		minute = 00;
		seconds = 00;
	}
	
	public watch(int newHour){
		hour = newHour;
		minute = 00;
		seconds = 00;
	}
	
	public watch(int newHour, int newMinute){
		hour = newHour;
		minute = newMinute;
		seconds = 00;
	}
	
	public watch(int newHour, int newMinute, int newSeconds){
		hour = newHour;
		minute = newMinute;
		seconds = newSeconds;
	}
	
	public void setHour(int newHour){
		hour = newHour;
	}
	
	public void setMinute(int newMinute){
		minute = newMinute;
	}
	
	public void setSeconds(int newSeconds){
		seconds = newSeconds;
	}
	
	public void setValues(int newHour, int newMinute, int newSeconds){
		hour = newHour;
		minute = newMinute;
		seconds = newSeconds;
	}
	
	public String toString(){
		String m = "";
		String s = "";
		if(minute == 0){
			m = "00";
		}
		else{
			m = "" + minute;
		}
		
		if(seconds == 0){
			s = "00";
		}
		else{
			s = "" + seconds;
		}
		
		return(hour + ":" + m + ":" + s);
	}
	
}
