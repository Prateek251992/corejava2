package oop.core1;

public class AShapeTest1 {
	public static void main(String[] args) {
		ARectangle1 Ar= new ARectangle1();
		Ar.area();
		Ar.area(10);
		Ar.area();
		
		System.out.println(" ");
		ARectangle1 ar = new ARectangle1();
		ar.area();
		ar.area(10,40);
		
		System.out.println(" ");
		ACircle1 ac = new ACircle1();
		ac.sum();
		ac.sum(20);
		
		System.out.println(" ");
		ATringle1 at = new ATringle1();
		at.sub();
		at.sub(10,10);
		
	}

}
