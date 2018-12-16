/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import java.util.List;

/**
 *
 * @author pyiesone
 */
public class Prototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException  {
                Employee emps = new Employee();
		emps.loadData();
		
		//Use the clone method to get the Employee object
		Employee empsNew = (Employee) emps.clone();
		Employee empsNew1 = (Employee) emps.clone();
		List<String> list = empsNew.getEmpList();
		list.add("Sonny");
		List<String> list1 = empsNew1.getEmpList();
		list1.remove("Kevin");
		
		System.out.println("emps List: "+emps.getEmpList());
		System.out.println("empsNew List: "+list);
		System.out.println("empsNew1 List: "+list1);
    }
    
}
