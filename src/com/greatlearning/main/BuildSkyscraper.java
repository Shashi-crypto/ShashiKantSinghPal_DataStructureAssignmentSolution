package com.greatlearning.main;

import java.util.Scanner;
import com.greatlearning.service.ConstructionOrder;

public class BuildSkyscraper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the total no of floors in the building ");

		int totalFloor = sc.nextInt();
		int[] floorSize = new int[totalFloor];
		// start from day 1
		int day = 1;

		for (int i = 0; i < totalFloor; i++) {

			System.out.println("enter the floor size given on day : " + day);
			floorSize[i] = sc.nextInt();
			day++;

		}
		
		ConstructionOrder order = new ConstructionOrder();
		order.constructionOrder(totalFloor, floorSize);
		
		sc.close();

	}

}
