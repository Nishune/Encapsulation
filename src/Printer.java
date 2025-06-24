public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        tonerLevel += tonerAmount;

        if (tonerLevel > 100) {
            return -1;
        } else if (tonerLevel < 0) {
            return -1;
        } else {
            return tonerLevel;
        }
    }

    public int printPages(int pages) {

        int pagesToPrint;

        if (duplex) {
            System.out.println("This is a duplex printer.");
        pagesToPrint = (pages + 1) / 2;
        } else {
            pagesToPrint = pages;
        } return pagesPrinted += pagesToPrint;
    }

}
