public class CountNumbers {
    public static void main(String[] args) {
        int[] arr = {5,-2,0,8,-1,0};

        int positive = 0, negative = 0, zero = 0;

        for(int num : arr){
            if(num > 0)
                positive++;
            else if(num < 0)
                negative++;
            else
                zero++;
        }

        System.out.println("Positive = " + positive);
        System.out.println("Negative = " + negative);
        System.out.println("Zero = " + zero);
    }
}
