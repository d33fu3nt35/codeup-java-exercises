//package Annotations;
//
//import java.text.Annotation;
//
///**
// * Created by daniel on 5/23/17.
// */
//
//
//// Marker Annotation
//// Single Value Annotation
//// Multi Value Annotation
//
//@interface SmartPhone{
//    String os() default "Symbian";
//    int version() default 1;
//}
//
//@SmartPhone ( os="Android", version=6 )
//class NokiaASeries{
//    String model;
//
//    public NokiaASeries(String model, int size) {
//        this.model = model;
//        this.size = size;
//    }
//
//    int size;
//}
//
//public class AnnotationsDemo2 {
//    public static void main(String[] args) {
//
//        NokiaASeries object = new NokiaASeries("Fire", 5);
//
//        Class c = object.getClass();
//        Annotation an = c.getAnnotation(SmartPhone.class);
//        SmartPhone s = (SmartPhone)an;
//        System.out.println(s.os());
//
//    }
//}
