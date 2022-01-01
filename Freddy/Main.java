import java.util.Scanner;

import models.Node;

public class Main
{
	public static void main(String[] args)
	{
		
		Freddy freddy = new Freddy();
		double[] distances = new double[]{5.0,3.0,1.0};
		double[] restTimes = new double[]{1.0,2.0,3.5};
		Node first = freddy.configure(distances,restTimes);


		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Jump in meters");
		double meters = scanner.nextDouble();
		scanner.close();
		
		freddy.jump(first,meters);
		
	}

}