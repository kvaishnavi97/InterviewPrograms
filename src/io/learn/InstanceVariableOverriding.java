package io.learn;

public class InstanceVariableOverriding {
	
	public static void main(String[] args) {
		Parent parent=new Child();
		System.out.println(parent.x);
	}

}

class Parent {
    // Declaring instance variable by name `x`
    String x = "Parent`s Instance Variable";

    public void print() {
        System.out.println(x);
    }
}

class Child extends Parent {

    // Hiding Parent class's variable `x` by defining a variable in child class with same name.
    String x = "Child`s Instance Variable";

    @Override
    public void print() {
        System.out.print(x);

        // If we still want to access variable from super class, we do that by using `super.x`
        System.out.print(", " + super.x + "\n");
    }
}
