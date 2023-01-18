package hexlet.code;

public class General {
    public static int getRandomNumber(int min, int max) {
        return (int) (Math.random() * ((max - min) + 1) + min);
    }
}
