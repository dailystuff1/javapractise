package com.learning.core;

public class ArrayPrac {
	public static void main(String[] args) {
		Student s1 = new Student();
		int id=10;
		String name="abcd";
		s1.setId(id);
		s1.setName(name);
		
		Object[] student = new Object[10];//accepts heterogenious data
		student[1] = new Student();
		student[2]= 10;
		student[3]="Java";
		student[4]=new Employee();
		
		int[] a = new int[10];//accepts only homo data
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		a[5]=120;
		a[6]=130;
		a[7]=140;
		a[8]=150;
		//seach for 50, if there return its index, else say value is not present
		int count=0;
		for(int search: a)
		{
			count++;
			if(search==50)
			{
				System.out.println("Expected value found at: "+count);
			}
		}
	}
}
