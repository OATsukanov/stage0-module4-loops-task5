package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){

        for (int i = 1; i <= sideLength; i++) {

            String side = "";
            String emptySide = "";

            for (int f = 1; f <= sideLength; f++) {

                side += 8;
                if (f == 1 || f == sideLength) {
                    emptySide += 8;
                } else {
                    emptySide += " ";
                }
            }
            if (i == 1 || i == sideLength) {
                System.out.println(side);
            } else {
                System.out.println(emptySide);
            }
        }

    }
}
