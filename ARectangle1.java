package oop.core1;

public class ARectangle1 extends AShape1{
	
	private int length;
	private int width;
	
	public void area() {
		System.out.println("Rectangle defoult method...");
	}
	
	public void area(int length , int width) {
		System.out.println("Rectangle Method Two parsmeter");
	}

	@Override
	public void area(int a) {
		System.out.println("shape area method");
		
	}

}
