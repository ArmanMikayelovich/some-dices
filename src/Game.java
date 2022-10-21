public class Game {
    private Player playerOne;
    private Player playerTwo;

    public Game() {
        playerOne = new Player("Vlo");
        playerTwo = new Player("Bulo");

    }

    private Player computeAndGetWinner() {
        if(playerOne.getScore() > playerTwo.getScore()) {
            return playerOne;
        } else {
            return playerTwo;
        }
    }

    public void play() throws InterruptedException {
        int playCounter = 10;
        for (int x = 0; x < playCounter; x++) {
            int diceOne = Dice.roll();
            playerOne.updateScore(diceOne);

             int diceTwo = Dice.roll();
            playerTwo.updateScore(diceTwo);
        }

        Player winnerPlayer = computeAndGetWinner();
        System.out.println("And the winner is...");
        Thread.sleep(3000);
        System.out.println(winnerPlayer);

    }
}
