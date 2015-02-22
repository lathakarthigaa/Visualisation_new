package aucklanduni.simulate.servlets;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;

import aucklanduni.simulate.main.MainFunctions;

import aucklanduni.simulate.business.Visualisation_Functions;

/**
 * Servlet implementation class VisualiseServlet
 */
public class VisualiseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VisualiseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 // Set response content type
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	      /*out.println("<h1> Option:" + request.getParameter("select_vis_options") + "</h1>");
	      out.println("<h1> Year:" + request.getParameter("select_year") + "</h1>");
	      System.out.println("Option:"+request.getParameter("select_vis_options"));
	      System.out.println("Year:"+request.getParameter("div_select_year"));*/
		if(request.getParameter("select_vis_options").equals("power_every_minute"))
		{
			/*System.out.println("Option:" + request.getParameter("select_vis_options"));
			System.out.println("Year:" + request.getParameter("select_year"));
			System.out.println("Month:" + request.getParameter("select_month"));
			System.out.println("Day:" + request.getParameter("select_day"));
			System.out.println("Hours:" + request.getParameter("select_hours"));*/
			MainFunctions mainFunctions = new MainFunctions();
			mainFunctions.PowerConsumptionForAnHour_EveryMinute(Integer.parseInt(request.getParameter("select_year")), request.getParameter("select_month"), Integer.parseInt(request.getParameter("select_day")), request.getParameter("select_hours"));
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<h1>power_every_minute</h1>");
			out.println("<img src=\"D:/chart1.jpg\"/>");
			out.println("<h1>power_every_minute</h1>");
		}
		else if(request.getParameter("select_vis_options").equals("energy_every_hour"))
		{
			System.out.println("Option:" + request.getParameter("select_vis_options"));
			System.out.println("Year:" + request.getParameter("select_year"));
			System.out.println("Month:" + request.getParameter("select_month"));
			System.out.println("Day:" + request.getParameter("select_day"));
			MainFunctions mainFunctions = new MainFunctions();
			mainFunctions.EnergyConsumptionForADay_EveryHour(Integer.parseInt(request.getParameter("select_year")), request.getParameter("select_month"), Integer.parseInt(request.getParameter("select_day")));
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<img src=\"D:/chart2.jpg\"/>");
		}
		else if(request.getParameter("select_vis_options").equals("energy_every_day"))
		{
			System.out.println("Option:" + request.getParameter("select_vis_options"));
			System.out.println("Year:" + request.getParameter("select_year"));
			System.out.println("Month:" + request.getParameter("select_month"));
			MainFunctions mainFunctions = new MainFunctions();
			mainFunctions.EnergyConsumptionForAMonth_EveryDay(Integer.parseInt(request.getParameter("select_year")), request.getParameter("select_month"));
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<img src=\"D:/chart3.jpg\"/>");
		}
		else if(request.getParameter("select_vis_options").equals("energy_every_month"))
		{
			System.out.println("Option:" + request.getParameter("select_vis_options"));
			System.out.println("Year:" + request.getParameter("select_year"));
			MainFunctions mainFunctions = new MainFunctions();
			mainFunctions.EnergyConsumptionForAnYear_EveryMonth(Integer.parseInt(request.getParameter("select_year")));
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<img src=\"D:/chart4.jpg\"/>");
		}
		else if(request.getParameter("select_vis_options").equals("compare_energy_years"))
		{
			System.out.println("Option:" + request.getParameter("select_vis_options"));
			System.out.println("Year:" + request.getParameter("select_year1"));
			System.out.println("Year:" + request.getParameter("select_year2"));
			MainFunctions mainFunctions = new MainFunctions();
			mainFunctions.CompareEnergyConsumptionofTwoYears_EveryMonth(Integer.parseInt(request.getParameter("select_year1")), Integer.parseInt(request.getParameter("select_year2")));
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<img src=\"D:/chart5.jpg\"/>");
		}
	}

}
