package org.dremlogic.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
@Entity
@Table
public class EmployeeAddress {
	
	
	
	public EmployeeAddress(Long id, String street, String city) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String street;
	
	
	private String city;

}
