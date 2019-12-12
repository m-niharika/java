import java.util.ArrayList;
import java.util.List;

public class GenericsMain {
	public static void main(String[] args){
		GenericClass obj= new GenericClass();
		GenericClass obj1= new GenericClass();
		
List<Object> al = new ArrayList<>();
al.add("Hello");
al.add(12);

obj.listAdd(al);



	}
}
