package com.test;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(schema="test", name="customer")
@Data
public class Customer implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id private String id ;
	private String name ;
	private Date birthday ;
	private String address ;

}
