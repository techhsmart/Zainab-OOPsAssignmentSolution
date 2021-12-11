package com.department.onego;

class Super_dpartment {
	public String departmentName() {
		return "Welcome to super department";
	}

	public String getTodayWork() {
		return "Now works as of now";
	}

	public String getWorkDeadline() {
		return "Nil";
	}

	public String isTodayAHoliday() {
		return "Today is not a Holiday";
	}
}

class Admin_dpartment extends Super_dpartment {
	public String departmentName() {
		return "Welcome to Admin Department";
	}

	public String getTodayWork() {
		return "Complete your documents submission";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}
}

class Hr_dpartment extends Super_dpartment {
	public String departmentName() {
		return "Welcome to HR department";
	}

	public String doActivity() {
		return "team Lunch";
	}

	public String getTodayWork() {
		return "Fill today's timesheets and mark your attendance";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}
}

class Tech_dpartment extends Super_dpartment {
	public String departmentName() {
		return "Welcome to Tech Department";
	}

	public String getTodayWork() {
		return "Complete coding of Module 1";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String getTechStackInformation() {
		return "Core Java";
	}
}

//Driver class Main

public class Main {
	public static void main(String[] args) {
		Tech_dpartment td = new Tech_dpartment();
		Hr_dpartment hd = new Hr_dpartment();
		Admin_dpartment ad = new Admin_dpartment();
		System.out.println(ad.departmentName());
		System.out.println(ad.getTodayWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(ad.isTodayAHoliday());
		System.out.println("");

		System.out.println(hd.departmentName());
		System.out.println(hd.doActivity());
		System.out.println(hd.getTodayWork());
		System.out.println(hd.getWorkDeadline());
		System.out.println(hd.isTodayAHoliday());
		System.out.println("");

		System.out.println(td.departmentName());
		System.out.println(td.getTodayWork());
		System.out.println(td.getWorkDeadline());
		System.out.println(td.getTechStackInformation());
		System.out.println(td.isTodayAHoliday());
	}
}
