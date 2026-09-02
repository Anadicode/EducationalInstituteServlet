package servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Model.Batch;
import Model.Student;
import Service.BatchService;




@WebServlet("/batch/*")
public class batch extends HttpServlet {
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Batch> batchs = new ArrayList<>();
		BatchService batch1 = new BatchService();
		
		batchs = batch1.getAllBatch();
		
//		for(var e : batchs) {
//			System.out.println(e.getBName());
//		}
//		
		request.setAttribute("batchs", batchs);

				
		RequestDispatcher rd = request.getRequestDispatcher("/batch.jsp");
		 rd.forward(request, response);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  
		    String pathString = request.getPathInfo();
		    
		    int id = Integer.parseInt(request.getParameter("delete"));
		    
		    BatchService batchService = new BatchService();
		    
		    batchService.changeStatus(id);
		    
		   // System.out.println("yoo"+id);
		    response.sendRedirect(request.getContextPath()+"/batch");
		  
		  }
	
		   
		  
		  
	}
	


	


