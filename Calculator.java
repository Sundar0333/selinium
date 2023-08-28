package week3.day1;

public class Calculator {
       public void add(int x,int y) {
	    System.out.println(x+y);
}
       public void add(int x,int y, int z) {
    	   System.out.println(x+y+z);
    	   
       }
       public void multi(double x, double y) {
    	   System.out.println(x*y);
    	   
       }
       public void multi(float x,float y) {
    	   System.out.println(x*y);
       }
	public static void main(String[] args) {
		Calculator obj = new Calculator();
		obj.add(5, 10);
		obj.add(5, 2, 6);
		obj.multi(5, 9);
		obj.multi(4.5, 9.0);
		
	}

}
