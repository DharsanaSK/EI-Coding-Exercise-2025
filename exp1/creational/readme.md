#  Creational pattern 

## 1. Singleton   
**Ensures that a class has only **_one instance_** throughout the application and provides a **_global access point_** to it.**
- **Usecase**: Logger System
- The Singleton Pattern helps by:    
   - Ensuring that only one logger object exists, so all messages go into the same log
   - Providing a single global point of access (`getInstance()`) for logging messages.
   - Avoiding duplicate resources (e.g., multiple log files or DB connections).
### Components  
1. **Singleton** (`Logger.java`)    
   - Holds a private static instance of itself.
   - Provides a static `getInstance()` method to return that single instance.
   - Has methods to perform the actual work (e.g., `log()`).
2. **Client** (`Main.java`)   
   - Accesses the Singleton via `Logger.getInstance()`.
   - Verifies that multiple calls to `getInstance()` return the same object.
### Output
```
[LOG]: Application started.
[LOG]: User logged in.
true
```
### Summary
The Singleton Pattern ensures that only **one instance** of `Logger` exists.
- Both `logger1` and `logger2` refer to the **same object**, so logs are consistent.
- This avoids duplicate logging resources and ensures all components share the same log system.
- It provides a **global access point** (`getInstance()`) to the single instance.

---

## 2. Factory   
**Provides an interface for creating objects but allows subclasses or factory methods to decide which class to instantiate.**
- **Usecase**: Notification Factory
- The Factory Pattern helps by:    
   - Encapsulating the object creation logic.
   - Decoupling client code from concrete classes.
   - Allowing easy addition of new product types without changing existing client code.
### Components  
1. **Product Interface** (`Notification.java`) → defines the common method `notifyUser()` that all notifications must implement.
2. **Concrete Products** (`EmailNotification.java`, `SMSNotification.java`) → classes that implement the `Notification` interface.
3. **Creator** (`NotificationCreator.java`) → abstract class declaring the factory method `factoryMethod()`.
4. **Concrete Creators** (`EmailNotificationCreator.java`, `SMSNotificationCreator.java`) → subclasses that override `factoryMethod()` to return a specific product.
5. **Client** (`Main.java`) → uses the creator to send notifications without knowing the concrete class being instantiated.
### Output
```
Email Notification sent!
SMS Notification sent!
```
### Summary
- The Factory Pattern lets the client request a notification using a single interface (`NotificationCreator`), while the actual object creation (Email or SMS) is decided by the specific factory subclass.
- This ensures loose coupling and makes it easy to add new notification types without modifying client code.

---
