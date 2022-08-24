package pl.lotto;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LottoGameRunner {
    public static void main(String[] args) {

        List<Game> availableGames = Arrays.asList(
                new LottoConfiguration().createLottoGame(new Scanner(System.in)),
                new TicTacToeGame()
        );

        for(Game game: availableGames){
            System.out.println(game.name());
        }

        //Wybor gry
        System.out.println("Welcome in Lotto Game");


        lottoGame.startGame();
}
