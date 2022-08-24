package pl.lotto.numberreceiver;

import java.util.List;
import java.util.UUID;
import pl.lotto.drawdatepicker.DrawDatePickerDto;
import pl.lotto.drawdatepicker.DrawDatePickerFacade;
import pl.lotto.numberreceiver.dto.InputNumberResultDto;

public class NumberReceiverFacade {

    private final NumberValidator numberValidator;
    private final DrawDatePickerFacade drawDatePickerFacade;

    NumberReceiverFacade(NumberValidator numberValidator, DrawDatePickerFacade drawDatePickerFacade) {
        this.numberValidator = numberValidator;
        this.drawDatePickerFacade = drawDatePickerFacade;
    }

    public InputNumberResultDto inputNumbers(List<Integer> numbersFromUser) {
        if (numberValidator.isLessThanSixNumbers(numbersFromUser)) {
            return new InputNumberResultDto(
                    null,
                    "you should give six numbers",
                    null);
        }

        boolean areAllNumbersInRange = numberValidator.isAreAllNumbersInRange(numbersFromUser);

        if (!areAllNumbersInRange) {
            return new InputNumberResultDto(
                    null,
                    "at least one number is out of range 1 - 99",
                    null);
        }

        DrawDatePickerDto drawDatePickerDto = drawDatePickerFacade.nextDrawDate();

        return new InputNumberResultDto(
                UUID.fromString("5b960162-1e34-11ed-861d-0242ac120002"),
                "all went good",
                drawDatePickerDto.drawDate());
    }

}
