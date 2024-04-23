package org.extends1.acess;

import org.extends1.acess.child.Child;
import org.extends1.acess.parent.Parent;

public class ExtendsAccessMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.call();

        Parent parent = new Parent();
        parent.printParent();

    }
}
