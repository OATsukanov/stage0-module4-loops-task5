package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {

        for (int i = 1; i <= sideLength; i++) {

            String side = "";
            String emptySide = "";

            for (int f = 1; f <= sideLength; f++) {

                side += 8;
                if (f == sideLength / 2 + 1) {
                    emptySide += 8;
                } else {
                    emptySide += " ";
                }
            }
            if (i == sideLength / 2 + 1) {
                System.out.println(side);
            } else {
                System.out.println(emptySide);
            }
        }

    }
}
