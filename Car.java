package basic5;

public class Car {

	
	// 차가 가려면 연료가 있어야 하는데 gas
	
	// 차는 gas가 0인지 아닌지 여부를 확인해야 함
	
	// 만약에 gas가 0이면 차는 멈춰야 합니다.
	
	// 필
		
	int gas;
	
	
	// 생
	
	public Car() {
		
	}
	
	public Car(int gas) {
		this.gas = gas;
	}
	
	// 메
	
	String check() {
		
		System.out.println("출발합니다.");
		
		int remain = this.gas;
		
		while(true) {
			System.out.print("현재 남은 연료는 " + remain + "입니다.");
			
			if(remain == 0) {
				return " \n주행을 마칩니다.";
			} 
			
			System.out.println(" 주행하세요.");
			remain--;
		}
	}
	

	
	
	
}
