package nestedclassInterface.nestedInterface;

public class Button {
	OnClickListener listener;

	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}

	void touch() {
		listener.onClick();
	}

	interface OnClickListener {
		void onClick();
	}

}

class CallListener implements Button.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}

}

class MessageListener implements Button.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("메세지를 보냅니다.");
	}

}
