package train;

public class tester {
    public static void main(String[] args) {
    
    	line north = new line("north", 1);
    	line south = new line("south", 2);
    	
        north.addStation("Hornsby");
        north.addStation("Strathfield");
        north.addStation("North Strathfield");
        north.addStation("Chatswood");
        
        south.addStation("somewhere");
        south.addStation("Central");
        south.addStation("Eastwood");
        south.addStation("Westwood");
         
    
      //  north.display();
        System.out.println();
      //  south.display();
        
        map sydney = new map();
        sydney.addLine(south);
        sydney.addLine(north);
        
        sydney.show_line(north);
        sydney.show_line(south);
        
    }	 
}
