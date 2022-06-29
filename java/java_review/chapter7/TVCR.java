// Java는 다중상속 허용하지 않으므로 하나의 클래스는 상속, 다른 하나는 포함관계를 이용

class MyTv {
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
}

class VCR {
	boolean power;
	int counter = 0;
	
	void power() {
		power = !power;
	}
	
	void play() {
		
	}
	
	void stop() {
		
	}
	
	void rew() {
		
	}
	
	void ff() {
		
	}
	
}

class TVCR extends MyTv {
    VCR vcr = new VCR(); // Composite VCR class
    
    void play() {
    	vcr.play();
    }
    
    void stop() {
    	vcr.stop();
    }
}
