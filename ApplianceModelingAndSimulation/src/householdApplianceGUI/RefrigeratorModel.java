package householdApplianceGUI;
import java.util.Random;
import java.lang.Math;
public class RefrigeratorModel {
	private double Cf; // heat capacity of the food 
	private double COPcoef; // compressor COP 
	private double kwh_meter;
	private double power_factor;
	private double power_kw;
	private double Qr; // heat rate from the cooling system 
	private double rated_capacity;// rated capacity (Btu/h) 
	private double size; //	refrigerator volume
	private double Tair; //	Refrigerator air temperature (degF). 
	private double thermostat_deadband; //refrigerator thermostat hysterisys (degF) 
	private double Tout; //House air temperature. 
	private double Tset; //Refrigerator control set point temperature (degF). 
	private double UAf; //	Thermal conductance of the food-air. 
	private double UAr; //	Thermal conductance of Refrigerator compartment. 
	private static Random random;
	public RefrigeratorModel()
	{
		size = uniform(20,40); //cf
		// basic random properties
		thermostat_deadband = uniform(2,3);
		Tset = uniform(35,39);
		UAr = 1.5+size/40*uniform(0.9,1.1);
		UAf = uniform(0.9,1.1);
		COPcoef = uniform(0.9,1.1);
		// size is used to couple Cw and Qrated
		Cf = 8.43 * size/10; // BTU equivalent gallons of water for only 10% of the size of the refrigerator
		rated_capacity = size*10; // BTU/h
		
		// duty cycle estimate
		if (uniform(0,1) < 0.04)
		    Qr = rated_capacity;
		else
		   	Qr = 0;
		// derived properties and other initial conditions
		Tair = uniform(Tset-thermostat_deadband,Tset+thermostat_deadband);
		Tout = 59.0;
		power_factor = 0.95;
	}
	public static double uniform() {
        return random.nextDouble();
    }
	public static double uniform(double a, double b) {
        if (!(a < b)) throw new IllegalArgumentException("Invalid range");
        return a + uniform() * (b-a);
    }
	public double getCf() {
		return Cf;
	}
	public void setCf(double cf) {
		Cf = cf;
	}
	public double getCOPcoef() {
		return COPcoef;
	}
	public void setCOPcoef(double cOPcoef) {
		COPcoef = cOPcoef;
	}
	public double getKwh_meter() {
		return kwh_meter;
	}
	public void setKwh_meter(double kwh_meter) {
		this.kwh_meter = kwh_meter;
	}
	public double getPower_factor() {
		return power_factor;
	}
	public void setPower_factor(double power_factor) {
		this.power_factor = power_factor;
	}
	public double getPower_kw() {
		return power_kw;
	}
	public void setPower_kw(double power_kw) {
		this.power_kw = power_kw;
	}
	public double getQr() {
		return Qr;
	}
	public void setQr(double qr) {
		Qr = qr;
	}
	public double getRated_capacity() {
		return rated_capacity;
	}
	public void setRated_capacity(double rated_capacity) {
		this.rated_capacity = rated_capacity;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public double getTair() {
		return Tair;
	}
	public void setTair(double tair) {
		Tair = tair;
	}
	public double getThermostat_deadband() {
		return thermostat_deadband;
	}
	public void setThermostat_deadband(double thermostat_deadband) {
		this.thermostat_deadband = thermostat_deadband;
	}
	public double getTout() {
		return Tout;
	}
	public void setTout(double tout) {
		Tout = tout;
	}
	public double getTset() {
		return Tset;
	}
	public void setTset(double tset) {
		Tset = tset;
	}
	public double getUAf() {
		return UAf;
	}
	public void setUAf(double uAf) {
		UAf = uAf;
	}
	public double getUAr() {
		return UAr;
	}
	public void setUAr(double uAr) {
		UAr = uAr;
	}
	/*public String calcNextSimulatedTemperature()
	{
		double nHours = (gl_tohours(t1)- gl_tohours(t0))/TS_SECOND;
		// sync to house
		Tout = 59; // read the temperature value from temperature sensor
		// compute control event temperatures
		final double Ton = Tset+thermostat_deadband;
		final double Toff = Tset-thermostat_deadband;
		// compute constants
		final double C1 = Cf/(UAr * UAf);
		final double COP = COPcoef*((-3.5/45)*(Tout-70)+4.5);
		// accumulate energy
		kwh_meter = Qr * COP * nHours;
		power_kw = kwh_meter/nHours;
		// process all events
		// change control mode if appropriate
		if (ANE(Qr,0,0.1) && ALT(Tair,Toff,0.1))
		    Qr = 0;
		else if (AEQ(Qr,0,0.1) && AGT(Tair,Ton,0.1))
		    Qr = rated_capacity;
		// compute constants for this time increment
		final double C2 = Tout - Qr/UAf;
		// determine next internal event temperature
		double Tevent;
		if (AEQ(Qr,0,0.1))
		    Tevent = Ton;
		else
		    Tevent = Toff;
		// compute time to next internal event
		double t = -Math.log((Tevent - C2)/(Tair-C2))*C1;
		double dt = t;
		if (t==0)
		    System.out.println("Refrigerator control logic error");
		// if fridge is undersized or time exceeds balance of time or external event pending
		if (t<0 || t>=nHours)
		{
		    dt = ((t<0||t>=nHours)?nHours:t);
		    // update temperature of air
		    Tair = (Tair-C2)*Math.exp(-dt/C1)+C2;
		    if (Tair < 32 || Tair > 55)
		    	System.out.println("Refrigerator air temperature out of control");
		    return (TIMESTAMP)(t1+dt*3600.0/TS_SECOND);
		}
		// internal event
		else
		{
		    Tair = Tevent;
		    return TS_NEVER; 
		}
	}*/
	
	public int calcPower()
	{
		int power = 400;
		return power;
	}
}
