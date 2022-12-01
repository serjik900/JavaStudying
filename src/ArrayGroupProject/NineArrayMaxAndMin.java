package ArrayGroupProject;

public class NineArrayMaxAndMin {

	public static void main(String[] args) {
		
				
		int[] arr= {20,1,33,44,85,-66,177};
		int max=arr[0];
		int min=arr[0];
		for (int i = 1; i < arr.length; i++) {
			  if (arr[i] > max) {
			    max = arr[i];
			  }
			  else if (arr[i] < min) {
			    min = arr[i];
			  }
			}

			System.out.println(max);	
			System.out.println(min);
						
		}
	}