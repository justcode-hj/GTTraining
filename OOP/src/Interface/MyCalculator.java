package Interface;

public class MyCalculator implements AdvancedArithmetic{
    public int divisor_sum (int n){
        int divisorSum = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                divisorSum = divisorSum + i;
            }
        }
        return divisorSum;
    }
}
