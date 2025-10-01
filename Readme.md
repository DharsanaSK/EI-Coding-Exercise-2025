# **EXERCISE-1**
## I. Structural design pattern
1. Adapter
2. Compsoite
## II. Behvioral design pattern
1. State
2. Strategy
## III. Creational design pattern
1. Singleton
2. Factory

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
