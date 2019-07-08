package homeworks.patterns;

/**
 * Created by antoni on 08.07.2019.
 */
public  class TamplateMetod {


    public static void main(String[] args) {

        System.out.println(" ==================Первый рисунок ===============");

        FiguraOne figuraOne = new FiguraOne();
        figuraOne.picture();

        System.out.println();
        System.out.println(" ==================Второй рисунок ===============");
        System.out.println();

        FiguraTwo figuraTwo = new FiguraTwo();
        figuraTwo.picture();

        System.out.println();
        System.out.println(" ==================Третий рисунок ===============");
        System.out.println();

        FiguraThree figuraThree = new FiguraThree();
        figuraThree.picture();

    }


}


