package pl.lotto.numberreceiver.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public record InputNumberResultDto(
        UUID uniqueLotteryId,
        String resultMessage,
        LocalDateTime drawDate
) {
}
