package org.practice;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UserDefinedSet {

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

		  Set<Employee> si = new LinkedHashSet<Employee>();
		  
		  si.add(e1);
		  si.add(e2);
		  si.add(e3);

		  int count=1;
		  for (Employee x : si) {
			  
			  System.out.println("employee number is:" +count);
			  
			  System.out.println("employe Id: "+x.getEmpId());
			  System.out.println("employe Id: "+x.getEmpName());
			  System.out.println("employe Id: "+x.getMobNum());
			  count++;
		}
		  
		  
		}
		  
		  
}

