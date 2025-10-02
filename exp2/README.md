# EXERCISE-2: Satellite Command System

The **Satellite Command System** is a console-based simulation that allows controlling a satellite in an orbit by       
1. **Rotating the satellite**   
2. **Changing the solar panel status(Active/Deactive)**  
3. **Collecting data**
---
## Structure 
```
Satellite-Command-System/
│
├── exp2/
│   ├── command/                  # Command Pattern Implementation
│   │   ├── Command.java
│   │   ├── RotateCommand.java
│   │   ├── ActivatePanelsCommand.java
│   │   ├── DeactivatePanelsCommand.java
│   │   └── CollectDataCommand.java
│   │
│   ├── state/                    # State Pattern Implementation
│   │   ├── PanelState.java
│   │   ├── ActiveState.java
│   │   └── InactiveState.java
│   │
│   ├── invoker/                  # Invoker for Commands
│   │   └── CommandInvoker.java
│   │
│   ├── satellite/                # Receiver (main Satellite entity)
│   │   └── Satellite.java
│   │
│   ├── exceptions/               # Custom Exceptions
│   │   └── InvalidCommandException.java
│   │
│   ├── utils/                    # Utility classes 
│   │   └── LoggerUtil.java
│   │
│   └── Main.java                 # Client (entry point)
│
└── README.md                     
```
---
## Design Patterns Used

### 1. Command Pattern
- Each action (rotate, activate/deactivate panels, collect data) is implemented as a **command object**.
- This decouples the **sender** (user input) from the **receiver** (satellite) and allows for extending with new commands easily

### 2. State Pattern
- The **solar panel** functionality uses the State pattern.
- Two states are implemented:
  - **ActiveState** – panels are active and can collect data.
  - **InactiveState** – panels are inactive; data collection is blocked.
- This allows the satellite to **change behavior dynamically** based on its current state, making the system more flexible and maintainable.

## Follows **SOLID principles**:
  - Single Responsibility: Each command and state class handles only one responsibility.
  - Open/Closed: Easily extendable with new commands or states.
---
## Class Diagram
<img width="1536" height="1024" alt="image" src="https://github.com/user-attachments/assets/b31f4fac-82fb-4e43-a0ec-f42fde17e333" />

---
## Workflow

1. **User Input**
   - The system reads commands  and validates the input and handles exceptions gracefully.

2. **Command Execution**
   - Commands are sent to the **CommandInvoker**, which executes them on the satellite.

3. **State Management**
   - Solar panel behavior is handled by the current **state** of the satellite.
   - Only allows data collection if the panels are active.

4. **Output**
   - System prints the current state of the satellite after command execution:
     ```
     Orientation: South
     Panel status: Active
     Data Collected: 10
     ```
---       

## Output    
1. **Initial status**
   - When the program starts, the satellite is in its default state.
     <img width="902" height="172" alt="image" src="https://github.com/user-attachments/assets/e1cfd2ba-2f1a-4a61-91b3-d13595e73261" />

2. **Rotation**
   - Rotating the satellite updates its orientation.
   - If it rotates to the same direction again,
     <img width="904" height="182" alt="image" src="https://github.com/user-attachments/assets/a1fa6e8f-9323-4eed-b7f6-a3d92c7726f7" />
   - Else
     <img width="930" height="218" alt="image" src="https://github.com/user-attachments/assets/464eec4a-d75d-4fed-987c-3d7cde4a9c6b" />
     
3. **Data Collection**
   - **ActiveState** – panels are active and can collect data.
     <img width="901" height="263" alt="image" src="https://github.com/user-attachments/assets/0deb06b5-4d7f-4d73-82c6-9786df2a7b9e" />

   - **InactiveState** – panels are inactive; data collection is blocked.
     <img width="902" height="266" alt="image" src="https://github.com/user-attachments/assets/cd4a3077-95e6-4109-aca9-5fbaa706fe25" />

4. **Exceptions**
   - Invalid Command & Direction for rotation
     <img width="905" height="135" alt="image" src="https://github.com/user-attachments/assets/28858407-65f5-4686-89c6-e4360660be4e" />

5. **Exit**
      <img width="897" height="65" alt="image" src="https://github.com/user-attachments/assets/3a751cc1-b3a8-40c5-90e1-ac8ab8c29a4b" />
---


## Conclusion
This project demonstrates:
- Management of **state transitions** and dependencies between components.
- Use of **Command and State patterns** for decoupled, scalable design.
- Application of **SOLID principles**, logging, and exception handling for a robust, real-world simulation.

---
