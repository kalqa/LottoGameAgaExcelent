package pl.lotto.numberreceiver;

import java.util.List;
import static pl.lotto.numberreceiver.LottoConfig.LOWEST_NUMBER_FROM_USER;
import static pl.lotto.numberreceiver.LottoConfig.MAX_NUMBER_FROM_USER;
import static pl.lotto.numberreceiver.LottoConfig.NUMBER_OF_LOTTO_NUMBERS;

class NumberValidator {

    boolean isAreAllNumbersInRange(List<Integer> numbersFromUser) {
        return numbersFromUser.stream()
                .allMatch(this::isInRange);
    }

    boolean isLessThanSixNumbers(List<Integer> numbersFromUser) {
        return numbersFromUser.size() < NUMBER_OF_LOTTO_NUMBERS;
    }

    private boolean isInRange(int number) {
        return number >= LOWEST_NUMBER_FROM_USER && number <= MAX_NUMBER_FROM_USER;
    }

}
