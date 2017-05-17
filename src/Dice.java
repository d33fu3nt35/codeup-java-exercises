/**
 * Created by daniel on 5/12/17.
 */
public class Dice {

    public static void main(String[] args) {

        System.out.println(dicegame(1, 15));
        System.out.println(dicegame(1, 15));

    }
    public static int dicegame(int min, int max){
        int dice = (int) (Math.round(Math.random() * (max - min)) + min);
        return dice;
    }
}
