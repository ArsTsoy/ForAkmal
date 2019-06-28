package com.company;

import com.company.SOLID.Woker;

public class Main {

    public static void main(String[] args) {
        TestClass testClass = new TestClass();

//        Predicate<Integer> predicate = TestClass::funInteger2;
//
//        System.out.println(predicate.test(4));
//
//        MySOUT mySOUT = System.out::println;
//
//        mySOUT.print("Hello");

        ClassSingleton singleton = ClassSingleton.getInstance("Akmal");
        System.out.println(singleton.getName());

        Woker woker = new Woker();
        woker.doSomeWork();
        woker.cook("Pizza");
        woker.cleanRoom();





        /**
         * TODO: Singleton Example
         *         System.out.println("-------------------------");
         *         ClassSingleton singleton1 = ClassSingleton.getInstance();
         *         singleton1.setName("Arslan");
         *         System.out.println("Singleton1 has cahnged name to " + singleton1.getName());
         *
         *         ClassSingleton singleton2 = ClassSingleton.getInstance();
         *         singleton2.setName("Daniyar");
         *         System.out.println("Singleton2 has cahnged name to " + singleton2.getName());
         *         System.out.println("-------------------------=");
         *
         *         System.out.println("1' name = " + singleton1.getName() + "   ---------  2' name = " + singleton2.getName());
         *         System.out.println("1' hashCode = " + singleton1.hashCode() + "   -------- 2 hashCode = " + singleton2.hashCode());
         *
         */

        /**
         * MySOUT mySOUT = new MySOUT() {
         *             @Override
         *             public void print(String str) {
         *
         *             }
         *         };
         */


        /**
         *Predicate<Integer> predicate = new Predicate<Integer>() {
         *             @Override
         *             public boolean test(Integer x) {
         *                 return x > 5;
         *             }
         *         }
         **/


    }



    public static boolean someMethod(Integer i){
        return i > 5;
    }


//    Predicate<Integer> predicate = x -> x > 5;

//    Predicate<Integer> predicate = TestClass::fun5;
//    Consumer<String> consumer = TestClass::fun2;
//    Function<Integer, String> function = x -> x.toString();
//    Supplier<Integer> supplier = () -> 5;
//    UnaryOperator<Integer> unaryOperator = testClass::fun8;
//
//        consumer.accept("Hello, world");
//    SomeInterClass<String> someInterClass = TestClass::fun;
//
//
//    GenericClass<String> c = new GenericClass<>();
//    GenericClass<Integer> c1 = new GenericClass<>();
//    GenericClass<TestClass> c2 = new GenericClass<>();
//    GenericClass<Boolean> c3 = new GenericClass<>();





}
