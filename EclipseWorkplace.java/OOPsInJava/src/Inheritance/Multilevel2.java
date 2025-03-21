package Inheritance;

class P{
	public void PM(){
		System.out.println("This is the parent class");
	}
}

class C1 extends P{
	public void C1M() {
		System.out.println("This is child1 class");
	}
}

class C2 extends P{
	public void C2M() {
		System.out.println("This is child2 class");
	}
}
public class Multilevel2 {

	public static void main(String[] args) {
		P p = new P();
		p.PM();
		
		C1 c1 = new C1();
		c1.C1M();
		c1.PM();
		
		C2 c2 = new C2();
//		c2.C1M();
		c2.C2M();
		c2.PM();

	}

}
