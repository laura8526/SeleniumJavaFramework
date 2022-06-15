package Exception_Handling;

public class Application_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			demo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
		/*	try {
			System.out.println("Hello World");
			int i =1/0;
			System.out.println("Completed");
				}
		catch(Exception exp) {
			System.out.println("I am inside catch block");
			System.out.println("Message is: " + exp.getMessage());
			System.out.println("Cause is : "+exp.getMessage());
			exp.printStackTrace();
		}
		finally {
			System.out.println("I am inside finally block");
		}*/

	private static void demo() throws Exception{
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		throw new ArithmeticException("not valid operation");
		//int i =1/0;
		//System.out.println("Completed");
	}

}