package pl.lotto.numberreceiver;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import pl.lotto.drawdatepicker.DrawDatePickerDto;
import pl.lotto.drawdatepicker.DrawDatePickerFacade;
import pl.lotto.numberreceiver.dto.InputNumberResultDto;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class NumberReceiverFacadeTest {

    @Test
    public void should_return_correct_message_when_six_correct_numbers() {
        // given
        DrawDatePickerFacade drawDatePickerFacade = mock(DrawDatePickerFacade.class);
        DrawDatePickerDto drawDateMocked = new DrawDatePickerDto(LocalDateTime.of(2022, 8, 25, 1, 2, 0));
        when(drawDatePickerFacade.nextDrawDate()).thenReturn(drawDateMocked);
        NumberReceiverFacade numberReceiverFacade = new NumberReceiverConfiguration().createModuleForTests(drawDatePickerFacade);
        List<Integer> numbersFromUser = List.of(1, 2, 3, 4, 5, 6);

        // when
        InputNumberResultDto result = numberReceiverFacade.inputNumbers(numbersFromUser);

        // then
        InputNumberResultDto expected = new InputNumberResultDto(
                UUID.fromString("5b960162-1e34-11ed-861d-0242ac120002"),
                "all went good",
                drawDateMocked.drawDate());
        assertThat(result).isEqualTo(expected);
    }
//
//    @Test
//    public void should_return_failed_message_when_numbers_out_of_range() {
//        // given
//        NumberReceiverFacade numberReceiverFacade = new NumberReceiverConfiguration().createModuleForTests(drawDatePickerFacade);
//        List<Integer> numbersFromUser = List.of(111, 111, 111, 111, 111, 111);
//
//        // when
//        InputNumberResultDto result = numberReceiverFacade.inputNumbers(numbersFromUser);
//
//        // then
//        assertThat(result.uniqueLotteryId()).isNull();
//        assertThat(result.resultMessage()).isEqualTo("at least one number is out of range 1 - 99");
//    }
//
//    @Test
//    public void should_return_failed_message_when_user_gave_less_than_six_numbers() {
//        // given
//        NumberReceiverFacade numberReceiverFacade = new NumberReceiverConfiguration().createModuleForTests(drawDatePickerFacade);
//        List<Integer> numbersFromUser = List.of(111);
//
//        // when
//        InputNumberResultDto result = numberReceiverFacade.inputNumbers(numbersFromUser);
//
//        // then
//        assertThat(result.uniqueLotteryId()).isNull();
//        assertThat(result.resultMessage()).isEqualTo("you should give six numbers");
//    }

}
