package hands_on_2;
import java.util.Scanner;

public class Main {
	private static final double[][] dataSet = {{23, 651},{26, 762},{30, 856},{34, 1063},{43, 1190},{48, 1298},{52, 1421},{57, 1440}, {58, 1518}};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el advertising (Millones): ");
		int x = sc.nextInt();
		// TODO Auto-generated method stub
		GradientDescent gradient = new GradientDescent(168,23);
		gradient.train(0.000001, dataSet);
		System.out.println("BETHA_0: " + gradient.getBetha_0() + " - BETHA_1: " + gradient.getBetha_1());
	    System.out.println("PREDICTION: " + gradient.getHypothesisResult(x));
		
	}

}
