import java.util.Scanner;

public class echo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max = scan.nextInt();
		String[] a = new String[max+1];
		for(int i = 0; i < a.length; i++) {
			a[i] = scan.nextLine();
		}
		for(int i = 0; i < a.length; i++) {
			if(i%2 != 0) {
				System.out.println(a[i]);
			}
		}
		scan.close();
	}
}
