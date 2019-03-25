public class Bottle {
    private double volume;

    public Bottle (double volume) {
       this.volume = volume;
    }

    public double volume() {
        return this.volume;
    }

    public double drink() {
        return this.volume - 10;
    }

    public double empty() {
        return this.volume = 0.0;
    }
}
