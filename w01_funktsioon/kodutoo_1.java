import java.util.Arrays;

public class kodutoo_1 {  
    static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;
        int loops = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){
                                 loops += 1;  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp; 
                                  
                         }  
                          
                 }  
         }  
         System.out.println("Loopide arv on : " + loops);
    }  
    public static void main(String[] args) {  
                int arr[] ={3,60,35,2,45,320,5};  
                 
                System.out.println("Sorteerimata array");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                System.out.println();  
                  
                bubbleSort(arr);//array sortimine bubblesortimisega
                 
                System.out.println("Sorteetitud array");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                } 
   
        }
}  