package dynamic_programming;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class interleavingString {

	public static void main(String[] args) {
		
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String A="XY";
		String B="X";
		String C="XXY";
		Boolean dp[][]=new Boolean[A.length()+1][B.length()+1];
		System.out.println(Solve(A,B,C,0,0,dp));
		System.out.println(Solve(A,B,C, dp));
	}

	public static boolean Solve(String a,String b,String c,Boolean dp[][]) {
		for(int i=0;i<=a.length();i++) {
			
			
			for(int j=0;j<=b.length();j++) {
				
				if(i==0&&j==0) {
					
					dp[i][j]=true;
				}else if(i==0) {
					
					
				}else if(j==0) {
					
					
				}
			}
		}
		
		return dp[a.length()][b.length()];
	}
	public static boolean Solve(String a, String b, String c, int i, int j,Boolean dp[][]) {
		
		if(i==a.length()&&j==b.length()) {
			
			return true;
		}
		if(dp[i][j]!=null) {
			return dp[i][j];
		}
		if(i<a.length()&&a.charAt(i)==c.charAt(i+j)) {
			
			boolean f1=Solve(a,b,c,i+1,j,dp);
			dp[i][j]=f1;
			if(f1==true) {
				return true;
			}
		}
        if(j<b.length()&&b.charAt(j)==c.charAt(i+j)) {
			
			boolean f2=Solve(a,b,c,i,j+1,dp);
			dp[i][j]=f2;
			if(f2==true) {
				return true;
			}
		}
        dp[i][j]=false;
		return false ;
	}

}
