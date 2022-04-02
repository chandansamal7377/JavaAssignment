class Static {
	static int data;
	static void display() {
	data+=5;
	System.out.println("This is Static method");
	}
 	public static void main(String args[]) {
	System.out.println("This is main method");
	System.out.println("before initialisation " +data);
	display();
	data+=10;
	System.out.println("After initialisation " +data);
	}
static{
	System.out.println("This is static block");
	}
}
	