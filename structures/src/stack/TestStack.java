package stack;

public class TestStack {
	
	public static void main(String args[]) {
		
		Employee e1 = new Employee("Nancy", 30);
		Employee e2 = new Employee("Erick", 33);
		Employee e3 = new Employee("Chispa", 3);
		
		StackArray sa = new StackArray(3);
		sa.push(e1);
		sa.push(e2);
		sa.push(e3);
		
		sa.printStack();
		
		Employee ePop = sa.pop();
		Employee ePeek = sa.pop();
		
		System.out.println("Pop: " + ePop);
		System.out.println("Peek: " + ePeek);
		
		sa.printStack();
		
	}

}
