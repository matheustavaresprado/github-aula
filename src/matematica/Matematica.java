package matematica;

public class Matematica {

	public static double[] baskara(double a, double b, double c){
		double[] resp = new double[2];
		
		resp[0] = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a);
		resp[1] = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a);
		
		return resp;
	}
	
}
