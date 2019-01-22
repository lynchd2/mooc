package application;

import application.Sensor;
import java.util.*;

public class AverageSensor {

	public List<Sensor> sensors;
	public boolean on;
	public List<Integer> allReadings;

	public AverageSensor() {
		this.sensors = new ArrayList<Sensor>();
		this.on = false;
		this.allReadings = new ArrayList<Integer>();
	}

	public void addSensor(Sensor additional) {
		this.sensors.add(additional);
	}

	public List<Sensor> sensors() {
		return this.sensors;
	}


	public void on() {
		this.on = true;
		for(Sensor sensor : this.sensors()) {
			if(!sensor.isOn()) {
				sensor.on();
			}
		}
		return;
	}

	public void off() {
		for(Sensor sensor : this.sensors()) {
			if(sensor.isOn()) {
				this.on = false;
			}
		} 
		this.on = false;
		return;
	}

	public int measure() {
		if(this.sensors.size() == 0) {
			throw new IllegalArgumentException("There are no sensors to measure.");
		}
		int total = 0;
		for(Sensor sensor : this.sensors()) {
			if(sensor.isOn()) {
				total = total + sensor.measure();
			} else {
				throw new IllegalArgumentException("Not all sensors are on");
			}
		}
		this.allReadings.add(total);
		return total;
	}

	public List<Integer> readings() {
		return this.allReadings;
	}



}