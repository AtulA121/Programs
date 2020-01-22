import java.util.*;
class findShuffleIndexOfBall {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=1;
		int hIndex=-1;
		for(int i=1;i<=3;i++){
			System.out.print("Enter first Change : ");
			int c1=sc.nextInt();
			System.out.print("Enter Second Change : ");
			int c2=sc.nextInt();
			if(c1 == n){
				hIndex=c2;
			}
			
			if(c2 == n){
				hIndex=c1;
			}
		}
		System.out.println("Hold Index : "+hIndex);
	}
}