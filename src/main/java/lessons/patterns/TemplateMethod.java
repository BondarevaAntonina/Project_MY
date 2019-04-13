package lessons.patterns;

/*
 * Поведенческий паттерн
 * */

public class TemplateMethod {
    public static void main(String[] args) {
        HouseTemplate glassHouse = new WoodHouse();
        glassHouse.buildHouse();
    }
}


abstract class HouseTemplate {

    public final void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built");
    }

    public abstract void buildWalls();

    public abstract void buildPillars();

    private void buildWindows() {
        System.out.println("Building glass windows");
    }

    private void buildFoundation() {
        System.out.println("Build foundation");
    }
}

class GlassHouse extends HouseTemplate {
    @Override
    public void buildWalls() {
        System.out.println("Build glass walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Build glass pillars");
    }
}

class WoodHouse extends HouseTemplate {
    @Override
    public void buildWalls() {
        System.out.println("Build wood walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Build wood pillars");
    }
}
