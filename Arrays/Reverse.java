public class Reverse {
    public static void main(String[] args){
    int arr[]={12,24,7,89,23,5,67};
    int start=0;
    int end= arr.length-1;
    while(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
    }
    System.out.println("Reversed array:");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
    }
    }
}


/* Reverse an array 
do pointer use karo
start--->beginning
end---->end
swap karo
arr[start] <--> arr[end]
start++
end--
jabtak start<end */