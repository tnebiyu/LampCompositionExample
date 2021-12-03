public class Bed {
    private  String style;
    private  int pillows;
    private int height;
    private int sheets;
    private int quilt;

    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }
    public void make(){
        System.out.println("the bed is being made");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }

    public static void main(String[] args) {
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");
Ceiling celiling = new Ceiling(12, 55);
Bed bed = new Bed("Modern", 4,3,2,1);
Lamp lamp = new Lamp("Classic ", false, 75);
Bedroom bedroom = new Bedroom("neo",wall1,wall2,wall3,wall4,celiling,bed,lamp);
bedroom.makeBed();
bedroom.getLamp().turnon();
    }

}
