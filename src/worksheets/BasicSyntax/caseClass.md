 - By default, case classes are **immutable** and compared by value
 
 - You can instantiate case classes without `new` keyword
    - This is because case classes have an apply method by default
    
 - When you create a case class with parameters, the parameters are public `val`s
    - therefore immediately immutable
    
 - Case classes are compared by structure, not by reference
    - Even though `message2` and `message3` refer to different objects,
     the value of each object is equal.  

```$xslt
case class Message(sender: String, recipient: String, body: String)

val message2 = Message("jorge@catalonia.es", "guillaume@quebec.ca", "Com va?")
val message3 = Message("jorge@catalonia.es", "guillaume@quebec.ca", "Com va?")
val messagesAreTheSame = message2 == message3  // true
```

- 