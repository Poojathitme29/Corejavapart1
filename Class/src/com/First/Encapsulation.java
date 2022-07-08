package com.First;

class Employee
{
	private int empid;
	private String ename;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid)
	{
	this.empid=empid;
	
	}
	public String getName()
	{
		return ename;
	}
	public void setName(String name)
	{
		this.ename=ename;
	}
}


public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Employee e1=new Employee();
			e1.setEmpid(121);
			e1.setName("abc");
			System.out.println(e1.getEmpid());
			System.out.println(e1.getName());
	}

}
