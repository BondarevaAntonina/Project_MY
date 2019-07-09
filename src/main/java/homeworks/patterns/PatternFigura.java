package homeworks.patterns;

/**
 * Created by antoni on 08.07.2019.
 */
public abstract class PatternFigura {

    public final void picture () {
        drawTriangle(5);
        intermediateDrawing();
        drawTriangle(5);
    }

//    protected abstract void drawTriangle(int i);

    abstract void intermediateDrawing();

    public void  drawTriangle (int row){
        for (int i = 1; i <= row; ++i) {

            for (int j = row; j > i; --j) {
                System.out.print(" ");
            }

            for (int j = 1; j < 2 * i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }

        return;
    }




}
