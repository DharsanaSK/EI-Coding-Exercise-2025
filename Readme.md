# **EXERCISE-1**
## 1. Structural design pattern
- Adapter
- Compsoite
## 2. Behvioral design pattern
- State
- Strategy
## 3. Creational design pattern
- Singleton
- Factory

---

# **EXERCISE-2 : Satellite Command System**

1. **Initialize the Satellite**  
   Create a class or function that initializes the satellite's attributes to their initial state.

2. **Rotate**  
   Implement a command called `rotate` that takes a **direction parameter** (`North`, `South`, `East`, `West`) and sets the satellite's orientation accordingly.  

   **Example:**  
   ```java
   rotate(North) // sets the orientation to "North"
3. **Activate/Deactivate Solar Panels**  
   Implement commands called `activatePanels` and `deactivatePanels` to control the solar panels' status.  

   **Example:**  
   ```java
   activatePanels()   // sets the solar panels to "Active"
   deactivatePanels() // sets the solar panels to "Inactive"
4. **Collect Data**  
Implement a command called `collectData` that increments the **Data Collected** attribute by **10 units**, but **only if the solar panels are "Active"**.  

   **Example:**  
   ```java
   collectData() // sets the data collected to 10 if the solar panels are "Active"
---      
**Compile using**
 ```
  javac exp2\state\*.java exp2\satellite\*.java exp2\command\*.java exp2\invoker\*.java exp2\utils\*.java exp2\exceptions\*.java exp2\Main.java
```
**Run using**    
```
java -cp . exp2.Main
```
---
