
import java.util.Scanner;
public class CuboidSurfaceArea{
	public static void main(String args[]){
		int l,b,h;
		float SurfaceArea,Volume;
		Scanner sc=new Scanner(System.in);
		System.out.println("Length :");
		l=sc.nextInt();
		System.out.println("Breadth :");
		b=sc.nextInt();
		System.out.println("Height :");
		h=sc.nextInt();
		SurfaceArea=2*(l*b+l*h+b*h);
		Volume=l*b*h;
		System.out.println("Surface Area :"+SurfaceArea);
		System.out.println("Volume :"+Volume);
	}
    }