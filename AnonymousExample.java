package sec01;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		//필드호출
		anony.field.turnOn();
		anony.field.turnOff();
		
		//메소드호출
		anony.method1();
		
		//매개변수 호출 재정의된 익명구현객체가 실행이된다.
		anony.method2(new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Smart Tv를 켭니다.");
				
			}@Override
			public void turnOff() {
				System.out.println("Smart Tv를 끕니다.");
				
			}
		});
		
	}
}
