package train;
import java.util.*;

public class line {
	
	public line(String name, int line) {
		this.name = name;
		this.line = line;
	}
	
	public boolean addStation(String station){
		if(!stations.containsKey(station)){
			stations.put(station, new LinkedList<String>());
			return true;
		}else
			return false;
	}
	
	
	public String show_name(){
		return this.name;
	}
	
	public int get_line(){
		return this.line;
	}
	
	public void display(){
			System.out.println(stations);
		
	}
	
	
	public void setInter(String from, String to){
		
	}
	
	
	private HashMap<String, LinkedList<String>> stations = new HashMap<String, LinkedList<String>>();
	private String name;
	private int line;
}
