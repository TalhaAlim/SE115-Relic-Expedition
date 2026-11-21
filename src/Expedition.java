public class Expedition {

    public char [][] map;

    private int row;
    private int column;
    private int energy;
    private int maxEnergy;
    private int collectedRelics;
    private int requiredRelics;
    private int moves;
    private String status;

    public Expedition() {

        row =-1;
        column =-1;

        energy =0;
        maxEnergy =0;

        collectedRelics =0;
        requiredRelics =0;

        moves =0;

        status = "NOT_STARTED";
    }
}
