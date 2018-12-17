public class Sequence {
    public static final int COEFFICIENT = 1_000;
    public static final int COEFFICIENT_TWO = 100;
    public static final int COEFFICIENT_THREE = 10;
    public static int checkSequence(int n){
        int result = 0;
        int FouthDischarge = n / COEFFICIENT;
        int ThirdDischarge = n % COEFFICIENT / COEFFICIENT_TWO;
        int SecondDischarge = n % COEFFICIENT_TWO / COEFFICIENT_THREE;
        int FirstDiscarge = n % COEFFICIENT_THREE;

        if(FouthDischarge < ThirdDischarge && ThirdDischarge < SecondDischarge && SecondDischarge < FirstDiscarge){
            result = 1;
        }
        else if(FouthDischarge > ThirdDischarge && ThirdDischarge > SecondDischarge && SecondDischarge > FirstDiscarge){
            result = 0;
        }
        else result = -1;
        return result;
    }
}
