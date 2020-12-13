public class GameNumber {
    private int Milan;

    public String getLastScorer() {
        return lastScorer;
    }

   public void lastMadrid(){
        this.lastScorer="Madrid";
   }
   public void lastMilan(){
        this.lastScorer="Milan";
   }


    private String lastScorer;

    public int getMilan() {
        return Milan;
    }

    public void setMilan(int milan) {
        Milan = milan;
    }

    public int getMadrid() {
        return Madrid;
    }

    public void setMadrid(int madrid) {
        Madrid = madrid;
    }

    private int Madrid;
    public GameNumber(){
        this.Milan=0;
        this.Madrid=0;
    }
    public void plusMilan(){
        this.Milan++;
    }
    public void plusMadrid(){
        this.Madrid++;
    }

}

