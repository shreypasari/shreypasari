import java.util.ArrayList;

public class ArrayIterator {
	
	private ArrayList<String> a; 
	ArrayIterator() {
		this.a = new ArrayList<String>();
		
	}
	
	public void IteratorFunction() {
		
		for(String s:a){
			System.out.println(s);
		}
	}
	public static void main(String args[]) {
		ArrayIterator obj = new ArrayIterator();
		obj.a.add("Hello");
		obj.a.add("World");
		obj.IteratorFunction();
	}

}
