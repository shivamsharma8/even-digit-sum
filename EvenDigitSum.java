public class EvenDigitSum {

    public static int getEvenDigitSum(int number){

        if (number<0){

            return -1;
        }
        else {
            int rem=0;
            int sum =0;
            while (number !=0){
                rem =number%10;
                if (rem% 2==0) {
                    sum = sum + rem;
                }


                number = number/10;
            }
            return sum;
        }
    }
}
