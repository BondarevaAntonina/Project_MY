package homeworks.patterns;

/**
 * Created by antoni on 08.07.2019.
 */
public class FiguraThree extends PatternFigura {

    @Override
    void intermediateDrawing() {
        System.out.println();

        drawStrip();

        for(int i=0; i<2; i++){

            for(int j=0; j<10; j++){
                System.out.print("*");
            }

            System.out.println();
        }

        drawStrip();

        System.out.println();
    }

    public void drawStrip() {
        int a = 4;

        for(int i=0; i<2; i++){

            for (int j = a; j > 1; --j) {

                System.out.print(" ");
            }
            for(int j=0; j<3; j++){
                System.out.print("*");
            }

            System.out.println("");
        }
    }

}
