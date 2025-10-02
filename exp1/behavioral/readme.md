# Behavioral pattern 

## 1. State   
**Allows an object to alter its behavior when its internal state changes, appearing as if the object changed its class.**
- **Usecase**: Music Player
- The State Pattern helps by:
   - Allowing easy addition of new media types without touching the client.    
   - Making the context (MusicPlayer) simpler by delegating state-specific behavior to state objects.
   - Avoiding complex conditional logic (`if/else` or `switch`) for state handling.
### Components  
1. **State** (`PlayerState.java`) → interface defining the methods (`pressPlay()`, `pressPause()`) that concrete states implement.
2. **Concrete States** (`StoppedState.java`, `PlayingState.java`,`PausedState.java`) → represent different states of the player; implement behavior for play/pause accordingly.
3. **Context** (`MusicPlayer.java`) → maintains a reference to the current state; delegates requests (`pressPlay()`, `pressPause()`) to the current state.
4. **Client** (`Main.java`) → interacts with the MusicPlayer without worrying about which state it is in.
### Output
```
Starting music...
Already playing...
Music paused.
Already paused.
Resuming music...
```
### Summary
- The State Pattern lets the MusicPlayer change its behavior dynamically depending on whether it is **stopped, playing, or paused**
- The client (`Main.java`) simply calls `pressPlay()` or `pressPause()` without worrying about the internal state logic.
- This keeps the system clean, extensible, and easy to maintain while avoiding long conditional checks inside the `MusicPlayer`.

---


## 2. Strategy  
**Defines a family of algorithms, encapsulates each one, and makes them interchangeable at runtime without changing the client code.**
- **Usecase**: Payment System
- The Strategy Pattern helps by:    
   - Allowing clients to **choose different algorithms (strategies)** dynamically.
   - Promoting the **Open/Closed Principle** – new strategies can be added without modifying existing code.
   - Decoupling the context (e.g., ShoppingCart) from the specific implementation of the algorithm.
### Components  
1. **Strategy** (`PaymentStrategy.java`) → defines the common interface, e.g., `pay(amount)`.
2. **Concrete Strategies** (`CreditCardPayment.java`,`PayPalPayment.java`,`UpiPayment.java`) →implement different payment methods.
3. **Context** (`ShoppingCart.java`) → maintains a reference to a `PaymentStrategy` and delegates the `pay()` operation to the selected strategy.
4. **Client** (`Main.java`) → sets the strategy at runtime and calls the context’s method without worrying about how the payment is processed.
### Output
```
500 paid using Credit Card: 1234-5678-9012
1200 paid using PayPal account: user@example.com
300 paid using UPI: user@upi
```
### Summary
The Strategy Pattern lets a client choose different **algorithms or behaviors** (like payment methods) at runtime. The client interacts only with the **strategy interface**, without knowing the implementation details. This makes the system flexible, extendable, and easy to maintain.

---
