package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {

        String layerCenter = "";
        String layerLeft = "";
        String layerRight = "";
        String layer = "";

        for (int i = 0; i < height; i++) {

            layerCenter = "";
            layerLeft = "";
            layerRight = "";

            int layerLeftItertor = i;
            int layerRightItertor = i;
            int layerCenterIterator = height - layerLeftItertor - layerRightItertor;

            for (int f = 0; f < layerCenterIterator; f++) {
                layerCenter += 8;
            }

            for (int g = 0; g < layerLeftItertor; g++) {
                layerLeft += " ";
            }

            for (int j = 0; j < layerRightItertor; j++) {
                layerRight += " ";
            }

            layer = layerLeft + layerCenter + layerRight;
            System.out.println(layer);

            if (height % 2 == 0) {
                if (layerCenter.length() == 2) break;
            } else if (layerCenter.length() == 1) break;

        }


        for (int i = height; i > -1; i--) {

            layerCenter = "";
            layerLeft = "";
            layerRight = "";

            int layerLeftItertor = i;
            int layerRightItertor = i;
            int layerCenterIterator = height - layerLeftItertor - layerRightItertor;

            for (int f = 0; f < layerCenterIterator; f++) {
                layerCenter += 8;
            }

            for (int g = 0; g < layerLeftItertor; g++) {
                layerLeft += " ";
            }

            for (int j = 0; j < layerRightItertor; j++) {
                layerRight += " ";
            }


            if (layerCenter.length() == 0) continue;
            if (layerLeft.length() > 4) continue;
            if (height % 2 != 0) {
                if (layerCenter.length() == 1) continue;
            }


            layer = layerLeft + layerCenter + layerRight;
            System.out.println(layer);


        }

    }
}
