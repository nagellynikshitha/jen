package com.bootcamp.bootcampjava.formsubmission.model;

/**
 * @author Nikshitha Nagelly 
 * This class declares all datamembers used for user
 * to get registered and provides getters and setters
 */
public class J2EEStack {

	private int years;
	private String J2EELIST;
	private String webservices;
	private String frameworks;

	public String getFrameworks() {
		return frameworks;
	}

	public void setFrameworks(String frameworks) {
		this.frameworks = frameworks;
	}

	private String Comments;

	public String getComments() {
		return Comments;
	}

	public void setComments(String comments) {
		Comments = comments;
	}

	public String getWebservices() {
		return webservices;
	}

	public void setWebservices(String webservices) {
		this.webservices = webservices;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public String getJ2EELIST() {
		return J2EELIST;
	}

	public void setJ2EELIST(String j2eelist) {
		J2EELIST = j2eelist;
	}

}
