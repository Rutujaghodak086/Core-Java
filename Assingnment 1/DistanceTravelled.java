import java.util.Scanner;
class DistanceTravelled{
	public static void main(String args[]){
		float initialvelocity,acceleration,time;
		double finalVelocity,distance;
		Scanner sc=new Scanner(System.in);
		System.out.println("Initial Velocity :");
		initialvelocity=sc.nextFloat();
		System.out.println("Acceleration :");
		acceleration=sc.nextFloat();
		System.out.println("Time :");
		time=sc.nextFloat();
		finalVelocity=initialvelocity+acceleration*time;

		distance=(initialvelocity*time)+(1*acceleration*time*time)/2;

		System.out.println("Final Velocity :"+finalVelocity);
		System.out.println("Distence :"+distance);
	}
}
		