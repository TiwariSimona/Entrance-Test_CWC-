public class Ques5 {
	static int inversion(int []a) {
		int count=0;             
		
		for (int i = 0; i < a.length; i++) {
			for (int j =i+1; j < a.length; j++) {
				if (i<j &&a[i]>a[j] ) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
	int a[]= {2,5,8,11,3,6,9,13};
	System.out.println("the inversion icount in this array is "+inversion(a));

	}

}
