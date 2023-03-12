public class barchart {
    static void Pattern(){

    }
   static int approch1(int arr[], int n){
        int m= arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>m){
                m=arr[i];
            }
        }
        return m;
    }
    public static void main(String[] args) {
        int arr[]={2,1,3,5,0,7};
        int k = arr.length;
       int max= approch1(arr,k);
   
    for(int i = max; i >= 1; i--) {
        for(int j = 0; j < k; j++) {
            if(i <= arr[j]) {
                System.out.print("*\t");
            }
            else {
                System.out.print("\t");
            }
        }
        System.out.println();
    }

}
}

