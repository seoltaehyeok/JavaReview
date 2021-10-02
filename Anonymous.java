package sec01;

public class Anonymous {
	 //익명구현객체 생성
	RemoteControl field = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("tv를 켭니다.");
			
		}@Override
		public void turnOff() {
			System.out.println("tv를 끕니다.");
			
		}
	};
	
	void method1() {
		 //인터페이스타입 지역변수
		RemoteControl localVar = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다.");
			}
			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
			}
		};
		
		localVar.turnOn();
		localVar.turnOff();
	}
	//인터페이스타입 매개변수
	void method2(RemoteControl rc) { 
		rc.turnOn();
		rc.turnOff();
	}
}
