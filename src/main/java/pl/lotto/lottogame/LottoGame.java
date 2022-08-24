package pl.lotto.lottogame;

import pl.lotto.numberreceiver.NumberReceiverFacade;
import pl.lotto.resultchecker.ResultChecker;
import pl.lotto.winningnumbergenerator.WinningNumbersGenerator;

import java.util.List;
import java.util.Set;

public class LottoGame {
    NumberReceiverFacade playerInput;
    WinningNumbersGenerator generator;
    ResultChecker result;

    LottoGame(NumberReceiverFacade playerInput, WinningNumbersGenerator generator, ResultChecker result) {
        this.playerInput = playerInput;
        this.generator = generator;
        this.result = result;
    }

    public startGame() {
        Set<Integer> playerNumbers = playerInput.getPlayerNumbers();

//        LottoNumberGenerator generator = new LottoNumberGenerator();
        List<Integer> winningNumbers = generator.generateRandomNumbers();

//        ResultChecker result = new ResultChecker();
        return String result1 = result.checkIfWinning(playerNumbers, winningNumbers));
    }

//    @Override
//    public String name() {
//        return "Lotto Game!";
//    }
}
