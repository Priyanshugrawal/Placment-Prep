public class ThreeSum {
   public static void main(String[] args){
    int arr[]={2, 4, 1, 6, 5, 3};
    int target=10;
    int n=arr.length;
    for(int i=0;i<n;i++){
        for(int j =i+1;j<n;j++){
            for(int k =j+1;k<n;k++){
                if(arr[i]+arr[j]+arr[k]==target){
                    System.out.println("indices:"+i+','+ j+','+k);
                    System.out.println("values:"+arr[i]+','+ arr[j]+','+arr[k]);
                    return;
                }
            }
        }
    } 
    System.out.println("No triplet found that sums to the target.");
  } 
}
