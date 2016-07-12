public class Main {

    public static void main(String[] args){
        
        int totalValue = initArray(10);
        int minValue = 0;
        
        if (totalValue > 0) {
            minValue = 1 - totalValue;
        } else { 
            minValue = totalValue - 1;
        }

        System.out.println("\n min value : " + minValue);
    } 

    public static int initArray(int size) {
        
        int[] list = new int[size];
        int totalValue = 0;
        
        for (int i : list) {
           
            int randomValue = (int) (Math.random() * (10 + 10 + 1)) - 10 ;
            totalValue += randomValue;
            list[i] = randomValue;
            System.out.print(randomValue + " ");
            
        }

        return totalValue;
    }
}