//Nicolina Sandoval
//APCS 3rd
//August 29,2019
public class Calculate {
	public static int square(int number) {
		//A call to square returns the square of the value passed. The method accepts an integer and returns an integer.
		int answer =0;
		answer = number * number;
		return answer;
	}
	public static int cube(int number) {
		//A call to cube returns the cube of the value passed. The method accepts an integer and returns an integer.
		int answer =0;
		answer = number * number * number;
		return answer;
	}
	public static double average(double numberx, double numbery) {
		//A call to average returns the average of the value passed. The method accepts two doubles and returns a double.
		double answer =0;
		answer = (numberx + numbery) /2;
		return answer;
	}
	public static double average(double numberx, double numbery, double numberz) {
		//A call to average returns the average of the value passed. The method accepts three doubles and returns a double.
		double answer =0;
		answer = (numberx + numbery + numberz) /3;
		return answer;
	}
	public static double toDegrees(double number) {
		//A call to toDegrees converts an angle measure from radians to degrees. The method accepts a doubles and returns a double.
		double answer =0;
		answer = number * 180 /3.14159;
		return answer;
	}
	public static double toRadians(double number) {
		//A call to toRadians converts an angle measure from degrees to radians. The method accepts a doubles and returns a double.
		double answer =0;
		answer = number * 3.14159 /180;
		return answer;
	}
	public static int toImproperFrac(int numberx, int numbery, int numberz) {
		//A call to toRadians converts an angle measure from degrees to radians. The method accepts a doubles and returns a double.
		double answer =0;
		answer = number * 3.14159 /180;
		return answer;
	}
}