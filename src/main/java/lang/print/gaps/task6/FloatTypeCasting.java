package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        //Taking away decimals by casting the type to int
        int intNumberWithoutDecimals = (int) numberToBeRounded + 1;
        //returning the number without decimals to float for further calculations
        float floatNumberWithoutDecimals = (float) intNumberWithoutDecimals - 1;

        int answer = (numberToBeRounded-floatNumberWithoutDecimals) * 10 >= 5 ? (int) numberToBeRounded + 1 : (int) numberToBeRounded;
        System.out.println(answer);
    }
}
