package cars_new;

public class SUB extends Car{
	private boolean isOffRoad;

	public SUB(double price, boolean isOffRoad) {
		super(price);
		this.setIsOffRoad(isOffRoad);
	}

	public boolean getIsOffRoad() {
		return isOffRoad;
	}

	public void setIsOffRoad(boolean isOffRoad) {
		this.isOffRoad = isOffRoad;
	}

	@Override
	public String toString() {
		String result = "";
		result += " SUB price:\t" + getPrice();
		result += "; Offroad?\t" + getIsOffRoad() + "\n";
		return result;
	}
	
	
	

}
