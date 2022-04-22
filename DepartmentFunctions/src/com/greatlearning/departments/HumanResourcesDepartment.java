package com.greatlearning.departments;

public class HumanResourcesDepartment extends SuperDepartment {
	//Method To Return Department Name
	@Override
	public String departmentName() {
		return "HR Department";
	}

	//Method To Return Info About Todays Work
	@Override
	public String getTodaysWork() {
		return "Fill today’s worksheet and mark your attendance";
	}

	//Method To Return info on Work DeadLine
	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	//Method to Return Activity info
	public String doActivity() {
		return "team Lunch";
	}
}
