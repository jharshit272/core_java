//credits : https://springframework.guru/principles-of-object-oriented-design/dependency-inversion-principle/
package solid;

public class DependencyInversionGoodExample {


	public static void main(String[] args) {
		Switchable switchableBulb=new LightBulb();
		Switch bulbPowerSwitch=new ElectricPowerSwitch(switchableBulb);
		bulbPowerSwitch.press();
		bulbPowerSwitch.press();
		Switchable switchableFan=new Fan();
		Switch fanPowerSwitch=new ElectricPowerSwitch(switchableFan);
		fanPowerSwitch.press();
		fanPowerSwitch.press();
	}

}



interface Switch {
	boolean isOn();
	void press();
}

interface Switchable {
	void turnOn();
	void turnOff();
}

class ElectricPowerSwitch implements Switch {
	public Switchable client;
	public boolean on;
	public ElectricPowerSwitch(Switchable client) {
		this.client = client;
		this.on = false;
	}
	public boolean isOn() {
		return this.on;
	}
	public void press(){
		boolean checkOn = isOn();
		if (checkOn) {
			client.turnOff();
			this.on = false;
		} else {
			client.turnOn();
			this.on = true;
		}

	}
}

class LightBulb implements Switchable {
	@Override
	public void turnOn() {
		System.out.println("LightBulb: Bulb turned on...");
	}
	@Override
	public void turnOff() {
		System.out.println("LightBulb: Bulb turned off...");
	}
}
class Fan implements Switchable {
	@Override
	public void turnOn() {
		System.out.println("Fan: Fan turned on...");
	}
	@Override
	public void turnOff() {
		System.out.println("Fan: Fan turned off...");
	}
}