package sec02;

public class BoxingUnbBoxingExample {

	public static void main(String[] args) {
		//박싱
		Integer obj1 = 100; 
		Integer obj2 = 200;
		Integer obj3 = Integer.valueOf("300");
		
		//언박싱
		int value1 = obj1.intValue(); //obj1이 Integer타입이므로 intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);

		System.out.println(value2);

		System.out.println(value3);
		
	}

}
