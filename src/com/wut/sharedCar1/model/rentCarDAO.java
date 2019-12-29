package com.wut.sharedCar1.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;



/**
 * ���ǹ�������ģ���DAO�࣬�����ṩ��������ص����ݿ��������
 * @author Administrator
 *
 */

public class rentCarDAO {
	/**
	 * ���ǲ�ѯ��ʾ���еĳ�����dao����
	 * @return
	 */
       public List<Car> listAll(){
    	   List<Car> cars=null;
    try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/sharedCar","root","root");
		    QueryRunner run=new QueryRunner();
		    ResultSetHandler<List<Car>> h=new BeanListHandler<Car>(Car.class);
		    cars= run.query(connection, "SELECT * FROM car", h);
    
    
    
    } catch (Exception e) {
    	   cars= new ArrayList<>();
			e.printStackTrace();
		}
    	   
    	   
    	   return cars;
    			   
       }
}
