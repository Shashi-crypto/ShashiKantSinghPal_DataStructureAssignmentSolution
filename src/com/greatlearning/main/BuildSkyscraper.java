package com.greatlearning.main;

import java.util.PriorityQueue;
import java.util.Scanner;

public class BuildSkyscraper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the total no of floors in the building ");

		int totalFloor = sc.nextInt();
		int[] floorSize = new int[totalFloor];
		int day = 1;

		for (int i = 0; i < totalFloor; i++) {

			System.out.println("enter the floor size given on day : " + day);
			floorSize[i] = sc.nextInt();
			day++;

		}
		/*
		 * reversing the order as we need to place/arrange the greater value floor size first and in
		 * priority queue they are arranged in ascending order number
		 */		
		PriorityQueue<Integer> queue = new PriorityQueue<>(java.util.Collections.reverseOrder());

		// reset the day value to day 1 work
		day = 1;
		int max = totalFloor;
		
		System.out.println(" ");
		System.out.println("The order of construction is as follows");
		System.out.println(" ");

		for (int i = 0; i < totalFloor; i++) {

			queue.add(floorSize[i]);
			System.out.println("Day " + day + ":");

			while (!queue.isEmpty() && queue.peek() == max) {

				System.out.print(queue.poll() + " ");
				max--;

			}

			System.out.println(" ");
			day++;

		}

		sc.close();

	}

}
