package dynamic_programming;
import java.util.*;
public class make_parenthessis {

	public static void main(String[] args) {
		
		int n=3;
		List<String>res=solve(n);
		for(String s:res)
		System.out.println(s);
	}

	private static List<String> solve(int n) {

		List<String>t=new ArrayList<>();
		makeParenthesis("",0,0,t,n);
		return t;
	}

	private static void makeParenthesis(String s, int i, int j, List<String> t, int n) {
		
		if(s.length()==2*n) {
			t.add(s);
			return;
		}
		if(i<n)makeParenthesis(s+"{",i+1,j, t, n);
		if(j<i)makeParenthesis(s+"}",i,j+1, t, n);
	}
}
