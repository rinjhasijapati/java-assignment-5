import java.io.Serializable;

public class Person implements Serializable {
    int age = 20;
    String name = "Rinjha Sijapati";
    double height = 5.2;

    void getName(){
        System.out.println(name);
    }

    void getAge(){
        System.out.println(age);
    }
}