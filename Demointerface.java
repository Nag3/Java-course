
public class Demointerface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Z z=new Z();
		z.fun1();
		P p=new Z();
		//P py=new Y();
		z.aF1();
		z.pF1();

	}
}
	
	class X{
		void fun1() {}
		void fun2() {}
		void fun3() {}
		void fun4() {}
		void fun5() {}
	}
	class Y extends X{
		void fun6() {}
		void fun7() {}
	}
	interface A{
		void  aF1();
		void  aF2();
	}
interface B extends A{
	void  bF1();
	void  bF2();
	
}
 interface P{
	 void  pF1();
	 void  pF2();
 }
 interface Q extends P{
	 void  qF1();
 }
 interface R extends Q{
	 void  rF1();
 }
 class Z extends Y implements B,R{

	@Override
	public
	 void aF1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aF2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void qF1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pF1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pF2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public
	 void rF1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bF1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bF2() {
		// TODO Auto-generated method stub
		
	}
	 
 }
 
