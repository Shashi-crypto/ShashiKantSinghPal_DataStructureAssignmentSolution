package com.greatlearning.service;

import java.util.PriorityQueue;

public class ConstructionOrder {
	
	public void constructionOrder(int totalFloor, int[] floorSize) {
		/*
		 * reversing the order as we need to place/arrange the greater value floor size first and in
		 * priority queue they are arranged in ascending order number
		 */		
		PriorityQueue<Integer> queue = new PriorityQueue<>(java.util.Collections.reverseOrder());

		// start from day 1 work
		int day = 1;
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
	}

}
