package Exception;

public class Warrior extends Character {
    Warrior(int h, int a, int d) {
        super(h, a, d);
    }

    @Override
    public boolean attack() {
        double counter = Math.random() * 10;
        if (counter > 0 && counter <= 6.0)
            return true;
        else
            return false;
    }
}