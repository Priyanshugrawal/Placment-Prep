public class Thirdlargest {
    public static void main(String []args){
        int arr[]={12,24,7,89,23,5,67};
        int largest=Integer.MIN_VALUE;
    int secondlargest=Integer.MIN_VALUE;
    int thirdlargest=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
            thirdlargest=secondlargest;
            secondlargest=largest;
            largest=arr[i];
        }
        else if(arr[i]>secondlargest && arr[i]!=largest){
            thirdlargest=secondlargest;
            secondlargest=arr[i];
        }
        else if (arr[i]> thirdlargest && arr[i]!=secondlargest && arr[i]!=largest){
            thirdlargest=arr[i];
        }
    }
 System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + secondlargest);
        System.out.println("Third Largest = " + thirdlargest);
    }
}
