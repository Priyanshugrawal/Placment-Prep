public class RemoveDuplicatesFromSortedArray {
    public static void main(String []args){
 int[]arr={1,1,2,2,3,4,4,5};
 int n =arr.length;
 int j=0;//pointer for unique elements
 for(int i=0;i<n-1;i++){
    if(arr[i]!=arr[i+1]){
        arr[j]=arr[i];
        j++;

    }
 }
 //handle the last element
 arr[j]=arr[n-1];
 j++;
 System.out.println("Array after removing duplicates:");
 for(int i=0;i<j;i++){
    System.out.print(arr[i] + " ");
 }


    }
}