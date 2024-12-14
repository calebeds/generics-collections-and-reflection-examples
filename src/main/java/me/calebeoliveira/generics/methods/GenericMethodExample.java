package me.calebeoliveira.generics.methods;

public class GenericMethodExample {
    public static void main(String[] args) {
        GenericMethod genericMethod = new GenericMethod();
//        genericMethod.printItems("Adam", 3);
//        System.out.println("Item is returned: " + genericMethod.showItem("Adam"));

        Integer[] nums = {1, 2, 3, 4};
        String[] names = {"Adam", "Ana", "Daniel", "Kevin", "Michael"};
        genericMethod.showItems(names);
    }
}
