package sec02;

public class AutoBoxing {
	
	public static void main(String[] agrs) {
		
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());
		
		int value = obj;
		System.out.println("value: " + value);
		
		int result = obj + 100; //obj에 포장되어 있는값(100) + 100
		System.out.println("result: "+ result);
		
	}
}
