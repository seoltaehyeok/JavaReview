package sec01;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		//�ʵ�ȣ��
		anony.field.turnOn();
		anony.field.turnOff();
		
		//�޼ҵ�ȣ��
		anony.method1();
		
		//�Ű����� ȣ�� �����ǵ� �͸�����ü�� �����̵ȴ�.
		anony.method2(new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Smart Tv�� �մϴ�.");
				
			}@Override
			public void turnOff() {
				System.out.println("Smart Tv�� ���ϴ�.");
				
			}
		});
		
	}
}
