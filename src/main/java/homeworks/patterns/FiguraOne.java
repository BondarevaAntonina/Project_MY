package homeworks.patterns;

/**
 * Created by antoni on 08.07.2019.
 */
public class FiguraOne extends PatternFigura {
    @Override
    void intermediateDrawing() {
        System.out.println();

        for (int a = 1; a < 10 * 1; ++a) {

            System.out.print("*");
        }
        System.out.println();
        System.out.println();
    }


}