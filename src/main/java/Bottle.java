public class Bottle {
    private int volume;

    public Bottle(int volume) {
        this.volume = volume;
    }

    public int volume() {
        return this.volume;
    }

    public void drink() {
        this.volume -= 10;
    }

    public void empty() {
        this.volume = 0;
    }

    public void fillUp() {
        this.volume = 100;
    }
}