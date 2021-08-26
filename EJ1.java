public class EJ1 {
    public static void main(String[] args) throws Exception {
        // Your code here!
        int[] array = new int[]{30,2,6,1,5};

        System.out.println("ARRAY NORMAL:");
        for (int i : array){
            System.out.println(i);
        }
        
        int temp = 0;
        int arraySize = array.length;
        for(int i = 0; i < arraySize/2; i++){
            
            temp = array[i];
            array[i] = array[arraySize-i-1];
            array[arraySize-i-1] = temp;
           
        }
        
        
        System.out.println("ARRAY INVERTIDO:");
        for(int i : array){
            System.out.println(i);
        }
    }
}

