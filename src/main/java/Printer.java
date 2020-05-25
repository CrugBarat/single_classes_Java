public class Printer {

    private int paper;
    private int toner;

    public Printer(int paper, int toner){
        this.paper = paper;
        this.toner = toner;
    }

    public int getPaper(){return this.paper;}

    public String print(int pages, int copies){
        int paperNeeded = pages * copies;
        if (this.paper >= paperNeeded){
            this.paper -= paperNeeded;
            this.toner -= paperNeeded;
        } else return "Not enough Paper";
        return null;
    }

    public int getToner(){return this.toner;}
}
