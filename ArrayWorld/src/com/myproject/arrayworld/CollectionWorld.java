package com.myproject.arrayworld;

import java.util.LinkedList;
import java.util.Vector;
import java.util.Stack;
import java.util.TreeSet;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Queue;
import java.util.PriorityQueue;

public class CollectionWorld implements Comparable<CollectionWorld>{
	
	protected String name;
	protected int age;
	
	public CollectionWorld(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public CollectionWorld() {
		this("Def", 0);
	}
	
	public static void main(String[] args) {
		List<CollectionWorld> list = new LinkedList<>();
		Stack<CollectionWorld> listTwo = new Stack<CollectionWorld>();
		Queue<CollectionWorld> listThree = new PriorityQueue<>();
		Deque<CollectionWorld> listFour = new ArrayDeque<CollectionWorld>();
		Set<CollectionWorld> listFive = new HashSet<CollectionWorld>();
		SortedSet<CollectionWorld> listSix = new TreeSet<CollectionWorld>();
		
		CollectionWorld one = new CollectionWorld("BSomeName", 22);
		CollectionWorld two = new CollectionWorld("A", 22);
		CollectionWorld three = new CollectionWorld("A", 21);
		
		MyComparator comparator = new MyComparator();
		
		list.add(one);
		list.add(two);
		list.add(three);
		
		listTwo.addAll(list);
		
		Collections.sort(listTwo, comparator);
		
//		listThree.add(one);
//		listThree.add(two);
//		listThree.add(three);
		
		listFour.add(two);
		listFour.push(one);
		listFour.addFirst(three);
		
		listFive.add(one);
		listFive.add(two);
		listFive.add(three);
		listFive.add(null);
		listFive.add(null);
		
		listSix.add(one);
		listSix.add(two);
		listSix.add(three);
//		listSix.add(null); not supported
		
		System.out.println(listFour);
		System.out.println(listFour.poll());
		System.out.println(listFour.poll());
		System.out.println(listFour.poll());
		System.out.println(listFive);
		System.out.println(listSix);
		
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CollectionWorld [name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		CollectionWorld other = (CollectionWorld) obj;
		if (age != other.age) {
			return false;
		}
		return true;
	}
	
	public int compareTo(CollectionWorld other) {
		return Integer.compare(getAge(), other.getAge());
	}
	
}
