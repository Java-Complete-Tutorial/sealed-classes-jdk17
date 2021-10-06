package me.kodysimpson.classes;

import me.kodysimpson.classes.AnotherChild;
import me.kodysimpson.classes.OtherChild;
import me.kodysimpson.classes.Parent;

//The subclass extending the parent sealed class must be final, sealed itself, or declared unsealed.
//This logically makes sense because since final means a class cannot be extended,
//this prevents abuse of the sealed feature because then you could just extend the child
//and inherit from the original parent.
public sealed class Child extends Parent permits OtherChild, AnotherChild {

    //This class will now inherit from Parent and be sealed itself,
    //requiring OtherChild to extend this one.

}