package train;
import java.util.*;


public class map {
	public map(){
		map = new LinkedList<line>();
	}
	
	public void addLine(line line){
		map.add(line);
	}
	
	
	public void show_line(line target){
		target.display(); 
	}
	

	
	
	private LinkedList<line> map;
	
}
