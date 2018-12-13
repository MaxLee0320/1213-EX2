package com.pccu.student;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int studentSize = 3;
		IStudent[] studentAry;
		studentAry=new IStudent[studentSize];

		for(int i=0;i<studentAry.length;i++) {
			studentAry[i] = new IStudent();
		}
		
		for(int i=0;i<studentAry.length;i++) {
			studentAry[i].print();
		}
		System.out.println("--------------------------------------------------------------------------------");
		
		System.out.println("input searchID:");
		int searchID = scan.nextInt();
		for(int i=0; i<studentAry.length; i++) {
			if(studentAry[i].getId() == searchID) {
				studentAry[i].print();
				break;
			}
		}
		
		bubbleSort(studentAry);
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("±Æ§Çµ²ªG:");
		for(int i=0;i<studentAry.length;i++) {
			studentAry[i].print();
		}
		
	}
	
	public static void bubbleSort(IStudent[] arr) {
		int i, len = arr.length;
		IStudent temp;
		boolean changed;
		do {
			changed = false;
			len-=1;
			for (i = 0; i < len; i++) {
				if (arr[i].getAverge() < arr[i + 1].getAverge()) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					changed = true;
		        	}
		      	}
		} while (changed);
	}
}
