
public class MyGenImplement<E, K> implements MyGen<E> {

	private E e;
	private K k;
	public E getE() {
		return e;
	}

	public K getK() {
		return k;
	}

	@Override
	public void setValue(E e) {
		this.e=e;
	}

	@Override
	public E getValue() {
		return this.e;
	}
	
	
	public void setK(K k) {
		this.k = k;
	}

	public static void main(String[] args) {
		MyGenImplement<String , Integer> myGen=new MyGenImplement<>();
		myGen.setValue("anil");
		myGen.setK(123);
		System.out.println(myGen.getValue()+ "\t "+ myGen.getK());
		
		
		
	}

}
