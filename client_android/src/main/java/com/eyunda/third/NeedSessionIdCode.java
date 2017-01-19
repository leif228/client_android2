package com.eyunda.third;

public enum NeedSessionIdCode {

	MyOrderActivity("", "", "");

	private String description;
	private String classPath;
	private String gotoPath;

	public String getDescription() {
		return description;
	}

	public String getClassPath() {
		return classPath;
	}

	public String getGotoPath() {
		return gotoPath;
	}

	public static NeedSessionIdCode getByClassPath(String classPath) {
		for (NeedSessionIdCode e : NeedSessionIdCode.values())
			if (e.getClassPath().equals(classPath))
				return e;

		return null;
	}

	private NeedSessionIdCode(String description, String classPath, String gotoPath) {
		this.description = description;
		this.classPath = classPath;
		this.gotoPath = gotoPath;
	}

}
