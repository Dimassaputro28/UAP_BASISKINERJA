package Exception;

public class Healer extends Character{
    Healer(int h, int a, int d) {
        super(h, a, d);
    }
    void heal(){
        setHP(getHP() + 25);
    }
    @Override
    public boolean attack() {
        double counter = Math.random() * 10;
        if (counter > 0 && counter <= 8.5)
            return true;
        else
            return false;
    }

}


