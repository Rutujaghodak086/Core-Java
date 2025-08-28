//vi.12345
//   23451
//   34521
//   45321
//   54321 

public class Pattern6{
	public static void main(String args[]){
		for(int i=1;i<=5;i++){
			for(int j=i;j<=5;j++){
				System.out.print(j);
			}
			for(int j=1;j<i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}
}