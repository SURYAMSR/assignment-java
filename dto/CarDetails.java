package com.te.carinfoapp.dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Car_Details")
public class CarDetails implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;
	
	private String company;
	
	private String fuelType;
	
	private boolean powerSteering;
	
	private String brakeSystem;
	
	private Double showroomPrice;
	
	private Double onroadPrice;
	
	@Column(name="image_url")
	private String imageURL;
	
	private Double mileage;
	
	private int seatingCapacity;
	
	private int engineCapacity;
	
	private String gearType;
	
	@ManyToOne()
	@JoinColumn(name = "admin_id",referencedColumnName = "username")
	private AdminDetails adminId;
}
