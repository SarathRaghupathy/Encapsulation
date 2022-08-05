package org.practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UserDefMap {

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
		

		Map<Integer,Employee> mp = new LinkedHashMap <Integer,Employee>();
		
		mp.put(1, e1);
		mp.put(2, e2);
		mp.put(3, e3);
		
		Set<Entry<Integer, Employee>> entry = mp.entrySet();
		
		for (Entry<Integer, Employee> x : entry) {
			
			System.out.println("Employee no: "+x.getKey());
			System.out.println("Employee id is:  "+ x.getValue().getEmpId());
			System.out.println("Employee id Name:  "+ x.getValue().getEmpName());
			System.out.println("Employee id num:  "+ x.getValue().getMobNum());
			
		}
		
}
}
