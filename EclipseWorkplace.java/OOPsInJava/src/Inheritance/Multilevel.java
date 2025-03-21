package Inheritance;

class GrandParentClass{
	public void GrandParentMethod() {
		System.out.println("This is Grand Method");
	}
}

class ParentClass extends GrandParentClass {
	public void parentMethod() {
		System.out.println("This is parent method");
	}
}

class ChildClass extends ParentClass{
	public void childmethod() {
		System.out.println("This is Class method");
	}
}
public class Multilevel {
	public static void main(String[] args) {
		GrandParentClass gc = new GrandParentClass();
		gc.GrandParentMethod();
		
		ParentClass pc = new ParentClass();
		pc.GrandParentMethod();
		pc.parentMethod();
		
		ChildClass cc = new ChildClass();
		cc.GrandParentMethod();
		cc.parentMethod();
		cc.childmethod();
		
	}
}
