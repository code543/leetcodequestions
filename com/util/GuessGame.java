package lee.util;

/**
 * Created by santos on 2018/10/4.
 */

public class GuessGame
{
    public int pick;
    public int guess(int num)
    {
        return 0;
    }
    public int guessNumber(int num)
    {
        return -999;
    }
    public int guessNumber(int num, int pick)
    {
        this.pick = pick;
        return guessNumber(num);
    }
}
