package homeworks.patterns;

/**
 * Created by antoni on 08.07.2019.
 */
public class FiguraTwo extends PatternFigura {

    @Override
    void intermediateDrawing() {

        System.out.println();

        int a = 5;

            for(int i=0; i<4; i++){

                for (int j = a; j > 1; --j) {

                    System.out.print(" ");
                }
                for(int j=0; j<7; j++){
                    System.out.print("*");
                }

                System.out.println();
            }

        System.out.println();
        System.out.println();
    }
}

/*
            for(int i=0; i<4; i++){

                for(int j=0; j<7; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
 */