/*
 * Author: Latha Karthigaa Murugesan
 * Date: 31 Aug 2014
 */

package aucklanduni.simulate.bean;

public class DateTimePowerBean 
{
	private String date; //to store data in the energy file
	private String time; //to store time in the energy file
	private float power; // to store the power information in the energy file
	public DateTimePowerBean(){
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public float getPower() {
		return power;
	}
	public void setPower(float power) {
		this.power = power;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
}
