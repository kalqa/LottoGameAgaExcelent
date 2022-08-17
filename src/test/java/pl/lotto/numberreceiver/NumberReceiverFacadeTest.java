package pl.lotto.numberreceiver;

import java.util.List;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class NumberReceiverFacadeTest {

    @Test
    public void should_return_correct_message_when_six_correct_numbers() {
        // given
        NumberReceiverFacade numberReceiverFacade = new NumberReceiverFacade();
        List<Integer> numbersFromUser = List.of(1, 2, 3, 4, 5, 6);

        // when
        InputNumberResultDto result = numberReceiverFacade.inputNumbers(numbersFromUser);

        // then
        assertThat(result).isEqualTo(new InputNumberResultDto(UUID.fromString("5b960162-1e34-11ed-861d-0242ac120002")));
    }

    @Test
    public void should_return_failed_message_when_numbers_out_of_range() {
        // given
        NumberReceiverFacade numberReceiverFacade = new NumberReceiverFacade();
        List<Integer> numbersFromUser = List.of(111, 111, 111, 111, 111, 111);

        // when
        InputNumberResultDto result = numberReceiverFacade.inputNumbers(numbersFromUser);

        // then
        assertThat(result.uniqueLotteryId()).isNull();
    }

}
