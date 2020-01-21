public class LoadTest {
    public static void main(String[] args) {
        System.out.println("START");
        new Child();
        System.out.println("END");
    }
}

class Parent extends Grandparent {
    // Instance init block
    {
        System.out.println("instance - parent");
    }

    // Constructor
    public Parent() {
        System.out.println("constructor - parent");
    }

    // Static init block
    static {
        System.out.println("static - parent");
    }
}

class Grandparent {
    // Static init block
    static {
        System.out.println("static - grandparent");
    }

    // Instance init block
    {
        System.out.println("instance - grandparent");
    }

    // Constructor
    public Grandparent() {
        System.out.println("constructor - grandparent");
    }
}

class Child extends Parent {
    // Constructor
    public Child() {
        System.out.println("constructor - child");
    }

    // Static init block
    static {
        System.out.println("static - child");
    }

    // Instance init block
    {
        System.out.println("instance - child");
    }
}