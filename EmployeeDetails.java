package week2.day1;

public class EmployeeDetails {
	String empName="Dharani";
	int empId=001;
	String empAddress="Chennai";
	double empsalary=400000;
	long empmobnum=9500423417L;
public static void main(String[] args) {
	EmployeeDetails information=new EmployeeDetails();
	System.out.println(information.empName);
	System.out.println(information.empId);
	System.out.println(information.empAddress);
	System.out.println(information.empsalary);
	System.out.println(information.empmobnum);
}
}