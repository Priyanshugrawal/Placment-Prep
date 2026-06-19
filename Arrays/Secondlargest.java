public class Secondlargest {
    public static void main(String[]args){
        int arr[]={12,24,7,89,23,5,67};
    int largest=Integer.MIN_VALUE;
    int secondlargest=Integer.MIN_VALUE;
    for(int i=0; i <arr.length;i++){
        if(arr[i]>largest){
            secondlargest=largest;
            largest=arr[i];
        }
        else if(arr[i]>secondlargest && arr[i]!=largest){
         secondlargest = arr[i];
        }
    }
        System.out.println("largest element:"+largest);
        System.out.println("second largest element="+secondlargest);
    }
    }


