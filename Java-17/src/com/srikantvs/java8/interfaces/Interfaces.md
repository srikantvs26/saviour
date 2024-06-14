Interfaces in java is used to abstract a method from its implementation. *are bhai iska kya matlab hai?*
We define a Vehicle interface with method signatures for `start()` and `stop().`
Both Car and Motorcycle implement this interface and provide their own implementations for the methods.
This way, we separate the definition of methods (interface) from their implementations (in classes implementing the interface). This allows each class to define its own behavior for the methods defined in the interface, providing flexibility and promoting code reuse.
*an interface is like a contract*
With Interfaces we can specify what a class must do, but not how it does it. Interfaces are syntactically similar to classes. They lack instance variables and their methods are declared without any body.

Once we define an interface multiple classes can implement an interface. Also one class can implement multiple interfaces.
