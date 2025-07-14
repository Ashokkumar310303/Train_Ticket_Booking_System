# 🚂 Train Ticket Booking System

## 📚 Overview

This is a **console-based Java application** that simulates a Train Ticket Booking System.

🎟️ It handles seat allocation with:
- ✅ Confirmed bookings (Upper, Middle, Lower berths)
- 🪑 RAC (Reservation Against Cancellation) queue
- ⏳ Waiting list

🔁 It also processes cancellations and **automatically promotes**:
- RAC → Confirmed  
- Waiting → RAC

---

## ✨ Features

- ✍️ Book tickets with passenger name, age, and berth preference (U/M/L)
- 🗃️ Manage separate lists for Confirmed, RAC, and Waiting
- ❌ Cancel tickets and automatically promote passengers in queue
- 📋 Print passenger details with berth, seat number, and ID

---

## 🛠 Technologies Used

- ☕ Java (OOP: classes, inheritance, encapsulation)
- 📚 Java Collections:
  - `ArrayList`
  - `LinkedList`
  - `Queue`
  - `HashMap`

---

## 🚀 How to Run

### 🐙 Clone the repository
```bash
git clone https://github.com/your-username/your-repo.git
cd your-repo

⚙️ Compile the Java files
javac -d . src/com/practice/TrainTicketBooking/*.java

🚀 Run the program
java com.practice.TrainTicketBooking.Main

📂 Project Structure
com/
└── practice/
    └── TrainTicketBooking/
        ├── Main.java
        ├── Passenger.java
        ├── TrainTicketBookingSystem.java
        ├── Booking.java
        ├── Canceling.java
        ├── PassengerDetails.java
        ├── PrintPassengerDetails.java
📈 Example Output
Booking Conformed with preference
Booking was added to RAC
Booking was added to waiting List
Sorry no booking available
Sorry no booking available
------------------------------------------
🆔 Passenger Id:1
👤 Passenger Name:Ashok
🎂 Passenger Age:11
🪑 Passenger Seat No:1
🛏️ Passenger Allocated Berth:U
------------------------------------------
🆔 Passenger Id:2
👤 Passenger Name:Raja
🎂 Passenger Age:11
🪑 Passenger Seat No:0
🛏️ Passenger Allocated Berth:
------------------------------------------
🆔 Passenger Id:3
👤 Passenger Name:Arjun
🎂 Passenger Age:11
🪑 Passenger Seat No:0
🛏️ Passenger Allocated Berth:
------------❌ removed
------------------------------------------
🆔 Passenger Id:2
👤 Passenger Name:Raja
🎂 Passenger Age:11
🪑 Passenger Seat No:1
🛏️ Passenger Allocated Berth:U
------------------------------------------
🆔 Passenger Id:3
👤 Passenger Name:Arjun
🎂 Passenger Age:11
🪑 Passenger Seat No:0
🛏️ Passenger Allocated Berth:

🧠 Future Improvements
⌨️ Add dynamic input via Scanner

💾 Store data persistently in a file or database

📈 Make berth count dynamic (instead of fixed 1)

🖥️ Use tabular formatting for better display

🧑‍💻 Author
Developed by Ashok Kumar 👨‍💻

📝 License
This project is licensed under the MIT License.


🙌 Contributions Welcome!
Found a bug? Have an idea to improve this project?
Feel free to:

📂 Fork this repo

✅ Submit a pull request

⭐ Star the project if you like it
