import java.util.Arrays;

import javax.swing.JOptionPane;

public class fitWatch {
	private String name;
	private double[] milesArr;
	private double[] speedArr;
	private double curAvgDist;
	private double curAvgSpd;
	private double lastDist;
	private double lastSpd;
	
	public fitWatch(){
		milesArr = new double[] {0, 0, 0, 0, 0, 0, 0};
		speedArr = new double[] {0, 0, 0, 0, 0, 0, 0};
		curAvgDist = calcAvg(milesArr);
		curAvgSpd = calcAvg(speedArr);
		lastDist = 0.0;
		lastSpd = 0.0;
		name = JOptionPane.showInputDialog("Enter a name: ");
	}
	
	public fitWatch(double[] miles){
		milesArr = miles;
		speedArr = new double[] {0, 0, 0, 0, 0, 0, 0};
		curAvgDist = calcAvg(milesArr);
		curAvgSpd = calcAvg(speedArr);
		lastDist = 0.0;
		lastSpd = 0.0;
		name = JOptionPane.showInputDialog("Enter a name: ");
	}
	
	public fitWatch(double[] miles, double[] speeds){
		milesArr = miles;
		speedArr = speeds;
		curAvgDist = calcAvg(milesArr);
		curAvgSpd = calcAvg(speedArr);
		lastDist = 0.0;
		lastSpd = 0.0;
		name = JOptionPane.showInputDialog("Enter a name: ");
	}
	
	private double calcAvg(double[] vals){
		double totalVals = 0;
		for(double i : vals){
			totalVals += i;
		}
		return totalVals/7;
	}
	
	public String getMiles(){
		return(Arrays.toString(milesArr));
	}
	
	public String getSpeeds(){
		return(Arrays.toString(speedArr));
	}
	
	public double getAvgDist(){
		return curAvgDist;
	}
	
	public double getAvgSpd(){
		return curAvgSpd;
	}
	
	public double getLastDist(){
		return lastDist;
	}
	
	public double getLastSpd(){
		return lastSpd;
	}
	
	public void reset(){
		curAvgSpd = calcAvg(speedArr);
		curAvgDist = calcAvg(milesArr);
		lastDist = curAvgDist;
		lastSpd = curAvgSpd;
		for(int i = 0; i<7; i++){
			milesArr[i] = 0.0;
			speedArr[i] = 0.0;
		}
		curAvgSpd = calcAvg(speedArr);
		curAvgDist = calcAvg(milesArr);
	}
	
	public boolean ranFarther(){
		double totalMiles = 0.0;
		for(double i : milesArr){
			totalMiles += i;
		}
		
		if(totalMiles>(lastDist*7)){
			return true;
		}
		return false;
	}
	
	public boolean ranFaster(){
		curAvgSpd = calcAvg(speedArr);
		if(curAvgSpd > lastSpd){
			return true;
		}
		return false;
	}
	
	public void inputDistance(int index){
		double distance = Double.parseDouble(JOptionPane.showInputDialog("Enter Distance: "));
		milesArr[index] = distance;
	}
	
	public void inputSpeed(int index){
		double speed = Double.parseDouble(JOptionPane.showInputDialog("Enter Speed: "));
		speedArr[index] = speed;
	}
	
	public String toString(){
		return(name + " Miles: " + Arrays.toString(milesArr)+ " Speeds : "
				+ Arrays.toString(speedArr) + " Average Mileage: " + curAvgDist 
				+ " Average Speed: " + curAvgSpd + " Last Average Mileage: " +
				lastDist + " Last Average Speed: " + lastSpd);
	}
	
	
}
