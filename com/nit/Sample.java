package com.nit;
class A{
	int a1=100,a2=200;
	void m1() {
		System.out.println("From A:: m1()....a1-->"+a1);
	}
	void m2() {
		System.out.println("From A:: m2()....a2-->"+a2);
	}
}
class B extends A{
	int b1=100,b2=200;
	void bm1() {
		System.out.println("From B:: bm1()....b1-->"+b1);
	}
	void bm2() {
		System.out.println("From B:: bm2()....b2-->"+b2);
	}
	
	void m1() {
		System.out.println("From B:: m1()....a1-->"+a1);
	}
	
	
	
	
}

public class Sample {

	public static void main(String[] args) {
	
			A aObj = new A();
			B bObj = new B();
			
			
			bObj.m1();
			bObj.m2();
			
			
			
		
	}

}
