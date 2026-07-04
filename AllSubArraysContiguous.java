public class AllSubArraysContiguous {
    public static void  printArrays(int arr[]){
        int n=arr.length;
        int maxsum=Integer.MIN_VALUE;
        System.out.println("All The SubArrays of the Array are: ");
        for(int start=0;start<n;start++){
            for(int end=start;end<n;end++){
                int sum=0;
                System.out.print("[");
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]);
                    sum+=arr[k];
                    if(k!=end){
                        System.out.print(",");
                    }
                }
               System.out.println("]");
               if(sum>maxsum){
                maxsum=sum;
               }
            }
        }
        System.out.println("The Maximum sum of the subarray is : "+maxsum);
    }
    public static void main(String[] args) {
        int arr[]={1,-2,-4,5,6,7};
        printArrays(arr);
    }
}

//Brute Force Approach->T.C=O(n^3) And S.C=O(n)