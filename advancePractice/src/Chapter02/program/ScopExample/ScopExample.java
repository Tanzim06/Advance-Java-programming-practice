package Chapter02.program.ScopExample;

public class ScopExample {
	
	public int x=0;
	
	public void print(){
		
		int x=1;
		System.out.println(x);
		System.out.println(this.x);
		
	}

	public static void main(String[] args) {
		ScopExample example= new ScopExample();
		example.print();
	}

}
