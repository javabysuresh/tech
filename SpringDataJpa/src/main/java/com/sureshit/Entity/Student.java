package com.sureshit.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Student")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

	@Id
	@Column
	private int sid;
	@Column 
	private String sname;
	@Column
	private String address;
	

}
