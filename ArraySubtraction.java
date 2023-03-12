package javaprojects;
public class ArraySubtraction {
    public static void main(String[] args) {
        int first[]={9,1,8,9,2};
        int second[]={2,1,1,5};
        int result[]=new int [first.length];
        int i = first.length-1;
        int j = second.length-1;
        int k = result.length-1;
        int carry  = 0;
        int diff = 0;

        while(k>=0){

            if(j>=0){
                if(first[i]<second[j]){
                    diff= first[i]+10+carry-second[j];
                    carry=-1;
                }

                else{
                    diff=first[i]+carry-second[j];
                    carry=0;
                }
            }
            else{
                if(i>=1 && carry==-1){
                    diff = first[i]+carry+10;
                }

                else{
                    diff=first[i]+carry;
                }
            }
            result[k]=diff;
            k--;
            i--;
            j--;
        }
       
        for(int r:result){
            System.out.print(r);
        }
    }
    
}


