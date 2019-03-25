public class Printer {
    private int sheetsLeft;
    private int tonerVolume;


    public Printer(int sheetsLeft, int tonerVolume) {
        this.sheetsLeft = sheetsLeft;
        this.tonerVolume = tonerVolume;
    }

    public int sheetsLeft() {
        return this.sheetsLeft;
    }

    public void refillPaper(int paper) {
        this.sheetsLeft += paper;
    }
    public void refillToner(int newToner){
        this.tonerVolume += newToner;
    }

    public boolean print(int pages, int copies) {
        if (pages * copies <= this.sheetsLeft && pages * copies <= this.tonerVolume) {
            this.sheetsLeft -= pages * copies;
            this.tonerVolume -= pages * copies;
            return true;
        } else {
            return false;
        }
    }

    public int tonerVolume() {
        return this.tonerVolume;
    }

}
