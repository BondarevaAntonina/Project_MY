package homeworks.family_tree;

import java.util.ArrayList;
import java.util.Iterator;

public class Family {
    public static boolean iAmDebugging = true;
    private Amoeba myRoot = null;
    public static int myDepth = 0;
    public static int mySize = 0;

    public Family(String name) {
        myRoot = new Amoeba(name, null);
    }

    public class Amoeba {

        public String myName; // имя
        public Amoeba myParent; // родитель
        public ArrayList<Amoeba> myChildren; // дети

        public Amoeba(String name, Amoeba parent) {
            myName = name;
            myParent = parent;
            myChildren = new ArrayList<Amoeba>();
        }

        public String toString() {
            return myName;
        }


        // Добавляет ребенка с заданным именем
        public void addChild(String childName) {
            Amoeba child = new Amoeba(childName, this);
            myChildren.add(child);
        }
    }

    //Добавляет ребенка по имени родителя
    public void addChild(String parentName, String childName) {
        if (myRoot != null) {
            Family.addChildHelper(parentName, childName, myRoot);
        }
    }

    public static void addChildHelper(String parentName, String childName, Amoeba currentAmoeba) {
        if (currentAmoeba.myName.equals(parentName)) {
            currentAmoeba.addChild(childName); // если родитель соответствует, то добаляем
        } else {
            Iterator<Amoeba> iter = currentAmoeba.myChildren.iterator();
            while (iter.hasNext()) {
                Family.addChildHelper(parentName, childName, iter.next());
            }

        }
    }


    public void printFlat() {
        if (myRoot != null) {
            Family.printFlatHelper(myRoot);
        }
    }

    public static void printFlatHelper(Amoeba currentAmoeba) {
        if (currentAmoeba.myChildren == null)
            System.out.println(currentAmoeba.myName);
        else {
            System.out.println(currentAmoeba.myName);
            Iterator<Amoeba> iter = currentAmoeba.myChildren.iterator();
            while (iter.hasNext()) {
                Family.printFlatHelper(iter.next());
            }
        }
    }
}
