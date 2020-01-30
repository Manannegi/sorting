package sorting;

public class New {  
    static void bubbleSort(int[] arr) {  
        int a = arr.length;  
        int temp = 0;  
        for(int i=0; i < a; i++){  
        	for(int j=1; j < (a-i); j++){  
                if(arr[j-1] > arr[j]){  
                   temp = arr[j-1];  
                   arr[j-1] = arr[j];  
                   arr[j] = temp;  
                  }         
              }  
         }  
  
    }  
    public static void main(String[] args) {  
                int arr[] ={5,33,2,48,100,3,555};  
                 
                System.out.println();  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                System.out.println();  
                  
                bubbleSort(arr);  
                 
                System.out.println("sorted array");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
   
        }  
}  
