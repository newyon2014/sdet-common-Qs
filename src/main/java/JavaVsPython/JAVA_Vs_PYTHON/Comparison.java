package JavaVsPython.JAVA_Vs_PYTHON;

public class Comparison {
    /*
    *     Function and method calls
            - Python and Java call methods similarly:  If you have an object x and method foo, you go x.foo()
            - Python also has a library of global functions that are not methods of objects.  One such function
              is len, which return  ns the length of its argument. In Java, all functions are methods.

          Assignment statements
            - Both languages use = to indicate assignment:  x = 3
            - Both use standard math operators:  x = 3*(4+5)
            - Both use integers and floating point numbers x = 3.0*(4+5)
            - Python has exponent operator **, e.g., x = 2**3, but Java needs x = Math.exp(2,3);

          Comparison
            - Both languages use >,<,>=,<=,!=, ==
            - Python also allows <> for !=

          Strings
            - Both languages have string constants "hi, there"
            - Python allows single or double quotes "hi" == 'hi'
            - Java uses single quotes for single chars, which are components of strings but are not themselves strings.
              "h" != 'h'
            - Both languages use + for concatenation:  s = abc + def
            - Python treats concat like addition in another way that Java doesn't:  In math 2*3 = 3 + 3, so in Python,
              2*abc == abc + abc.

          Booleans
            - Both languages have booleans
            - Java uses true and false whereas Python uses True and False and any value (all values are true other than False, 0, and "").
            - Java uses && and || and ! whereas Python uses and and or and not

          Line endings:
            - Java uses semicolons to end statements whereas Python uses newline to end statements.
            - You can use a semicolon in Python, but that is just used as a separator if you want to include two statements on the same line
            - In Java, you could completely delete newlines & put a whole program on one line and it makes no difference to the computer.
            - The only use of newlines in Java are:
                  a.     to end a line comment starting with //
                  b.     as a separator between tokens

          Blocks:
             - Java uses { and } to denote blocks.
             - Python uses indentation and the preceding line usually ends with a colon

          Increment:
             - Java uses x++, ++x, x+=1, x=x+1
             - Python uses x+=1 and x=x+1 but not x++ and ++x

          Variables:
             - Java variables are statically typed, which means you have to declare the type before using the
               variable and the variable can only store values of that type
             - Python variables are dynamically typed, which means the same variable can have many kinds of values.
               You don't need to explicitly declare a variable and instead can just start using it by assigning it
               an initial value.

           Comments:
             - Java uses // for a line comment and /* */ // for a multiline comment
    /*       - Python uses # for a line comment and """ and ''' for a multiline comment.Python uses # for a line
               comment and """ and ''' for a multiline comment.

           Conditionals:
              Java uses
                 if ( <cond> ) { <body> }
                 if ( <cond> ) { <body> } else { <body> }
                 if ( <cond> ) { <body> } else if ( <cond> ) { <body> }
              Python uses if, elif, and else:
                 if <cond>: <body indented on succeeding lines>
                 elif  <cond>: <body indented>
                 else: <body indented>
           Loops:
              Java uses
                  while ( <cond> ) { <body> }
                  for ( <Type> <var> : <sequence>) { <body> }
                  for ( <var decl> ; <cond> ; <update> ) { <body> }
              Python uses
                  while <cond>:  <body indented on succeeding lines>
                  for <var> in <sequence>: <body indented on succeeding lines>
           Arrays
              Python
                   a.  Arrays are called lists and are displayed using square brackets:
                           A = [spam, baked beans, sausage, spam]
                           B = A[0:2] # B = [spam, baked beans]
                           B[1] = spam # B = [spam, spam]
                           B = B + [Eric] # B = [spam, spam, Eric]
                    b.  Strings can be treated as immutable arrays of characters.
                           S = spam
                           c = S[1] # c = p
              Java
                    a.  Arrays are displayed using curly brackets:
                           int[] A = new int[]{3,5,7};
                           A[0] = 1; // A = {1,5,8}
                           A = new int[5]; // A = {0,0,0,0,0}
                    b.  Arrays are fixed in size when they are first constructed and cannot be
                        expanded or shrunk.  To expand an array, create a new larger array and copy the
                        data from the old array into it:
                             int[] A = new int[]{3,5,7};
                             int[] B = new int[4];
                             System.arrayCopy(A,0,B,0,3);
                             A = B;
                            A[3] = 9;
                     c. Strings are not arrays.  You need to use String methods to access individual characters:
                             String s = spam;
                             char c = s.charAt(1);
           Packages and Imports
               Any moderately large program cannot all be stored in one file, if you want to preserve
               readability and reusability of components. When you need to run a program in one file, how do
               you tell which other files to use to find other classes?

               Python:  use the import directive
                    a.  If you have defined a function foo in a file named bar.py and you want to use that for
                        function in your current program, then at the head of your program you need to include a
                        statement of the form
                             import bar
                             x = bar.foo()
                    b.  or you can do it like this:
                        from bar import foo
                        x = foo()
                    c.   This works fine if the bar.py file is in the same directory as your program or is in a
                         directory listed in your PYTHONPATH system environment variable.  That variable includes
                         the current directory and the directory containing the Python library on your computer.
                  Java:
                     a.  If you have several Java files (with no package directive at the top) all in the same
                         directory, then you can just use them all, as long as you compile them all first.
                     b.  For example, if you have files Foo.java, Bar.java, and Baz.java in your current
                         directory, then each of the files can contain code that uses the classes in the other files
                         without need of any special directives.
                     c.  In the Foo.java file, you can have code like:
                          Bar b = new Bar();
                     d.  You just need to remember to compile them all before using them:
                             $ javac *.java
                             $ java Foo
                     e.  You dont have to have all the files in the current directory, as long as (a) you compile them all
                         wherever they are and (b) they directories they are in is included in the environment variable, called
                         CLASSPATH, which defaults to the current directory and the directory containing the Java library.
                     f.  What about the package directive?
                     g.  Java allows you to group files into packages.  If you want your current file to be in the package
                         foo, then at the top of the Java file, write package foo;
                     h.  Usually, library code is in packages.  For example, the ArrayList class is in the java.util package.
                         One way to use that class in your program is to always use the full name of the class, as in
                             java.util.ArrayList list = new java.util.ArrayList();
                             list.add("hello");
                      i.  As a convenience to help you avoid having to include the "java.util" prefix each time,
                          you can add the following line to the top of your file:
                               import java.util.ArrayList;
                               in which case you can then write:
                                    ArrayList list = new ArrayList();
                                    list.add("hello");
                       j.  To allow you to avoid the prefixes for all the classes in the java.util library, you could
                           include the line:
                              import java.util.*;

           Source file structure
               - A Python source file can contain a mix of code to be executed and
               definitions of classes, functions, methods.  When you run the file, the
               code gets executed and the definitions get declared in the given order,
               so if you want to define a function and also call that function, the def needs to go first.

               - A Python source file can contain just definitions and when it is executed, those
               definitions are loaded and ready to be used.  (In the Python interactive mode,
                you would use the command execfile(<filename>))
               - A Java source file contains one or more class declarations.
                  If you try to execute a file, the main method in the public class
                  in the file is the one that is executed.  If there is no method called main then you get an error message.
                  A Java class declaration consists of a bunch of optional stuff then
                  the word class followed by a name for the class and then braces
                  { and } that enclose the body of the declaration.  The three main things in the body are:
                         i. field declarations
                         ii. constructor declarations
                        iii. method declarations
                 Java field declarations are just variables that exist inside an object of the class.
                 Java constructors are called when a new object is created to help initialize it.
                 Java method declarations are the functions that get executed.
                    Java Example:
                            public class Person {
                               private String name;
                               private int age;
                               public Person(String n, int a) {
                                 this.name = n;
                                 this.age = a;
                               }
                               public String toString() {
                                 return this.name + : + this.age;
                               }
                               public void setAge(int newAge) {
                                 this.age = newAge;
                               }
                               public static void main(String[] args) {
                                 Person p = new Person(Dale, 50);
                                 System.out.println(p.toString());
                                 Person q = new Person(Arnie, 17);
                                 q.setAge(18);
                                 System.out.println(q.toString());
                               }
                           Here is the equivalent Python code:
                                    class Person(object):
                                       def __init__(self, n, a):
                                         self.name = n
                                         self.age = a
                                       def toString(self):
                                         return self.name + : + str(self.age);
                                       def setAge(self, newAge):
                                         self.age = newAge;
                                    if __name__ == __main__:
                                       p = Person(Dale, 50)
                                       print p.toString()
                                       q = Person(Arnie,17)
                                       q.setAge(18)
                                       print q.toString()

           Java Static fields and methods
               You can use the modifier static in front of fields and methods in java classes.
               In that case the field and method exist independent of objects of the class and instead they belong to the class.
                   Example:
                       class C {
                         public static int x = 0;
                         public static void foo() { x++; }
                       }
                       User:
                       C.x = 3;
                       C.foo();
                       C c = new C();
                       c.x = 4; // OK too
                       c.foo(); // OK too
                          In this case, the field x is independent of the objects of the class and is shared by all of them
                          The method foo is independent of objects and can be invoked without creating any objects.

           Java inheritance
                One class can be a subclass of another class.  The granddaddy of all classes is the Object class.
                   Example:
                           class A {
                             private int x = 3;
                             public void foo() {x++;}
                           }
                           class B extends A {
                             private int y = 4;
                             public void bar() {y++;}
                           }
                    User:
                       B b = new B();
                       b.foo();
                       b.bar();
                       b.toString();
               In this case, A has the superclass Object and B has the superclasses A and Object.
               Each class can have only one superclass but can have many subclasses.
               Polymorphism:  Since objects of class B have all the fields and methods of objects of class A,
               it is legal to assign an object of class B to a variable of type A.  Every object of class B is-a object of class A:
                    A a = new B();
                   Suppose B also had a foo() method:
                   public void foo() {y--;}
                   What happens now to the following code?
                      A[] array = new A[]{new A(), new B()};
                      for( A a : array) { a.foo(); }
                      The answer is that the first time a.foo() is called x is incremented and the second time a.foo()
                      is called y is decremented.  This action is called dynamic method invocation.  Regardless of the declared
                      type of the variable a, the actual type of the value of a is used to decide which method to execute.
     */
}
