import java.util.Scanner;
class DimensionsCylinder{
	public static void main(String args[]){
		int r,h;
		double SurfaceArea,Volume;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a radius :");
		r=sc.nextInt();
		System.out.println("Enter a Base :");
		h=sc.nextInt();
		SurfaceArea=2*Math.PI*r*r+2*Math.PI*r*h;
		Volume=Math.PI*r*r*h;
		System.out.println("Surface Area is :"+SurfaceArea);
		System.out.println("Surface Volume :"+Volume);
	}
     }