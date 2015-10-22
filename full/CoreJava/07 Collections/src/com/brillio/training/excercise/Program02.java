package com.brillio.training.excercise;

import java.util.ArrayList;
import java.util.List;

public class Program02 {

	
	
	public static void addList(List<Integer> l1, List<Integer> l2){
	
		int big,small;
		
		List<Integer> sum;

		if(l1.size() >= l2.size()){
		
			big = l1.size();
			small = l2.size();
			sum = new ArrayList<>(big);
			
			for(int i=0; i<small; i++){
			sum.add(i, l1.get(i) + l2.get(i));
			}
			
			for(int i=small;i<big;i++){
				sum.add(i,l1.get(i));
			}
			
		}
		else
		{
			big = l2.size();
			small = l1.size();
			sum = new ArrayList<>(big);
			
			
			for(int i=0; i<small; i++){
				sum.add(i, sum.get(i) + l2.get(i));
				}
			
			for(int i=small;i<big;i++){
				sum.add(i,l2.get(i));
			}
			
		}
		
		for(int i=0; i<sum.size(); i++){
			
			System.out.println(sum.get(i));
			}
	}
	
	public static void main(String[] args) {
	
		List<Integer> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();
		
		l1.add(30);
		l1.add(30);
		l1.add(30);
		l1.add(40);
		l1.add(50);

		l2.add(25);
		l2.add(35);
		
		addList(l1,l2);
		
	}
	
}
