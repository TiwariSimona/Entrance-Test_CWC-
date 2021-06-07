import java.util.HashMap;

public class solution_1 {

	static int min_swap_count(int arr[]) {
		boolean visited[]=new boolean[arr.length+1];
		HashMap<Integer, Integer> hshmp=new HashMap<>();
		
		for (int i =1; i < visited.length; i++) {
			h.put(i,arr[i-1]);
		}
		int swapcount=0;
		
		for (int i =1; i <=hshmp.size(); i++) {
			if (visited[i]==false) {
				visited[i]=true;
				
				if (i==hshmp.get(i)) {
					continue;
				}
				else {
					int c=hshmp.get(i);
					while(!visited[c]) {
				     visited[c]=true;
				     int next=hshmp.get(c);
				     c=next;
				     swapcount++;
				     
					}
				}
			}
		}
		return swapcount;
	}
	
	public static void main(String[] args) {
		
		int arr[]= {3,4,1,2};
		System.out.println("the minimum number of swap require to sort the array is: "+min_swap_count(arr));

	}

}
