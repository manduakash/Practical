
public class ParaConstructor {

	String name;
	
	ParaConstructor(String name1){
		name=name1;
	}
	public static void main(String[] args) {
		ParaConstructor obj1 = new ParaConstructor("C++");
		ParaConstructor obj2 = new ParaConstructor("Java");
		ParaConstructor obj3 = new ParaConstructor("Python");
		
		System.out.println(obj1.name);
		System.out.println(obj2.name);
		System.out.println(obj3.name);
	}

}
