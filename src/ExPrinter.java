public class ExPrinter {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public ExPrinter(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
        pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {

        if (tonerAmount <= 0 || tonerAmount > 100) {
            return -1;
        }

        if (tonerLevel + tonerAmount > 100) {
            return -1;
        }
        tonerLevel += tonerAmount;
        return tonerLevel;
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;

        pagesToPrint = duplex ? (pages / 2) + (pages % 2) : pages;

        pagesPrinted += pagesToPrint;

        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
