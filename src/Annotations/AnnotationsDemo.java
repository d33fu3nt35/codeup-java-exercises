package Annotations;

import java.util.ArrayList;

/**
 * Created by daniel on 5/23/17.
 */
@FunctionalInterface
interface Abc {

    void show();
//    void uu();
}

class A {
    public void showMyDataFromLastYearDatabase() {
        System.out.println("in A");
    }

}

class B extends A {

    @Deprecated
    public void show() {

    }

    @Override
    @SuppressWarnings("unchecked")
    public void showMyDataFromLastYearDatabase() {
        ArrayList object = new ArrayList();
        System.out.println("in B");
    }
}

public class AnnotationsDemo {
    public static void main(String[] args) {
        B object = new B();
        object.showMyDataFromLastYearDatabase();
        object.show();

    }
}
