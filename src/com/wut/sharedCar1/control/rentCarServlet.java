package com.wut.sharedCar1.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wut.sharedCar1.model.Car;
import com.wut.sharedCar1.model.rentCarDAO;

/**
 * Servlet implementation class rentCarServlet
 */
@WebServlet("/rentCarServlet")
public class rentCarServlet extends HttpServlet {
	private rentCarDAO dao=new rentCarDAO();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String method =request.getParameter("method");
		switch(method) {
		case "listAll":
		{
			System.out.println("��ѯ��ʾ�еĺ�̨����");
			List<Car> cars=dao.listAll();
			System.out.println(cars.size());
			break;
		}
		case "add":
		{
			System.out.println("��ӹ��������ķ���");
			
			break;
		}
	
		}
	}

}
