package dynamic_programming;
import java.util.*;
class compa implements Comparator<student>{

	
	public int compare(student o1, student o2) {
		
		return o1.roll-o2.roll;
	}
	
	
}
class student{
	int roll;
	String name;
	String add;
	student(int roll,String name,String add){
		
		this.roll=roll;
		this.name=name;
		this.add=add;
	}
	
}
public class LCS {

	public static void main(String[] args) {
		
		student arr[]=new student[5];
	//BufferedReader br=new BufferedReader(new InputStreamReader());
		Scanner scn=new Scanner(System.in);
//		for(int i=0;i<5;i++) {
//			
//			int roll=scn.nextInt();
//			String name=scn.next();
//			String add=scn.next();
//			arr[i]=new student(roll,name,add);
//		}
		arr[0]=new student(3,"raman","patna");
		arr[1]=new student(4,"raj","arwal");
		arr[2]=new student(1,"santosh","gaya");
		arr[3]=new student(2,"nischay","punpun");
		arr[4]=new student(5,"basant","khagriya");
		//Arrays.sort(arr,new compa());
for(int i=0;i<5;i++) {
			
		  System.out.println(arr[i].roll+" "+arr[i].name+" "+arr[i].add);
		}
	}
}
