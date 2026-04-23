import java.util.*;
public class Main
{
	public static void main(String[] args) {
	List<Integer>list=new ArrayList(Arrays.asList(1,2,3,4,5));
	int sum=0;
	for(int num:list){
	    sum=sum+num;
	}
	System.out.print(sum);
	}
}
