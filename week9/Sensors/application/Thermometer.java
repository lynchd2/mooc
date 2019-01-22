package application;

import java.lang.Math;
import application.Sensor;

public class Thermometer implements Sensor {

	private boolean on;

	public Thermometer() {
		this.on = false;
	}


	public boolean isOn() {
		return this.on;
	}

	public void on() {
		this.on = true;
	}

	public void off() {
		this.on = false;
	}
	public int measure() {
		if(this.isOn() == true) {
			return (int) (Math.random() * 60) - 30;
		} else {
			throw new IllegalArgumentException("Thermometer is not on");
		}
	}


}