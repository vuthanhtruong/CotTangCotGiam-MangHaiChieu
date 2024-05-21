package truongne;

import java.util.Scanner;

public class truongday {

    public static void main(String[] args) {
    	System.out.println("Moi ban nhap canh hinh vuong");
    	int n=new Scanner(System.in).nextInt();
    	int M[][]=new int[n][n];
    	int h1=0;
    	int h2=n-1;
    	int c1=0;
    	int c2=n-1;
    	int count=0;
    	int trunks=0;
    	while(c1<=c2) {
    		if(trunks%2==0) {
    			for(int i=h1;i<=h2;i++) {
        			M[i][c1]=count;
        			count++;
        		}
    		}
    		else {
    			for(int i=h2;i>=h1;i--) {
        			M[i][c1]=count;
        			count++;
        		}
    		}
    		trunks++;
    		c1++;
    	}
    	for(int i=0;i<n;i++) {
    		for(int j=0;j<n;j++) {
    			System.out.print(M[i][j]+" ");
    		}
    		System.out.println();
    	}
    }
}
