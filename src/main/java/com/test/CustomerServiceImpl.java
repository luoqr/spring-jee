package com.test;

import lombok.Getter;
import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
@Scope("prototype")
public class CustomerServiceImpl implements CustomerService{

	@Autowired 
	@Getter 
	@Setter
	private CustomerDao dao ;
	
	
	@Override
	public Customer query(String id){
		return dao.findByKey(id);
	}
	
}
