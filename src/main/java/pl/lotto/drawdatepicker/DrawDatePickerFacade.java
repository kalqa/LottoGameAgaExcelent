package pl.lotto.drawdatepicker;

import java.time.LocalDateTime;

public class DrawDatePickerFacade {

    public DrawDatePickerDto nextDrawDate() {
        return new DrawDatePickerDto(LocalDateTime.now());
    }
}
