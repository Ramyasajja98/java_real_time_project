package java8;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
	public static void main(String[] args) {  
        List<String> name = new ArrayList<String>();  
        name.add("kajal");  
        name.add("pooja");  
        name.add("cherry");  
        name.add("pinky");  
        System.out.println("using lambda expression for function");  
        name.forEach(names -> System.out.println(names));  
          
    }  
}
