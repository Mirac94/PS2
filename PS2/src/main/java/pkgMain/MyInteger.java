package pkgMain;

public class MyInteger {

	private int iValue;
	
	public MyInteger()
	{
		
	}
	public MyInteger(int iValue)
	{
		this.iValue = iValue;
	}
	public int getiValue() {
		return iValue;
	}
	public void setiValue(int iValue) {
		this.iValue = iValue;
	}
	public boolean isEven() {
		if (iValue % 2 == 0)
			return true;
		else
			return false;
	}
	public static boolean isEven(int iValue) {
		MyInteger myInt = new MyInteger(iValue);
		return myInt.isEven();
	}
	public static boolean isEven(MyInteger myInt) {
		return myInt.isEven();
	}
	public boolean isOdd() {
		if (iValue % 2 == 1)
			return true;
		else
			return false;
	}
	public static boolean isOdd(int iValue) {
		MyInteger myInt = new MyInteger(iValue);
		return myInt.isOdd();
	}
	public static boolean isOdd(MyInteger myInt) {
		return myInt.isOdd();
	}
	public boolean isPrime() {
	for (int i = 2; i < getiValue(); i++){
		if (getiValue()%2 == 0) 
			return false;
					}
		return true;
	
	}
	public static boolean isPrime(int iValue) {
		MyInteger myInt = new MyInteger(iValue);
		return myInt.isPrime();
	}
	public static boolean isPrime(MyInteger myInt) {
		return myInt.isPrime();
	}
	public boolean isEquals(int iValue) {
		if (this.iValue == iValue)
			return true;
		else
			return false;
	}
	
	//instance.isEquals(anotherInstance);
	public boolean isEquals(MyInteger myInt) {
		if (this.iValue == myInt.getiValue()) {
			return true;
		}
		return false;
	}
}

	