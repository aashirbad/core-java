
public class Swap {

	public static void main(String[] args) {
		int a[] =new int [2];
		a[0] =10;
		a[1] =20;
		System.out.println("The value before swap \n a : " + a[0] +"\n b : " + a[1]);
		swap(a);
		System.out.println("The value after swap \n a : " + a[0] +"\n b : " + a[1]);

	}
	public static void swap(int x[])
	{
		
		x[0]=  x[0] + x[1];
		x[1] = x[0] - x[1]; 
		x[0] = x[0] - x[1];
	}

}
