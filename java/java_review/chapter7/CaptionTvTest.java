// Example of inheritance

class Tv {
	boolean power;
	int channel;
	
	// Methods
	void power() {
		power = !power;
	}
	
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}
	
	
}

// Tv 클래스 상속(Tv 멤버 사용 가능)
class CaptionTv extends Tv {
	boolean captionState; // Caption status on/off
	void displayCaption(String text) {
		if (captionState) {
			System.out.println(text); // If caption is true show text
		}
		else {
			System.out.println("Caption is off right now.");
		}
	}
}

class CaptionTvTest {
	public static void main(String[] args) {
		CaptionTv captionTv = new CaptionTv(); // Create an instance
        captionTv.channel = 10;
        captionTv.channelUp();
        System.out.printf("Caption Tv's channel is now %d.%n", captionTv.channel);
        captionTv.displayCaption("hello, world"); // Caption does not work
        captionTv.captionState = true; // Turn on the caption
        captionTv.displayCaption("hello, world");
	}

}
