package freeorgExasJavaBasics;

import java.util.Arrays;
import java.util.Scanner;

public class KthLargestSmallestElement {

	public static void main(String[] args) {
		int z[] = {  7, 1, 475, 4, 5, 8, 2 };

		Scanner sc = new Scanner(System.in);
		System.out.println("Input the kth index ");
		int k = sc.nextInt();

		for (int i = 0; i < z.length; i++) {// array sorting in descending order
			int temp = 0;
			for (int j = i + 1; j < z.length; j++) {
				if (z[i] < z[j]) {
					temp=z[j];
					z[j]=z[i];
					z[i]=temp;
				}
			}
		}
		
		for (int i = 0; i < z.length; i++) {
			if(i!=z.length-1)
				System.out.print(z[i]+",");
			else
				System.out.print(z[i]);
		}
		
		System.out.println();

		System.out.println(z[k-1]);

	}

}
