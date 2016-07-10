package com.bootcamp.bootcampjava.formsubmission.service;

import java.util.ArrayList;


import com.bootcamp.bootcampjava.formsubmission.dao.FormDao;
import com.bootcamp.bootcampjava.formsubmission.model.J2EEStack;



/**
 * @author Nikshitha Nagelly 
 * This class provides service inorder to save data in
 * to database
 */
public class FormService {

	public boolean saveDetails(J2EEStack stack) {

		FormDao form = new FormDao();
		return form.saveData(stack);
	}

	
	
}

	
	
	
	
	
