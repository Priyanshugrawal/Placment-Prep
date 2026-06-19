/* Find the majority element in an array 
Array = {2, 2, 1, 2, 3, 2, 2}

n = 7
n/2 = 3.5

2 appears 5 times.

Since 5 > 3.5, the majority element is 2.*/
//brute force approach
public class MajorityElement {
    public static void main(String[]  args){
        int arr[]={2,2,1,2,3,2,2};
        int n=arr.length;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if (count>n/2){
                System.out.println("Majority element is: " + arr[i]);
                return;
            }
        }
        System.out.println("No majority element found.");
    }
}