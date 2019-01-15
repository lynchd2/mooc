public class Counter {

	private int value;
	private boolean check;

	public Counter(int startingValue, boolean check){
		this.value = startingValue;
		if (check == true) {
			this.check = true;
		} else {
			this.check = false;
		}
	}

	public Counter(int startingValue){
		this.value = startingValue;
		this.check = false;
	}

	public Counter(boolean check) {
		this.value = 0;
		if (check == true) {
			this.check = true;
		} else {
			this.check = false;
		}
	}

	public Counter() {
		this.value = 0;
		this.check = false;
	}

	public int value() {
		return this.value;
	}

	public void increase() {
		this.value = this.value++;	
	}

	public void decrease(){
		if(this.check == false){
			this.value++;
		} else if (this.check == true && this.value > 0) {
			this.value++;
		}
	}

	public void increase(int increaseAmount){
		if (increaseAmount > 0){
			this.value = this.value + increaseAmount;
		}
	}

	public void decrease(int decreaseAmount) {
		if(this.check == true && decreaseAmount > 0) {
			if(this.value - decreaseAmount >= 0) {
				this.value = this.value - decreaseAmount;
			}
		} else if (decreaseAmount > 0) {
			this.value = this.value - decreaseAmount;
		}
	}
}