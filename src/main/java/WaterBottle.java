public class WaterBottle {
    private int volume;

    public WaterBottle(int volume){
        this.volume = 100;
    }

    public int drink(){
        return volume - 10;
    }

    public int empty(){
        return 0;
    }

    public int reFill(){
        return 100;
    }
}
