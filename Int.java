class Int{
	private int value;
	Int(){
		value = 0;
	}
	Int(int v){
		value = v;
	}
	public int get(){
		return value;
	}
	public void decrement(){
		value--;
	}
	public void increment(){
		value++;
	}
	public void add(Int n){
		value += n.get();
	}
	public void mul(Int n){
		// only addittion
		int tmp = value;
		for(int i = 0; i < n.get() - 1; i++){
			value += tmp;
		}
	}
	public void substract(Int n){
		value -= n.get();
	}
	public String toString(){
		return "" + value;
	}
}