package application;

import application.Sensor;

public class ConstantSensor implements Sensor {

	private int param;

	public ConstantSensor(int numberInput) {
		this.param = numberInput;
	}

	public void on() {

	}

	public void off() {

	}

	public boolean isOn() {
		return true;
	} 

	public int measure() {
		return this.param;
	}



}