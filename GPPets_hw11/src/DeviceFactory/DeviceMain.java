package DeviceFactory;

public class DeviceMain {

	public static void main(String[] args) {
		Factory deviceFactory = new Factory();
		
		 //get a tablet and call toString.
		 Device device1 = deviceFactory.getDevice("Tablet");
		 device1.setModel("Tablet model");
		 device1.setBrand("Tablet brand");
		 System.out.println(device1.toString());
		 System.out.println();
		 
		//get a phone and call toString.
		 Device device2 = deviceFactory.getDevice("Phone");
		 device2.setModel("Phone model");
		 device2.setBrand("Phone brand");
		 System.out.println(device2.toString());
		 System.out.println();
		 
		//get a laptop and call toString.
		 Device device3 = deviceFactory.getDevice("Laptop");
		 device3.setModel("Laptop model");
		 device3.setBrand("Laptop brand");
		 System.out.println(device3.toString());
	}

}
