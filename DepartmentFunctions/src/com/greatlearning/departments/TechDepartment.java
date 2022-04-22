package com.greatlearning.departments;

public class TechDepartment extends SuperDepartment {
	//Method To Return Department Name
	@Override
	public String departmentName() {
		return "Tech Department";
	}

	//Method To Return Info About Todays Work
	@Override
	public String getTodaysWork() {
		return "Complete coding of Module 1";
	}

	//Method To Return info on Work DeadLine
	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	//Method to Return Tech Stack info
	public String getTechStackInformation() {
		return "Core Java";
	}
}
