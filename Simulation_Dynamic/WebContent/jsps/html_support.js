function load_components()
{
	var element = document.getElementById('div_select_year');
	var element1 = document.getElementById('div_select_month');
	var element2 = document.getElementById('div_select_day');
	var element3 = document.getElementById('div_select_hours');
	var element4 = document.getElementById('div_select_years');
	var select_vis_value = document.getElementById('select_vis_options');
	if(select_vis_value.value =='power_every_minute')
	{
		element.style.display = "block";
		element1.style.display = "block";
		element2.style.display = "block";
		element3.style.display = "block";
		element4.style.display = "none";
		
		element5.style.display = "block";
		element6.style.display = "none";
		element7.style.display = "none";
		element8.style.display = "none";
		element9.style.display = "none";
	}
	else if(select_vis_value.value=='energy_every_hour')
	{
		element.style.display = "block";
		element1.style.display = "block";
		element2.style.display = "block";
		element3.style.display = "none";
		element4.style.display = "none";	
		
		element5.style.display = "none";
		element6.style.display = "block";
		element7.style.display = "none";
		element8.style.display = "none";
		element9.style.display = "none";
	}
	else if(select_vis_value.value=='energy_every_day')
	{
		element.style.display = "block";
		element1.style.display = "block";
		element2.style.display = "none";
		element3.style.display = "none";
		element4.style.display = "none";	
		
		element5.style.display = "none";
		element6.style.display = "none";
		element7.style.display = "block";
		element8.style.display = "none";
		element9.style.display = "none";
	}
	else if(select_vis_value.value=='energy_every_month')
	{
		element.style.display = "block";	
		element1.style.display = "none";
		element2.style.display = "none";
		element3.style.display = "none";
		element4.style.display = "none";	
		
		element5.style.display = "none";
		element6.style.display = "none";
		element7.style.display = "none";
		element8.style.display = "block";
		element9.style.display = "none";
	}
	else if(select_vis_value.value=='compare_energy_years')
	{
		element.style.display = "none";	
		element1.style.display = "none";
		element2.style.display = "none";
		element3.style.display = "none";
		element4.style.display = "block";	
		
		element5.style.display = "none";
		element6.style.display = "none";
		element7.style.display = "none";
		element8.style.display = "none";
		element9.style.display = "block";
	}
}

function load_graphs()
{
	var select_vis_value = document.getElementById('select_vis_options');
	var element5 = document.getElementById('show_1_graph');
	var element6 = document.getElementById('show_2_graph');
	var element7 = document.getElementById('show_3_graph');
	var element8 = document.getElementById('show_4_graph');
	var element9 = document.getElementById('show_5_graph');
	if(select_vis_value.value =='power_every_minute')
	{
		element5.style.display = "block";
		element6.style.display = "none";
		element7.style.display = "none";
		element8.style.display = "none";
		element9.style.display = "none";
	}
	else if(select_vis_value.value=='energy_every_hour')
	{
		element5.style.display = "none";
		element6.style.display = "block";
		element7.style.display = "none";
		element8.style.display = "none";
		element9.style.display = "none";
	}
	else if(select_vis_value.value=='energy_every_day')
	{
		element5.style.display = "none";
		element6.style.display = "none";
		element7.style.display = "block";
		element8.style.display = "none";
		element9.style.display = "none";
	}
	else if(select_vis_value.value=='energy_every_month')
	{
		element5.style.display = "none";
		element6.style.display = "none";
		element7.style.display = "none";
		element8.style.display = "block";
		element9.style.display = "none";
	}
	else if(select_vis_value.value=='compare_energy_years')
	{
		element5.style.display = "none";
		element6.style.display = "none";
		element7.style.display = "none";
		element8.style.display = "none";
		element9.style.display = "block";
	}
}