<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%-- <%@ page import="java.io.File" %>
    <%@ page import="java.io.IOException" %>
	<%@ page import="org.jfree.chart.ChartUtilities" %>
	<%@ page import="org.jfree.chart.JFreeChart" %>
	<%@ page import="com.simulate.business.Visualisation_Functions" %> --%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="visServlet" method="post">
<script type="text/javascript" src="html_support.js"></script>
Select the Visualisation options: 
<select name = "select_vis_options" id="select_vis_options" onclick="load_components()">
  <option value="power_every_minute">Power consumption for an hour (every minute)</option>
  <option value="energy_every_hour">Energy consumption for a day (every hour)</option>
  <option value="energy_every_day">Energy consumption for a month (every day)</option>
  <option value="energy_every_month">Energy consumption for a year (every month)</option>
  <option value="compare_energy_years">Compare the energy consumption of two different years (every month) </option>
</select>

<div id="div_select_year" style="display:none;">
<br><br>Select the Year:
<select name = "select_year" id="select_year">
  <option value="2006">2006</option>
  <option value="2007">2007</option>
  <option value="2008">2008</option>
</select>
</div>

<div id="div_select_month" style="display:none;">
<br><br>Select the Month:
<select name = "select_month" id="select_month">
  <option value="01">Jan</option>
  <option value="02">Feb</option>
  <option value="03">Mar</option>
  <option value="04">Apr</option>
  <option value="05">May</option>
  <option value="06">Jun</option>
  <option value="07">Jul</option>
  <option value="08">Aug</option>
  <option value="09">Sep</option>
  <option value="10">Oct</option>
  <option value="11">Nov</option>
  <option value="12">Dec</option>
</select>
</div>

<div id="div_select_day" style="display:none;">
<br><br>Select the Day:
<select name = "select_day" id="select_day">
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
  <option value="4">4</option>
  <option value="5">5</option>
  <option value="6">6</option>
  <option value="7">7</option>
  <option value="8">8</option>
  <option value="9">9</option>
  <option value="10">10</option>
  <option value="11">11</option>
  <option value="12">12</option>
  <option value="13">13</option>
  <option value="14">14</option>
  <option value="15">15</option>
  <option value="16">16</option>
  <option value="17">17</option>
  <option value="18">18</option>
  <option value="19">19</option>
  <option value="20">20</option>
  <option value="21">21</option>
  <option value="22">22</option>
  <option value="23">23</option>
  <option value="24">24</option>
  <option value="25">25</option>
  <option value="26">26</option>
  <option value="27">27</option>
  <option value="28">28</option>
  <option value="29">29</option>
  <option value="30">30</option>
  <option value="31">31</option>
</select>
</div>

<div id="div_select_hours" style="display:none;">
<br><br>Select the Time:
    <select name = "select_hours" id="select_hours">
	  <option value="00">00:00</option>
	  <option value="01">01:00</option>
	  <option value="02">02:00</option>
	  <option value="03">03:00</option>
	  <option value="04">04:00</option>
	  <option value="05">05:00</option>
	  <option value="06">06:00</option>
	  <option value="07">07:00</option>
	  <option value="08">08:00</option>
	  <option value="09">09:00</option>
	  <option value="10">10:00</option>
	  <option value="11">11:00</option>
	  <option value="12">12:00</option>
	  <option value="13">13:00</option>
	  <option value="14">14:00</option>
	  <option value="15">15:00</option>
	  <option value="16">16:00</option>
	  <option value="17">17:00</option>
	  <option value="18">18:00</option>
	  <option value="19">19:00</option>
	  <option value="20">20:00</option>
	  <option value="21">21:00</option>
	  <option value="22">22:00</option>
	  <option value="23">23:00</option>
    </select>
</div>

<div id="div_select_years" style="display:none;">
<br><br>Select the Year 1:
<select name = "select_year1" id="select_year1">
  <option value="2006">2006</option>
  <option value="2007">2007</option>
  <option value="2008">2008</option>
</select>

<br><br>Select the Year 2:
<select name = "select_year2" id="select_year2">
  <option value="2006">2006</option>
  <option value="2007">2007</option>
  <option value="2008">2008</option>
</select>
</div>
<%-- 
<jsp:useBean id="ddmmyyyyhhBean" class="aucklanduni.simulate.bean.DDMMYYYYHHBean">
	<jsp:setProperty name="ddmmyyyyhhBean" property="year" value="2007"/>
	<jsp:setProperty name="ddmmyyyyhhBean" property="month" value="03"/>
	<jsp:setProperty name="ddmmyyyyhhBean" property="day" value="1"/>
	<jsp:setProperty name="ddmmyyyyhhBean" property="hours" value="13"/>
</jsp:useBean> --%>

<br/>
<input type="submit" value="Visualise" onclick="load_graphs()"/>

<div id="show_graph1" style="display:none;">
	<img id="show_1_graph" src="D:/chart1.jpg"/>
</div>

<div id="show_graph2" style="display:none;">
	<img id="show_2_graph" src="D:/chart2.jpg"/>
</div>

<div id="show_graph3" style="display:none;">
	<img id="show_3_graph" src="D:/chart3.jpg"/>
</div>

<div id="show_graph4" style="display:none;">
	<img id="show_4_graph" src="D:/chart4.jpg"/>
</div>

<div id="show_graph5" style="display:none;">
	<img id="show_5_graph" src="D:/chart5.jpg"/>
</div>

</form>
</body>
</html>