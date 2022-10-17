public class Main {

    private static final int width = 4;
    private static final int height = 5;

    public static void main(String[] args) {
        Shape reg1 = new Rectangle(width, height);
        System.out.println("==== Rectangle ====");            //สี่เหลี่ยมผืนผ้า
        System.out.println("Width = " + reg1.getWidth());       //กว้าง
        System.out.println("Height = " + height);               //สูง
        System.out.println("Area = " + reg1.getArea());         //พื้นที่

        Shape reg2 = new Square(5);
        System.out.println("====   Square  ====");            //สี่เหลี่ยมจตุรัส
        System.out.println("Width = " + reg2.getWidth());       //กว้าง
        System.out.println("Height = " + height);               //สูง
        System.out.println("Area = " + reg2.getArea());         //พื้นที่
    }
}
