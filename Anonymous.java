package sec01;

public class Anonymous {
	 //�͸�����ü ����
	RemoteControl field = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("tv�� �մϴ�.");
			
		}@Override
		public void turnOff() {
			System.out.println("tv�� ���ϴ�.");
			
		}
	};
	
	void method1() {
		 //�������̽�Ÿ�� ��������
		RemoteControl localVar = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Audio�� �մϴ�.");
			}
			@Override
			public void turnOff() {
				System.out.println("Audio�� ���ϴ�.");
			}
		};
		
		localVar.turnOn();
		localVar.turnOff();
	}
	//�������̽�Ÿ�� �Ű�����
	void method2(RemoteControl rc) { 
		rc.turnOn();
		rc.turnOff();
	}
}
