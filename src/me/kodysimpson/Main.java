package me.kodysimpson;

import me.kodysimpson.classes.Child;
import me.kodysimpson.classes.Parent;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //Java 17 Sealed Classes

        //From the feature page(JEP 409):
        //- Allow the author of a class or interface to control which code is responsible for implementing it.
        //- Provide a more declarative way than access modifiers to restrict the use of a superclass.
        //- Support future directions in pattern matching by providing a foundation for the exhaustive analysis of patterns.

        //Further information on the feature:
        //- Permitted sealed classes must either be in the same package or the same module

        //Additions to the Reflection API to allow you to work with sealed classes/interfaces
        Parent parent = new Child();
        if (parent.getClass().isSealed()){
            System.out.println("Permitted subclasses: " + Arrays.toString(parent.getClass().getPermittedSubclasses()));
        }else{
            System.out.println("Ain't sealed homie!");
        }


    }

}
