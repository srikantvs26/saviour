A method can have “normal” parameters along with a variable-length parameter. However,
the variable-length parameter must be the last parameter declared by the method. For example,
this method declaration is perfectly acceptable:

```int doIt(int a, int b, double c, int ... vals) {```


In this case, the first three arguments used in a call to doIt( ) are matched to the first three
parameters. Then, any remaining arguments are assumed to belong to vals.

Remember, the varargs parameter must be last. For example, the following declaration is incorrect:

```int doIt(int a, int b, double c, int ... vals, boolean stopFlag) { // Error!```

Here, there is an attempt to declare a regular parameter after the varargs parameter, which is illegal.


There is one more restriction to be aware of: there must be only one varargs parameter. For example, this declaration is also invalid:

```int doIt(int a, int b, double c, int ... vals, double ... morevals) { // Error!```

We can also overload varargs methods with other varargs methods. VarArgsDemo3.java
We an also overload varargs methods with non varargs methods. VarArgsDemo4.java

There can also be ambiguity in varargs
    1. in method call VarArgsDemo5
    2. in method definition VarArgsDemo6

