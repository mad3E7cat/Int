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