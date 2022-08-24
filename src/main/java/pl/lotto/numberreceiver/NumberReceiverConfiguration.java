package pl.lotto.numberreceiver;

import pl.lotto.drawdatepicker.DrawDatePickerFacade;

public class NumberReceiverConfiguration {



    public NumberReceiverFacade createModuleForTests(DrawDatePickerFacade drawDatePickerFacade) {
        NumberValidator numberValidator = new NumberValidator();
        return new NumberReceiverFacade(numberValidator, drawDatePickerFacade);
    }
}
