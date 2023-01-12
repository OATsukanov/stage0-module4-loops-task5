package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){

        for (int i = 1; i <= height; i++) {

            String side = "";
            String emptySide = "";

            for (int f = 1; f <= length; f++) {

                side += 8;
                if (f == 1 || f == length) {
                    emptySide += 8;
                } else {
                    emptySide += " ";
                }
            }
            if (i == 1 || i == height) {
                System.out.println(side);
            } else {
                System.out.println(emptySide);
            }
        }

    }
}
