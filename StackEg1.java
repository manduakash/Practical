package collections_package;

import java.util.Stack;

public class StackEg1 {

	public static void main(String[] args) {

		Stack<Integer> s=new Stack<>();
		boolean result =s.empty();
		System.out.println("is empty?"+result);
		s.push(25);
		s.push(35);
		s.push(40);
		s.push(55);
		s.push(80);
		s.push(75);
		System.out.println("stack elements"+s);
		Integer digit=s.peek();
		System.out.println("top element:"+digit);
int digit1=s.search(35);
System.out.println("search element:"+digit1);

int x=s.size();
System.out.println("size:"+x);
result=s.empty();
System.out.println("is empty?"+result);

	}

}
