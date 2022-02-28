package dynamic_programming;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class kanpsack01 {

	public static void main(String[] args) {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=3;
		int val[]= {1,2,3};
		int wt[]=  {4,5,1};
		int W=4;
		System.out.println(rec(wt,val,W));
	}

	public static int rec(int[] wt, int[] val, int w) {
		
		return rec(wt,val,w,0);
	}
    public static int rec(int[] wt, int[] val, int w,int i) {
		
		if(i==wt.length||w==0)
			return 0;
		if(wt[i]>w) {
			return rec(wt,val,w,i+1);
		}else {
			
			int op1=val[i]+rec(wt,val,w-wt[i],i+1);
			int op2=rec(wt,val,w,i+1);
			return Math.max(op1, op2);
		}
	}
}
