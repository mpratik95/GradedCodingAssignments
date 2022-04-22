package com.greatlearning.driver;

import com.greatlearning.departments.AdminDepartment;
import com.greatlearning.departments.HumanResourcesDepartment;
import com.greatlearning.departments.TechDepartment;

public class Driver {

	public static void main(String[] args) {

		//Invoke Admin Department
		AdminDepartment admin = new AdminDepartment();
		System.out.println("Welcome to "+admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		System.out.println();

		//Invoke HR Department
		HumanResourcesDepartment hrDept = new HumanResourcesDepartment();
		System.out.println("Welcome to "+hrDept.departmentName());
		System.out.println(hrDept.doActivity());
		System.out.println(hrDept.getTodaysWork());
		System.out.println(hrDept.getWorkDeadline());
		System.out.println(hrDept.isTodayAHoliday());
		System.out.println();

		//Invoke Tech Department
		TechDepartment techDept = new TechDepartment();		
		System.out.println("Welcome to "+techDept.departmentName());
		System.out.println(techDept.getTodaysWork());
		System.out.println(techDept.getWorkDeadline());
		System.out.println(techDept.getTechStackInformation());
		System.out.println(techDept.isTodayAHoliday());

	}

}
