package lessons.overloading_overriding;

public class Lion extends Animal {
   /* @Override
    public Integer print() {
        System.out.println("Lion");
        return 4;
    }*/

    /*@Override
    public String toString() {
        print();
        return "Lion{}";
    }*/
}

class Mouse extends Animal {
    /*@Override
    public Integer print() {
        System.out.println("Mouse");
        return 5;
    }*/

    public Integer print() {
        System.out.println("Mouse");
        return 5;
    }
}

/*
* private - visibility only inside class
* package - private - visibility only inside package
* protected - visibility only inside package + childs
* public - visibility anywhere
* */


