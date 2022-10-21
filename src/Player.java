public class Player {
    private static int ID_INCREMENTER;
    private int id;
    private String name;
    private int score;

    public Player(String name) {
        this.id = ++ID_INCREMENTER;
        this.name = name;
    }

    public void updateScore(int currentDice) {
        score += currentDice;
        System.out.println(name + "'s total score is: " + score);

    }

    @Override
    public String toString() {
        return name  + " {" +
                "id=" + id +

                ", score=" + score +
                '}';
    }

    public int getScore() {
        return score;
    }
}
