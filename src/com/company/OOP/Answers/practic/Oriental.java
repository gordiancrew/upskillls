package com.company.OOP.Answers.practic;

public class Oriental extends Cat {

    private int longer;
    private String may;

    {
        may = "Hello kitten";
        super.age = 10;
        System.out.println(age);
    }

    public Oriental(String name, byte age, int longer) {
        super(name, age);

        this.longer = longer;
        super.age = 30;

        System.out.println("Class oriental constructor" + age + "" + super.age);
    }
//    public  Oriental(int longer){
//        super();
//        this.longer=longer;
//    }

    public void sum(int... lave) {
        System.out.println(lave.length);
    }

    @Override
    public  void sayMay() {

        System.out.println("Cat " + getName() + " say " + may);

    }


}
