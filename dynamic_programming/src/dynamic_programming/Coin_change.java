package dynamic_programming;
import java.util.*;
public class Coin_change {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3};
		int n=4;
	
		
		System.out.println(Solve(arr,n,arr.length));
	}

	private static long Solve(int[] arr, int n,int m) {
		
        long[] table = new long[n+1];
        table[0] = 1;
        for (int i=0; i<m; i++)
            for (int j=arr[i]; j<=n; j++)
                table[j] += table[j-arr[i]];
 
        return table[n];


	}
	
}
