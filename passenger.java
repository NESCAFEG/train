package train;

public class passenger {
	public passenger(String name){
		this.name = name;
	}
	
	public void setPosition(String station){
		this.current = station;
	}
	
	public String getname(){
		return name;
	}
	
	public String getCurrent(){
		return current;
	}
	
	private String name;
	private String current;
}
