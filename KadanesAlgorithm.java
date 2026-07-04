//Maximum SubArray Sum
public class KadanesAlgorithm {
    public static void byKadanes(int arr[]){
        int n=arr.length;
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            currsum+=arr[i];
            maxsum=Math.max(currsum,maxsum);
            if(currsum<0){
                currsum=0;
            }
        }
        System.out.println("The maxsum is: "+maxsum);
    }
   public static void main(String[] args){
    int arr[]={-5,-2,-3,-4,-5};
    byKadanes(arr);
   } 
}

//T.C=O(n) and S.C=O(1)
//It is a type of Dynamic Programming
