package org.practice;

import java.util.ArrayList;
import java.util.List;

public class UserDef {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		
		e1.setEmpId(1234);
		e1.setEmpName("sarath");
		e1.setMobNum(98989898l);
		
		Employee e2 = new Employee();
	        
		e2.setEmpId(9999);
		e2.setEmpName("sarath1");
		e2.setMobNum(111111110l);
		
		Employee e3 = new Employee();
		  
		e3.setEmpId(44444);
		e3.setEmpName("sarath2");
		e3.setMobNum(66666666l);
		  
		  List<Employee> li = new ArrayList<Employee>();
		  li.add(e1);
		  li.add(e2);
		  li.add(e3);
		  
		  for (int i = 0; i <li.size(); i++) {
			  System.out.println("my employee num:" + (1+i));
			System.out.println("get employee id: "+ li.get(i).getEmpId());
			System.out.println("get employee Name: "+ li.get(i).getEmpName());
			System.out.println("get employee id: "+ li.get(i).getMobNum());
			
		}
	}

}
