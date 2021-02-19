package solid;

public class DependencyInversionBadExample {


	public static void main(String[] args) {
		LightBulb1 lightBulb = new LightBulb1();
		ElectricPowerSwitch1 eSwitch = new ElectricPowerSwitch1(lightBulb);
		eSwitch.press();
		eSwitch.press();
	}
}

 class LightBulb1 {
	public void turnOn() {
		System.out.println("LightBulb: Bulb turned on...");
	}
	public void turnOff() {
		System.out.println("LightBulb: Bulb turned off...");
	}
}


class ElectricPowerSwitch1 {
	public LightBulb1 lightBulb;
	public boolean on;
	public ElectricPowerSwitch1(LightBulb1 lightBulb) {
		this.lightBulb = lightBulb;
		this.on = false;
	}
	public boolean isOn() {
		return this.on;
	}
	public void press(){
		boolean checkOn = isOn();
		if (checkOn) {
			lightBulb.turnOff();
			this.on = false;
		} else {
			lightBulb.turnOn();
			this.on = true;
		}
	}
}