
public class MutableStrings {
	
	public static void main(String[] args) {
		
	StringBuffer s = new StringBuffer("hello");
	s.append("world");
	System.out.println("append: "+s);
	
	s.insert(2, "Rya");
	System.out.println("insert: "+s);
	
	s.replace(1, 3, "java");
	System.out.println("replace: "+s);
	
	s.delete(1,3);
	System.out.println("delete: "+s);
	
	s.reverse();
	System.out.println("reverse: "+s);
	
	}
	
}
