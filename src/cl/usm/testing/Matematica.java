package cl.usm.testing;

public class Matematica {
	
	private int a;
	private int b;
	
	public Matematica(int a, int b) {
		this.a = a;
		this.b = b;
		
	}
	
	public int suma(){
		return a + b;
	}
	
	public int multiplicar(){
		return a * b;
	}

	public int restar() {
		if(a < b){
			return 0;
		}
		return a - b;
	}
}
