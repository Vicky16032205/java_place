@FunctionalInterface
interface I{
    public void m1();
}

class Dog implements I{
    public void m1(){
        System.out.println("Welcome");
    }
}

// class first{
//     public static void main(String[] args){
//         I dog = new Dog();
//         dog.m1();
//     }
// }





// above code is showing what needs to be done in order to work with anu functional interface before java version 1.8 until lambda expressions are not introduced.

@FunctionalInterface
interface Animals{
    public void animal();
}

class first{
    public static void main(String args[]){
        Animals dog = () -> {System.out.println("Welcome");};
        dog.animal();
    }
}



// this is what needed to be done after introduction of lambda expressions.

// Lambda Expressions are anonymous functions having these properties:
    // 1). no method name
    // 2). no return type
    // 3). no access modifiers.
    // 4). lambda expressions can only be made using functional interfaces, without these they cannot be used or made.
    // this is whole story of lambda expressions.
    
    // NOTE: WHENEVER USING RETURN INSIDE THE LAMBDA EXPRESSIONS ALWAYS STORE IT INSIDE THE CURLY BRACKETS {}.



// Functional Interfaces:
    // 1). only one abstract method should be present, otherwise it's not functional interface.
    // 2). it can contains any number of default methods.
    // 3). it can contains any number of static methods.

    // examples of functional interfaces in java:
    // format => Interface names -> abstract method name
        // [1] RUNNABLE -> run()
        // [2] CALLABLE -> call()
        // [3] COMPARABLE -> compareTo()
        // [4] ACTION LISTENER -> actionPerformed()