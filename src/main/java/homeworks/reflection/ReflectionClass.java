package homeworks.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.LinkedList;

public class ReflectionClass {
    public static void main(String[] args) {

        /**  Getting class name */

        System.out.println(MyClass.class.getName());
        System.out.println();

        /**  Getting information about class fields */

        MyClass myClass = new MyClass();
        int number = myClass.getNumber();
        String name = null; //no getter =(
        System.out.println(number + name);//output 0null
        try {


            Field field = myClass.getClass().getDeclaredField("name");
            field.setAccessible(true);
            field.set(myClass, (String) "new value");
            name = (String) field.get(myClass);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(number + name);//output 0default

        System.out.println();

        /**  Getting class modifier */

        Class mClassObject = MyClass.class;
        int classModifiers = mClassObject.getModifiers();

        System.out.println("isAbstract: " + Modifier.isAbstract(classModifiers));
        System.out.println("isFinal: " + Modifier.isFinal(classModifiers));
        System.out.println("isInterface: " + Modifier.isInterface(classModifiers));
        System.out.println("isNative " + Modifier.isNative(classModifiers));
        System.out.println("isPrivate: " + Modifier.isPrivate(classModifiers));
        System.out.println("isProtected: " + Modifier.isProtected(classModifiers));
        System.out.println("isPublic: " + Modifier.isPublic(classModifiers));
        System.out.println("isStatic: " + Modifier.isStatic(classModifiers));
        System.out.println("isStrict: " + Modifier.isStrict(classModifiers));
        System.out.println("isSynchronized: " + Modifier.isSynchronized(classModifiers));
        System.out.println("isTransient: " + Modifier.isTransient(classModifiers));
        System.out.println("isVolatile: " + Modifier.isVolatile(classModifiers));

        /** Class object  */

        System.out.println();
        MyClass a = new MyClass();
        Class aclass = a.getClass();
        System.out.println(aclass);

        /** Getting the class parent and implementing interfaces  */

        System.out.println();

        Class c = LinkedList.class;
        Class[] interfaces = c.getInterfaces();
        for (Class cInterface : interfaces) {
            System.out.println(cInterface.getName());
        }

        /** Comments */
    }
}
