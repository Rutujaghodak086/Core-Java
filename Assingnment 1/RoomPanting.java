//Consider a room having one door and two windows both of the same size. Accept dimensions of the room, door and window. //Print the area to be painted (interior walls) and area to be whitewashed (roof).

import java.util.Scanner;
public class RoomPanting{
	public static void main(String args[]){
		float l,b,h,dh,dw,wh,ww;
		float wall_area,door_area,window_area,paintes_area,roof_area;
		
		Scanner sc=new Scanner(System.in);
		
		//ROOM Dimensions
		System.out.println("Enter Room Length :");
		l=sc.nextInt();
		System.out.println("Enter Room Breadth :");
		b=sc.nextInt();
		System.out.println("Enter Room Height :");
		h=sc.nextInt();
		
		//DOOR Dimensions
		System.out.println("Enter Door Height :");
		dh=sc.nextInt();
		System.out.println("Enter Door Width :");
		dw=sc.nextInt();

		//WINDOW Dimensios
		System.out.println("Enter Window Heigth :");
		wh=sc.nextInt();
		System.out.println("Enter Window Width :");
		ww=sc.nextInt();

		wall_area=2 *(l*h)+2*(b*h);			
		door_area=dh*dw;
		window_area=2*(ww*wh);
		
		paintes_area=wall_area - door_area - window_area;
		roof_area=l*b;

		System.out.println("Area to be painted (wall):"+paintes_area);
		System.out.println("Area to be Roof :"+roof_area);
		}
	}
		