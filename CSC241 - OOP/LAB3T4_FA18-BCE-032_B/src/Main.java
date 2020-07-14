public class Main {

    public static void main(String[] args) {

        while (MyGame.score < 5) {

            //MyGame.level1("Think", "Bin", "Pat");
            MyGame.level1();

        }

        if (MyGame.score >= 5) {
            LevelTwo.leveltwo();
            System.out.println("Score: " + MyGame.score);
        }

    }
}