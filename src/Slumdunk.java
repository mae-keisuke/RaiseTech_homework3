public class Slumdunk {

    private String name;

    private int number;

    public Slumdunk(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "選手名：" + name + "、" + "背番号：" + number;
    }
}
