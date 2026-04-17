class Rabbit{
    String shape;
    int xPos;
    int yPos;

    Rabbit(String value) {
        shape = value;
    }

    void setPosition(int x, int y) {
        xPos = x;
        yPos = y;
    }
}

public class Code07_06 {
    public static void main(String[] args) {

        Rabbit rabbit1 = new Rabbit("원");
        Rabbit rabbit2 = new Rabbit("삼각형");
        Rabbit rabbit3 = new Rabbit("토끼");

        rabbit1.shape = "원";
        rabbit2.shape = "삼각형";
        rabbit3.shape = "토끼";

        rabbit1.setPosition(100, 100);
        rabbit2.setPosition(-100, 100);
        rabbit3.setPosition(0, -100);

        System.out.printf("토끼1 객채의 모양은 [%s]입니다.\n", rabbit1.shape);
        System.out.printf("토끼2 객채의 모양은 [%s]입니다.\n", rabbit2.shape);
        System.out.printf("토끼3 객채의 모양은 [%s]입니다.\n", rabbit3.shape);
    }
}