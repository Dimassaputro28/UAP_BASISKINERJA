package Exception;

public class Magician extends Character{
    Magician(int h, int a, int d) {
        super(h, a, d);
    }

    @Override
    public boolean attack() {
        double counter = Math.random() * 10;
        if (counter > 0 && counter <= 3.5)
            return true;
        else
            return false;
    }
}
