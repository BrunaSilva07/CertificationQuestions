import controller.QuizController;
import model.Question;
import model.QuizModel;
import view.QuizViewGUI;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Question> questions = Arrays.asList(
                //1
                new Question("All Java keywords are written in lower case.",
                        Arrays.asList("true", "false"),
                        0
                ),
                //2
                new Question(
                        "A method name can start with a number.",
                        Arrays.asList("true", "false"),
                        1
                ),
                //3
                new Question(
                        "A variable name can start with $.",
                        Arrays.asList("true", "false"),
                        0
                ),
                //4
                new Question(
                        "Which of these are legal values for a boolean?",
                        Arrays.asList("true, false", "true, false, 1,0", "1,0", "TRUE, FALSE", "TRUE, FALSE, true, false"),
                        0
                ),
                //5
                new Question(
                        "What is the bit-depth of a char?",
                        Arrays.asList("8 bits", "7 bits", "16 bits", "32 bits"),
                        2
                ),
                //6
                new Question(
                        "What is the bit-depth of a byte?",
                        Arrays.asList("8 bits", "7 bits"),
                        0
                ),
                //7
                new Question(
                        "A floating point literal in Java is treated as a:",
                        Arrays.asList("Float", "Double", "float", "double"),
                        3
                ),
                //8
                new Question(
                        "When you pass a reference to an array as " +
                                "an argument to a method call, you pass a new reference " +
                                "to the original array.",
                        Arrays.asList("true", "false"),
                        0
                ),
                //9
                new Question(
                        "Does a call to System.gc() force garbage collection to " +
                                "take place? (assuming there are objects to be collected) ",
                        Arrays.asList("Yes always", "Not always"),
                        1
                ),
                //10
                new Question(
                        "Which of these operators would cause the bit pattern " +
                                "00111100 to become 11000011? ",
                        Arrays.asList("~", "!", "-"),
                        0
                ),
                //11
                new Question(
                        "Assume x = 2 and y = 4. What is the result of " +
                                "(!( y > x ))",
                        Arrays.asList("true", "false"),
                        1
                ),
                //12
                new Question(
                        "Assume x = 6 and y = 7. What is the result of " +
                                "(!( y == x ))",
                        Arrays.asList("true", "false"),
                        0
                ),
                //13
                new Question(
                        "Assume:  byte a = 3; byte b = 2; " +
                                "What is the result of:" +
                                "byte c = a + b ;",
                        Arrays.asList("runtime exception", "c = 3", "compiler error", "c == 5"),
                        2
                ),
                //14
                new Question(
                        "Can you compare a boolean to an integer?",
                        Arrays.asList("Yes", "No"),
                        1
                ),
                //15
                new Question(
                        "What is \"instanceof\" ?",
                        Arrays.asList("an operator", "a method in Object"),
                        1
                ),
                //16
                new Question(
                        "Integer a = new Integer(5);" +
                                "Integer b = new Integer(5);" +
                                "What is the result of running:" +
                                "if ( a == b )",
                        Arrays.asList("false", "runtime exception", "compiler error", "true"),
                        0
                ),
                //17
                new Question(
                        "Can a top-level class be marked as private?",
                        Arrays.asList("No", "Yes"),
                        0
                ),
                //18
                new Question(
                        "Can a top-level class be marked as protected?",
                        Arrays.asList("No", "Yes"),
                        0
                ),
                //19
                new Question(
                        "methods which are marked protected can be called on any" +
                                "subclass of the class in which the method is declared.",
                        Arrays.asList("false", "true"),
                        1
                ),
                //20
                new Question(
                        "Can a private method of a superclass be declared within" +
                                "a subclass?",
                        Arrays.asList("Yes", "No"),
                        0
                ),
                //21
                new Question(
                        "Can an abstract class have non-abstract methods?",
                        Arrays.asList("No", "Yes"),
                        1
                ),
                //22
                new Question(
                        "Can a non-abstract class have abstract methods?",
                        Arrays.asList("Yes", "No"),
                        1
                ),
                //23
                new Question(
                        "If a non-abstract class X inherits abstract methods " +
                                "from its abstract parent class Y, is the X class " +
                                "required to implement the inherited abstract methods?",
                        Arrays.asList("Yes", "No"),
                        0
                ),
                //24
                new Question(
                        "If a class declares that it implements an interface" +
                                "(class A implements B), must class A implement the" +
                                "methods of interface B?",
                        Arrays.asList("Under ALL circumstances", "Unless A is abstract"),
                        1
                ),
                //25
                new Question(
                        "TRUE or FALSE - " +
                                "during arithmetic, when the operands are of different" +
                                "types, the resulting type is ALWAYS the widest" +
                                "of the two types.",
                        Arrays.asList("false", "true"),
                        0
                ),
                //26
                new Question(
                        "class Y is a subclass of class X. Will this compile?" +
                                "Y myY = new X( );",
                        Arrays.asList("No", "Yes"),
                        0
                ),
                //27
                new Question(
                        "Class Y is a subclass of class X.  Will this compile?" +
                                "X myX = new Y( );",
                        Arrays.asList("No", "Yes"),
                        1
                ),
                //28
                new Question(
                        "Can you compile an if construct without using" +
                                "curly braces?",
                        Arrays.asList("No", "Yes"),
                        1
                ),
                //29
                new Question(
                        "What goes in the first part of a for loop?",
                        Arrays.asList("boolean test", "iteration expression", "init statement"),
                        2
                ),
                //30
                new Question(
                        "Is this legal?  (Isso é legal?)" +
                                "int i ;" +
                                "for ( i = 4, int t = 6; i < 0; i++ )",
                        Arrays.asList("No", "Yes"),
                        0
                ),
                //31
                new Question(
                        "In a for loop, the continue statement will cause" +
                                "execution to jump out of the loop and continue on" +
                                "at the first statement below the loop.",
                        Arrays.asList("false", "true"),
                        0
                ),
                //32
                new Question(
                        "An inner class must be defined within the opening and" +
                                "closing braces of a class, but outside any method -- " +
                                "just like data members.",
                        Arrays.asList("false", "true"),
                        1
                ),
                //33
                new Question(
                        "A class defined within a parameter to a method is:",
                        Arrays.asList("anonymous", "illegal", "static"),
                        0
                ),
                //34
                new Question(
                        "when an object is created using new (), its constructor" +
                                "will not complete until all constructors higher on the" +
                                "inheritance tree have completed.",
                        Arrays.asList("anonymous", "illegal", "static"),
                        0
                ),
                //35
                new Question(
                        "the compiler will always insert a default, no-argument" +
                                "constructor into any class definition.",
                        Arrays.asList("true", "false"),
                        1
                ),
                //36
                new Question(
                        "when you override a method, the overriding method in" +
                                "the subclass  must not declare ANY new exceptions" +
                                "not declared by the overridden method.",
                        Arrays.asList("true", "false"),
                        1
                ),
                //37
                new Question(
                        "Will this compile?" +
                                "float f = 27.24f;",
                        Arrays.asList("Yes", "No"),
                        0
                ),
                //38
                new Question(
                        "As a literal, what is 27.24?",
                        Arrays.asList("a float", "a double"),
                        1
                ),
                //39
                new Question(
                        "Will this compile?" +
                                "int[] x = [27];",
                        Arrays.asList("No", "Yes"),
                        0
                ),
                //40
                new Question(
                        "When an array is constructed, are its elements" +
                                "automatically initialized?",
                        Arrays.asList("No", "Yes"),
                        1
                ),
                //41
                new Question(
                        "Is this legal?" +
                                "int x[ ] = {2,7,4,9};",
                        Arrays.asList("No", "Yes"),
                        1
                ),
                //42
                new Question(
                        "Is this legal?" +
                                "public static void main ( String[] fred )",
                        Arrays.asList("No", "Yes"),
                        1
                ),
                //43
                new Question(
                        "Assume x = 0 and y = 3. \n" +
                                "What is the value of x after:  x = y++;",
                        Arrays.asList("7", "4", "3"),
                        2
                ),
                //44
                new Question(
                        "Given x = y--; \n" +
                                "Which of these will be true AFTER execution?",
                        Arrays.asList("x > y", "x == y", "x < y"),
                        0
                ),
                //45
                new Question(
                        "Integer literals are always what size?",
                        Arrays.asList("int - 32 bits", "short - 16 bits", "int - 64 bits", "byte - 8 bits", "int - 16 bits"),
                        0
                ),
                //46
                new Question(
                        "Can you use an increment unary operator on a byte?\n" +
                                "(example: byte b = 4; b++;)",
                        Arrays.asList("Never", "With explicit cast", "Yes"),
                        2
                ),
                //47
                new Question(
                        "What happens when you divide an integer by a variable\n" +
                                "with a value of 0?",
                        Arrays.asList("Runtime exception", "Compiles and runs", "Compiler error"),
                        0
                ),
                //48
                new Question(
                        "What happens when you put this expression in your code:\n" +
                                "int x = 0; \n" +
                                "int y = 4 % x ;",
                        Arrays.asList("Compiles and runs", "Compiler error", "Runtime exception"),
                        2
                ),
                //49
                new Question(
                        "What happens when you have this in your code:\n" +
                                "double x; \n" +
                                "x = 24.0/0;",
                        Arrays.asList("Compiles and runs", "Compiler error", "Runtime exception"),
                        0
                ),
                //50
                new Question(
                        "What happens when you bit shift by a number greater\n" +
                                "than or equal to the number of bits in the result?",
                        Arrays.asList("You get 270 >> 1", "You get -1", "You get 0"),
                        0
                ),
                //51
                new Question(
                        "What happens when you compare two primitives of different\n" +
                                "numerical types?",
                        Arrays.asList("Compiler error", "Smaller type is promoted", "Must explicitly cast"),
                        1
                ),
                //52
                new Question(
                        "Which of these is the Exclusive-OR (XOR) operator?",
                        Arrays.asList("~", "is the regular OR operator.", "&amp;", "^"),
                        3
                ),
                //53
                new Question(
                        "x = false; y = true; \n" +
                                "What is the result of x &amp;&amp; y?",
                        Arrays.asList("false", "true"),
                        0
                ),
                //54
                new Question(
                        "Can a method have more than one access modifier?",
                        Arrays.asList("No", "Yes"),
                        0
                ),
                //55
                new Question(
                        "Can a subclass access the  private member variables of\n" +
                                "its own superclass?",
                        Arrays.asList("No", "Yes"),
                        0
                ),
                //56
                new Question(
                        "Can a method with no access modifier be overriden by a\n" +
                                "method marked protected?",
                        Arrays.asList("No", "Yes"),
                        1
                ),
                //57
                new Question(
                        "Does a final member variable have to be initialized at\n" +
                                "the time it's declared?",
                        Arrays.asList("No", "Yes"),
                        0
                ),
                //58
                new Question(
                        "If a final variable is a reference to an object, can\n" +
                                "that object's data members be modified while the\n" +
                                "program is running?",
                        Arrays.asList("No", "Yes"),
                        1
                ),
                //59
                new Question(
                        "Can a final method be overriden?",
                        Arrays.asList("No", "Yes"),
                        0
                ),
                //60
                new Question(
                        "Can you automatically convert a long to an int if the\n" +
                                "long value is small enough to fit into an int?",
                        Arrays.asList("No", "Yes"),
                        0
                ),
                //61
                new Question(
                        "Can you automatically/implicitly convert a char\n" +
                                "to a short?",
                        Arrays.asList("No", "Yes"),
                        0
                ),
                //62
                new Question(
                        "Can you pass a short into a method call when an int is\n" +
                                "expected?",
                        Arrays.asList("No", "Yes"),
                        1
                ),
                //63
                new Question(
                        "Given this code, what prints? \n" +
                                "boolean b = false; \n" +
                                "if ( b = true ) \n" +
                                "{ \n" +
                                "    System.out.println(\"yes\"); \n" +
                                "} \n",
                        Arrays.asList("\"yes\" prints", "nothing prints"),
                        0
                ),
                //64
                new Question(
                        "If you do not use curly braces for a while loop body, \n" +
                                "what will execute if the while condition is true?",
                        Arrays.asList("First statement after while ( )", "Nothing"),
                        0
                ),
                //65
                new Question(
                        "using a break in a for loop causes the loop to break \n" +
                                "out of the current iteration and jump to the next \n" +
                                "iteration of the loop.",
                        Arrays.asList("false", "true"),
                        0
                ),
                //66
                new Question(
                        "An exception can be caught by a catch block with \n" +
                                "an argument type that is a superclass of the \n" +
                                "thrown exception.",
                        Arrays.asList("false", "true"),
                        1
                ),
                //67
                new Question(
                        "In a try/catch, an exception will not be considered \n" +
                                "caught if the catch (Exception) block has no code \n" +
                                "within the braces { }",
                        Arrays.asList("false", "true"),
                        0
                ),
                //68
                new Question(
                        "if an exception is not caught, the finally block will \n" +
                                "run and the rest of the method is skipped.",
                        Arrays.asList("false", "true"),
                        1
                ),
                //69
                new Question(
                        "An overloaded method MUST change:",
                        Arrays.asList("Return type AND arg list", "Return type", "Argument list"),
                        2
                ),
                //70
                new Question(
                        "Overloaded methods are free to change the \n" +
                                "access modifier.",
                        Arrays.asList("false", "true"),
                        1
                ),
                //71
                new Question(
                        "constructors can not be overloaded.",
                        Arrays.asList("false", "true"),
                        0
                ),
                //72
                new Question(
                        "An inner class has free access to private member \n" +
                                "data of the outer classes.",
                        Arrays.asList("false", "true"),
                        1
                ),
                //73
                new Question(
                        "Member (instance) variables are always assigned a \n" +
                                "default value if not explicitly initialized.",
                        Arrays.asList("false", "true"),
                        1
                ),
                //74
                new Question(
                        "Automatic (local) variables are always assigned a \n" +
                                "default value if not explicitly initialized.",
                        Arrays.asList("false", "true"),
                        0
                ),
                //75
                new Question(
                        "When you pass a variable as an argument to a \n" +
                                "method call, what are you passing?",
                        Arrays.asList("the actual value", "a copy of the value"),
                        1
                ),
                //76
                new Question(
                        "When you pass an object reference as an argument to a \n" +
                                "method call, what gets passed?",
                        Arrays.asList("a copy of the reference", "the original reference", "a reference to a copy", "the object itself"),
                        0
                ),
                //77
                new Question(
                        "When using the right-shift operator (>>), what \n" +
                                "happens to the bits which move off the right end?",
                        Arrays.asList("They're added to result", "They wrap around", "They're gone"),
                        2
                ),
                //78
                new Question(
                        "x = true; \n" +
                                "y = true; \n" +
                                "What is the result of x ^ y?",
                        Arrays.asList("compiler error", "false", "true"),
                        1
                ),
                //79
                new Question(
                        "x = true; \n" +
                                "y = false; \n" +
                                "What is the result of x & y?",
                        Arrays.asList("compiler error", "false", "true"),
                        1
                ),
                //80
                new Question(
                        "Can one object access a private variable of another \n" +
                                "object of the same class?",
                        Arrays.asList("No", "Yes"),
                        1
                ),
                //81
                new Question(
                        "For object x to access a method of object y, when the \n" +
                                "method has no access modifier, object x MUST be an \n" +
                                "instance of a class which is:",
                        Arrays.asList("In the same package as y", "declared public", "the same class as y", "a subclass of y"),
                        0
                ),
                //82
                new Question(
                        "static variables are implicitly final.",
                        Arrays.asList("true", "false"),
                        1
                ),
                //83
                new Question(
                        "Is it legal to access a static method using an \n" +
                                "instance of the class?",
                        Arrays.asList("No", "Yes"),
                        1
                ),
                //84
                new Question(
                        "Are static methods allowed to access instance variables \n" +
                                "using this.var?",
                        Arrays.asList("No", "Yes"),
                        0
                ),
                //85
                new Question(
                        "The only things which can be defined inside a class \n" +
                                "and outside a method are instance variables \n" +
                                "and inner classes.",
                        Arrays.asList("true", "false"),
                        1
                ),
                //86
                new Question(
                        "Can a constructor be declared private?",
                        Arrays.asList("Yes", "No"),
                        0
                ),
                //87
                new Question(
                        "Can a constructor be declared abstract?",
                        Arrays.asList("Yes", "No"),
                        1
                ),
                //88
                new Question(
                        "Can a constructor be declared static?",
                        Arrays.asList("Yes", "No"),
                        1
                ),
                //89
                new Question(
                        "Is this legal? \n" +
                                "float f = 2;",
                        Arrays.asList("Yes", "No"),
                        0
                ),
                //90
                new Question(
                        "Can you automatically convert an int to a double?",
                        Arrays.asList("Yes", "No"),
                        0
                ),
                //91
                new Question(
                        "Class Y is a subclass of class X. Will this compile?",
                        Arrays.asList("Yes", "No"),
                        1
                ),
                //92
                new Question(
                        "Class Y is a subclass of class X. Will this compile? \n" +
                                "Y myY = new Y(); \n" +
                                "X myX = myY;",
                        Arrays.asList("Yes", "No"),
                        0
                ),
                //93
                new Question(
                        "using a break in a for loop causes the loop to break out \n" +
                                "of the current iteration and jump to the next iteration \n" +
                                "of the loop.",
                        Arrays.asList("false", "true"),
                        0
                ),
                //94
                new Question(
                        "Is this legal? \n" +
                                "int i = 0; \n" +
                                "if ( i ) {}",
                        Arrays.asList("Yes", "No"),
                        1
                ),
                //95
                new Question(
                        "In a switch statement, the argument to the case label \n" +
                                "(case: argument) can be any variable which can fit \n" +
                                "within an int.",
                        Arrays.asList("false", "true"),
                        0
                ),
                //96
                new Question(
                        "In a switch construct, once a matching case value is \n" +
                                "found, execution will continue through other case \n" +
                                "labels until it reaches a break statement.",
                        Arrays.asList("false", "true"),
                        1
                ),
                //97
                new Question(
                        "In a switch construct, the default statement must be \n" +
                                "placed after all the case statements.",
                        Arrays.asList("false", "true"),
                        0
                ),
                //98
                new Question(
                        "All exceptions inherit from:",
                        Arrays.asList("java.lang.Error", "java.lang.Exception", "java.lang.Throwable"),
                        2
                ),
                //99
                new Question(
                        "If method A declares that it throws an exception and \n" +
                                "method B calls method A, then method B must ALWAYS \n" +
                                "declare the same exception.",
                        Arrays.asList("false", "true"),
                        0
                ),
                //100
                new Question(
                        "Class A inherits from B. B includes a method with the \n" +
                                "same name, return type, and arguments as a method in A. \n" +
                                "This is an example of:",
                        Arrays.asList("Overloading", "Overriding"),
                        1
                ),
                //101
                new Question(
                        "a class can define two methods with the same name as \n" +
                                "long as the return types are different.",
                        Arrays.asList("false", "true"),
                        0
                ),
                //102
                new Question(
                        "an overriding method of a subclass can throw an \n" +
                                "ArithmeticException not thrown by the original \n" +
                                "(overridden) method.",
                        Arrays.asList("false", "true"),
                        1
                ),
                //103
                new Question(
                        "overloaded methods must not throw new checked exceptions \n" +
                                "not thrown by the original method.",
                        Arrays.asList("false", "true"),
                        0
                ),
                //104
                new Question(
                        "an inner class has free access to ALL member data of \n" +
                                "its enclosing (outer) class.",
                        Arrays.asList("false", "true"),
                        1
                ),
                //105
                new Question(
                        "It is not possible to have an instance of a non-static \n" +
                                "inner class before any instances of the outer class \n" +
                                "have been created.",
                        Arrays.asList("false", "true"),
                        1
                ),
                //106
                new Question(
                        "This is a legal way to create an instance of an inner class: \n" +
                                "OuterClass.InnerClass x = new OuterClass().new InnerClass();",
                        Arrays.asList("false", "true"),
                        1
                ),
                //107
                new Question(
                        "public class Outer \n" +
                                "{ \n" +
                                "    int x ; \n" +
                                "    static class Inner \n" +
                                "    { \n" +
                                "        void foo() \n" +
                                "        { \n" +
                                "            x = 5 ; \n" +
                                "        } \n" +
                                "    } \n" +
                                "} \n",
                        Arrays.asList("does not compile", "compiles"),
                        0
                ),
                //108
                new Question(
                        "Class B extends A. B overrides the doStuff() method \n" +
                                "inherited from A. Which methods gets called if you say: \n" +
                                "A myA = new B(); \n" +
                                "myA.doStuff();",
                        Arrays.asList("compiler error", "doStuff() in B", "doStuff() in A", "runtime error"),
                        1
                ),
                //109
                new Question(
                        "Are you allowed to have more than one top-level \n" +
                                "(non-inner) class definition per source file?",
                        Arrays.asList("No", "Yes"),
                        1
                ),
                //110
                new Question(
                        "Each source file must have a public class in it.",
                        Arrays.asList("No", "Yes"),
                        0
                ),
                //111
                new Question(
                        "Assume the bit value of byte x is 00101011. \n" +
                                "What is the result of x >> 2;",
                        Arrays.asList("11001010", "10101100", "00001010"),
                        2
                ),
                //112
                new Question(
                        "Assume the bit pattern of byte x is:  10110001. \n" +
                                "What will the sign of x be after x >> 2;",
                        Arrays.asList("negative", "positive"),
                        0
                ),
                //113
                new Question(
                        "What does the unsigned right-shift operator do to a \n" +
                                "negative number?",
                        Arrays.asList("change its sign", "keep it negative"),
                        0
                ),
                //114
                new Question(
                        "What is the result of 00110011 & 11110000 ?",
                        Arrays.asList("00000000", "00110000", "11110011"),
                        1
                ),
                //115
                new Question(
                        "The short-circuit operators work on boolean types, \n" +
                                "not bits.",
                        Arrays.asList("true", "false"),
                        0
                ),
                //116
                new Question(
                        "Methods which have no access modifier can only be \n" +
                                "accessed by classes within the same package.",
                        Arrays.asList("true", "false"),
                        0
                ),
                //117
                new Question(
                        "methods which are marked protected can be accessed only \n" +
                                "by classes within the same package.",
                        Arrays.asList("true", "false"),
                        1
                ),
                //118
                new Question(
                        "Can a public method be overriden by a protected method?",
                        Arrays.asList("Yes", "No"),
                        1
                ),
                //119
                new Question(
                        "methods and variables can be declared as final, but a \n" +
                                "class cannot be declared final.",
                        Arrays.asList("true", "false"),
                        1
                ),
                //120
                new Question(
                        "Can a final class be subclassed?",
                        Arrays.asList("Yes", "No"),
                        1
                ),
                //121
                new Question(
                        "Can you have a final abstract class?",
                        Arrays.asList("Yes", "No"),
                        1
                ),
                //122
                new Question(
                        "Can a member variable be declared abstract?",
                        Arrays.asList("Yes", "No"),
                        1
                ),
                //123
                new Question(
                        "Can an abstract method be overridden?",
                        Arrays.asList("Yes", "No"),
                        0
                ),
                //124
                new Question(
                        "Can a class be declared native?",
                        Arrays.asList("Yes", "No"),
                        1
                ),
                //125
                new Question(
                        "Can a member variable be declared native?",
                        Arrays.asList("Yes", "No"),
                        1
                ),
                //126
                new Question(
                        "Can a method be declared transient?",
                        Arrays.asList("Yes", "No"),
                        1
                ),
                //127
                new Question(
                        "Can a class be declared transient?",
                        Arrays.asList("Yes", "No"),
                        1
                ),
                //128
                new Question(
                        "Can a member variable be declared synchronized?",
                        Arrays.asList("Yes", "No"),
                        1
                ),
                //129
                new Question(
                        "Can a class be declared synchronized?",
                        Arrays.asList("Yes", "No"),
                        1
                ),
                //130
                new Question(
                        "Can a method be declared synchronized?",
                        Arrays.asList("Yes", "No"),
                        0
                ),
                //131
                new Question(
                        "What happens when you compile this: \n" +
                                "byte a = 2;  \n" +
                                "a++;",
                        Arrays.asList("Runtime error", "Won't compile without cast", "Compiles and runs"),
                        2
                ),
                //132
                new Question(
                        "Class Y is a subclass of class X.  Will this compile? \n" +
                                "X myX = new X();  \n" +
                                "Y myY = (Y)myX;",
                        Arrays.asList("Yes", "No"),
                        0
                ),
                //133
                new Question(
                        "In a switch statement, the argument to the switch ( ) \n" +
                                "can be a variable as long as it is \n" +
                                "compatible with an int.",
                        Arrays.asList("false", "true"),
                        1
                ),
                //134
                new Question(
                        "in a switch construct, the default statement will always \n" +
                                "execute.",
                        Arrays.asList("false", "true"),
                        0
                ),
                //135
                new Question(
                        "in a switch construct, the default statement will \n" +
                                "execute if no case values match the switch() argument.",
                        Arrays.asList("false", "true"),
                        1
                ),
                //136
                new Question(
                        "in a try/catch construct, the catch blocks may be \n" +
                                "written in any order and the most narrow/specific \n" +
                                "catch argument is chosen at runtime.",
                        Arrays.asList("false", "true"),
                        0
                ),
                //137
                new Question(
                        "a finally block will only be executed if the exception \n" +
                                "is not caught.",
                        Arrays.asList("false", "true"),
                        0
                ),
                //138
                new Question(
                        "a MalformedURLException is a checked exception.",
                        Arrays.asList("false", "true"),
                        1
                ),
                //139
                new Question(
                        "an ArithmeticException is a checked exception.",
                        Arrays.asList("false", "true"),
                        0
                ),
                //140
                new Question(
                        "if a try/catch construct calls System.exit(), \n" +
                                "the finally block will execute first.",
                        Arrays.asList("false", "true"),
                        0
                ),
                //141
                new Question(
                        "an overriding method can change the access modifier \n" +
                                "from default to protected.",
                        Arrays.asList("false", "true"),
                        1
                ),
                //142
                new Question(
                        "To invoke an overriden method from the method which \n" +
                                "overrides it, use:",
                        Arrays.asList("this.theMethod();", "super.theMethod();"),
                        1
                ),
                //143
                new Question(
                        "constructors are not inherited.",
                        Arrays.asList("false", "true"),
                        1
                ),
                //144
                new Question(
                        "It is legal to declare an array with an interface as \n" +
                                "the type (instead of a class or primitive) -- example: \n" +
                                "PetInterface []p;",
                        Arrays.asList("false", "true"),
                        1
                ),
                //145
                new Question(
                        "Can a method be declared volatile?",
                        Arrays.asList("No", "Yes"),
                        0
                ),
                //146
                new Question(
                        "Is cast a keyword?",
                        Arrays.asList("No", "Yes"),
                        0
                ),
                //147
                new Question(
                        "What is the result of the following code \n" +
                                "System.out.println( Math.round(-3.22) );",
                        Arrays.asList("-3.0", "-4.0", "-4", "-3"),
                        3
                ),
                //148
                new Question(
                        "What is the result of the following code? \n" +
                                "System.out.println( Math.ceil(-3.22) );",
                        Arrays.asList("-3.0", "-4.0", "-4", "-3"),
                        0
                ),
                //149
                new Question(
                        "What is the result of the following code? \n" +
                                "System.out.println( Math.floor(-3.22) );",
                        Arrays.asList("-3.0", "-4.0", "-4", "-3"),
                        1
                ),
                //150
                new Question(
                        "What is the result of the following code? \n" +
                                "System.out.println( Math.sqrt(-4) );",
                        Arrays.asList("NaN", "2.0", "2", "-2", "-2.0"),
                        0
                ),
                //151
                new Question(
                        "Will this compile? \n" +
                                " int iArray[] = new int[] {1,2,3,4,5};",
                        Arrays.asList("Yes", "No"),
                        0
                ),
                //152
                new Question(
                        "Will this compile? \n" +
                                " int iArray[5]= new int[]{1,2,3,4,5};",
                        Arrays.asList("Yes", "No"),
                        1
                ),
                //153
                new Question(
                        "Assuming all variables are declared and \n" +
                                " initialized properly, will this compile? \n" +
                                " for ( i = 1, j = 2; i < 3; i++, j++ ){};",
                        Arrays.asList("Yes", "No"),
                        0
                ),
                //154
                new Question(
                        "Assuming all variables are declared and \n" +
                                " initialized properly, will this compile? \n" +
                                " for ( i = 1; k < 5; j++ ) {};",
                        Arrays.asList("Yes", "No"),
                        1
                ),
                //155
                new Question(
                        "if you do not provide any constructor for \n" +
                                " your class, the compiler will insert \n" +
                                "a default constructor with public access modifier",
                        Arrays.asList("true", "false"),
                        1
                ),
                //156
                new Question(
                        "An interface can extend at most one interface.",
                        Arrays.asList("true", "false"),
                        1
                ),
                //157
                new Question(
                        "An abstract class can  have a constructor.",
                        Arrays.asList("No", "Yes"),
                        1
                ),
                //158
                new Question(
                        "If there is a return statement in the catch block, \n" +
                                "the finally block will not be executed.",
                        Arrays.asList("false", "true"),
                        0
                ),
                //159
                new Question(
                        "what will be the output of this code: \n" +
                                "class Exam\n" +
                                "{\n" +
                                "    protected String difficultyLevel = \"easy\";\n" +
                                " \n" +
                                "    public void printDifficultyLevel()\n" +
                                "    {\t\n" +
                                "        System.out.println( difficultyLevel );\n" +
                                "    }\n" +
                                "}\n" +
                                "class SCJPExam extends Exam\n" +
                                "{\n" +
                                "    private String difficultyLevel = \"killing\";\n" +
                                "}\n" +
                                "SCJPExam myExam = new SCJPExam();\n" +
                                "myExam.printDifficultyLevel();",
                        Arrays.asList("easy", "killing"),
                        0
                ),
                //160
                new Question(
                        "An anonymous inner class cannot have a constructor",
                        Arrays.asList("false", "true"),
                        1
                )
        );

        QuizModel model = new QuizModel(questions);
        QuizViewGUI view = new QuizViewGUI();
        QuizController controller = new QuizController(model, view);

        view.setController(controller);
    }
}