/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pyiesone
 */
public class Employee implements Cloneable
{
    	private List<String> empList;
	
	public Employee(){
		empList = new ArrayList<String>();
	}
	
	public Employee(List<String> list){
		this.empList=list;
	}
	public void loadData(){
		//read all employees from database and put into the list
		empList.add("Thomas");
		empList.add("Kevin");
		empList.add("David");
		empList.add("Lisa");
	}
	
	public List<String> getEmpList() {
		return empList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
			List<String> temp = new ArrayList<String>();
			for(String s : this.getEmpList()){
				temp.add(s);
			}
			return new Employee(temp);
	}
	
}
