public class Duplicate {

    public static void main(String[] args) {
        int[] arr = {2,10,1,24,2,9,28,24};
        int n = arr.length;
        boolean isDuplicate = findingDuplicates(arr, n);
        System.out.println(isDuplicate);
        int[] returnArr = removeElement(arr,n,9);
        for(int i = 0;i<returnArr.length;i++) {
        	 System.out.println(returnArr[i]);
        }
    }

    public static boolean findingDuplicates(int[] arr, int n) {
        if (n == 0) {
            return false;
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) { 
                if (arr[i] == arr[j]) {
                    return true; 
                }
            }
        }
        return false; 
    }
    public static int[] removeElement(int[] arr, int n,int number) {
    	int count = 0;
    	for(int i = 0;i<n;i++) {
    		if(arr[i]==number) {
    			count++;
    			
    		}
    	}
    	int[] newArr = new int[n-count];
    	int j = 0;
    	for(int i = 0;i<n;i++) {
    		if(arr[i]!=number) {
    				newArr[j]=arr[i];
    				if(j<=newArr.length) {
    				j++;
    			}
    		}
    	}
    	
    	return newArr;
    }
}
