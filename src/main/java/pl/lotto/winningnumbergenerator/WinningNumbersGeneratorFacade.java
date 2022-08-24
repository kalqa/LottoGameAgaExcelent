//package pl.lotto.winningnumbergenerator;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//
//import static pl.lotto.numberreceiver.LottoConfig.*;
//
//public class WinningNumbersGeneratorFacade {
//    public List<Integer> generateRandomNumbers() {
//        List<Integer> arrayOfRandomNumbers = new ArrayList<>();
//        Random randomNumber = new Random();
//        int min = LOWEST_NUMBER_FROM_USER;
//        int max = MAX_NUMBER_FROM_USER;
//        while (arrayOfRandomNumbers.size() < NUMBER_OF_LOTTO_NUMBERS) {
//            int pickedRandomNo = randomNumber.nextInt(max - min + 1) + min;
//            if (!arrayOfRandomNumbers.contains(pickedRandomNo)) {
//                arrayOfRandomNumbers.add(pickedRandomNo);
//            }
//        }
//        System.out.println("Winning numbers: " + arrayOfRandomNumbers);
//        return arrayOfRandomNumbers;
//    }
//}
