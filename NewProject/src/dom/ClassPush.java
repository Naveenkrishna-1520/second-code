package dom;

import java.util.Scanner;

public class ClassPush {
static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter number");
		int n = sc.nextInt();
		if (n == 3) {
			System.out.println("Go to review");
		} else {
			System.out.println("Drop the review");
		}
	}
}