
import java.util.Scanner;
public class XiaolinSequence {

	public static void main(String[] args){
		System.out.print("Enter a limit on the largest number to be displayed: ");
		Scanner scan = new Scanner(System.in);
		int max = scan.nextInt();
		int first = 1;
		int second = 1;
		int next;
		
		System.out.print(first + "," + second);
		next = first + second;
		while(next < max){
		first = second;
		second =next;
		System.out.print("," + next);
		next =first + second;
		}
		System.out.println();
		}
}
