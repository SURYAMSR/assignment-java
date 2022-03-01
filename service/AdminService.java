package com.te.carinfoapp.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.te.carinfoapp.dto.AdminDetails;
import com.te.carinfoapp.dto.CarDetails;

public interface AdminService {

	AdminDetails  saveSignupData(AdminDetails adminDetails);
	
	List<CarDetails> getAllCarDetails();
	CarDetails addCarDetails(CarDetails carDetails,HttpServletRequest request);
	CarDetails updateCarDetails(CarDetails carDetails,HttpServletRequest request);
	boolean deleteCarDetails(int carId);
}
