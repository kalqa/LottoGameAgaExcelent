package pl.lotto.numberreceiver;

import java.util.*;

import static pl.lotto.configuration.LottoConfig.*;

public class NumberReceiverFacade {

    public InputNumberResultDto inputNumbers(List<Integer> numbersFromUser) {

        return new InputNumberResultDto(UUID.fromString("5b960162-1e34-11ed-861d-0242ac120002"));
    }

    Scanner scanner;

    NumberReceiverFacade(Scanner scanner) {
        this.scanner = scanner;
    }

    public Set<Integer> getPlayerNumbers() {
        Set<Integer> playerNumbers = new HashSet<>();
        while (playerNumbers.size() < NUMBER_OF_LOTTO_NUMBERS) {
            try {
                String numberFromUser = scanner.nextLine();
                int number = Integer.parseInt(numberFromUser);
                if (isInRange(number)) {
                    if (!playerNumbers.contains(number)) {
                        playerNumbers.add(number);
                    } else {
                        System.out.println("You already entered this number. Please enter other number:");
                    }
                } else {
                    System.out.println("Invalid input, please enter numbers between 1 and 99:");
                }
            } catch (NumberFormatException e) {
                System.out.println("That's not a number! Please enter a valid input:");
            }
        }

        System.out.println("Your numbers: " + playerNumbers);
        return playerNumbers;
    }

    private boolean isInRange(int number) {
        return number >= LOWEST_NUMBER_FROM_USER && number <= MAX_NUMBER_FROM_USER;
    }

}
