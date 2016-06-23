import java.util.Scanner;


public class IteratedSums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int b=scn.nextInt();
		int res=0;
		for(int i=a;i<=b;i++){
			res=res+i*i;
		}
		System.out.println(res);
		
	}

}
