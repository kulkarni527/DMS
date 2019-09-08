package com.alighthub.dms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alighthub.dms.model.Login;
/*
 * 
 * @author Ravindra Sonawane
 * @page Login Dao
 * @time 08/09/2019 - 9.20 PM
 * @purpose To controll Login dao
 * 
 *
 */

@Repository
public interface LoginDao extends JpaRepository<Login,Integer> {

	
	
}
