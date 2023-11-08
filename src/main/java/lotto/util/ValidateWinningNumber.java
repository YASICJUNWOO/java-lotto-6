package lotto.util;

import java.util.ArrayList;
import java.util.List;

public class ValidateWinningNumber {

    private static List<Integer> winningNumberList = new ArrayList<>();

    public static List<Integer> validateWinningNumber(String inputValue) {

        String[] winningNumberStringArray = inputValue.split(",");
        isSixNumber(winningNumberStringArray);

        return winningNumberList;
    }


    private static void isSixNumber(String[] winningNumber) {

        if (winningNumber.length != 6) {
            throw new IllegalArgumentException("[ERROR] 6개의 숫자를 입력해주세요.");
        }

    }

    private static void isRange(int WinningNumber) {

            if(WinningNumber < 1 || WinningNumber > 45){
                throw new IllegalArgumentException("[ERROR] 1~45 사이의 숫자를 입력해주세요.");
            }

    }

}
