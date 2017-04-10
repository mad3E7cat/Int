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
class TestClass{
	public static void main(String[] args) {
		//test task
		//Int int0 = new Int();
		//while(!int0.toString().equals("1000")){
		//	int0.increment();
		//}
		//
		//System.out.println(int0.toString());
		//
		Int int2 = new Int(70);
		Int int1 = new Int(3);
		int2.mul(int1);
		System.out.println(int1.toString());
		System.out.println(int2.toString());
	}
}
// mul with add