package pl.lotto.numberreceiver;

import java.util.List;
import java.util.UUID;

public class NumberReceiverFacade {

    public InputNumberResultDto inputNumbers(List<Integer> numbersFromUser) {

        return new InputNumberResultDto(UUID.fromString("5b960162-1e34-11ed-861d-0242ac120002"));
    }

}
