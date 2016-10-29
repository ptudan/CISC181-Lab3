
public class myMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//testing watch class
		watch myWatch1 = new watch();
		System.out.println(myWatch1.toString());
		
		watch myWatch2 = new watch(18);
		System.out.println(myWatch2.toString());
		
		watch myWatch3 = new watch(18, 22);
		System.out.println(myWatch3.toString());
		
		watch myWatch4 = new watch(17, 17, 37);
		System.out.println(myWatch4.toString());
		
		myWatch1.setHour(8);
		System.out.println(myWatch1.toString());
		
		myWatch1.setMinute(17);
		System.out.println(myWatch1.toString());
		
		myWatch1.setSeconds(32);
		System.out.println(myWatch1.toString());
		
		myWatch2.setValues(16, 20, 45);
		System.out.println(myWatch2.toString());
		
		//testing student class
		int[]stu1Labs = {65, 76, 0, 0, 0};
		int[] stu1Tests = {87, 0, 0};
		student myStudent1 = new student(stu1Labs, stu1Tests, 2, 1);
		System.out.println(myStudent1.toString());
		
		myStudent1.addLab();
		System.out.println(myStudent1.toString()); //adding labs and tests, then printing
		myStudent1.addTest();					   //student as string to show update
		System.out.println(myStudent1.toString());
		myStudent1.addLab();
		System.out.println(myStudent1.toString());
		myStudent1.addTest();
		System.out.println(myStudent1.toString());
		myStudent1.addLab();
		System.out.println(myStudent1.toString());
		
		//testing fitWatch class
		fitWatch myfitWatch1 = new fitWatch();
		System.out.println(myfitWatch1.toString());
		double[] miles = {1.0, 2, 3, 4, 5, 6, 7};
		fitWatch myfitWatch2 = new fitWatch(miles);
		System.out.println(myfitWatch2.toString());
		double[] speeds = {6.0, 5.5, 6.5, 5.5, 6.5, 6.0, 7.0};
		fitWatch myfitWatch3 = new fitWatch(miles, speeds);
		System.out.println(myfitWatch3.toString());
		
		myfitWatch1.inputDistance(0); //testing input
		myfitWatch1.inputSpeed(0);
		myfitWatch1.inputDistance(1);
		myfitWatch1.inputSpeed(1);
		System.out.println(myfitWatch1.toString()); 
		
		myfitWatch1.reset(); //testing reset
		myfitWatch1.inputDistance(0);
		myfitWatch1.inputSpeed(0);
		myfitWatch1.inputDistance(1);
		myfitWatch1.inputSpeed(1);
		System.out.println(myfitWatch1.toString()); 
		
		System.out.println(myfitWatch1.ranFarther()); //testing compare
		System.out.println(myfitWatch1.ranFaster());
		
		
	}

}
