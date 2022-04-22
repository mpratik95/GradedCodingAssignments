package com.greatlearning.departments;

public class AdminDepartment extends SuperDepartment {
	//Method To Return Department Name
	@Override
	public String departmentName() {
		return "Admin Department";
	}

	//Method To Return Info About Todays Work
	@Override
	public String getTodaysWork() {
		return "Complete your documents submission";
	}

	//Method To Return info on Work DeadLine
	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
}