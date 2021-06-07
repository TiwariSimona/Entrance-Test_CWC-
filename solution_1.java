import java.util.HashMap;

public class Ques1 {

	static int min_swap_count(int array[]) {
		boolean isVisited[]=new boolean[array.length+1];
		HashMap<Integer, Integer> h=new HashMap<>();
		
		for (int i =1; i < isVisited.length; i++) {
			h.put(i,array[i-1]);
		}
		int swapcount=0;
		
		for (int i =1; i <=h.size(); i++) {
			if (isVisited[i]==false) {
				isVisited[i]=true;
				
				if (i==h.get(i)) {
					continue;
				}
				else {
					int c=h.get(i);
					while(!isVisited[c]) {
				     isVisited[c]=true;
				     int next=h.get(c);
				     c=next;
				     swapcount++;
				     
					}
				}
			}
		}
		return swapcount;
	}
	
	public static void main(String[] args) {
		
		int array[]= {3,4,1,2};
		System.out.println("the minimum number of swap require to sort the array is: "+min_swap_count(array));

	}

}
