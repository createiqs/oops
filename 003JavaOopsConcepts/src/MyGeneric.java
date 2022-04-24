
public class MyGeneric<T> {

	private T t;
	
	

	public MyGeneric() {
 	}

	public MyGeneric(T t) {
		super();
		this.t = t;
	}

	public T getT() {
		return t;
	}

	public <E> void printElement(E[] arr) {
		for (E e : arr) {
			System.out.println(e);
		}
		
		

	}

	
	
	public static void main(String[] args) {
		Integer [] arr= {10,20,30,40,50};
		MyGeneric<Integer[]> numbers=new MyGeneric< >(arr);
		numbers.printElement(arr);
		
	}
}
