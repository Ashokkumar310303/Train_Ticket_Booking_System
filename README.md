project:
  name: "🚂 Train Ticket Booking System"
  description: |
    📚 This is a console-based Java application that simulates a Train Ticket Booking System.
    🎟️ It manages seat allocation with:
      - ✅ Confirmed bookings (Upper, Middle, Lower berths)
      - 🪑 RAC (Reservation Against Cancellation) queue
      - ⏳ Waiting list
    🔁 It also handles cancellations and automatically promotes passengers from RAC → Confirmed and Waiting → RAC.

features:
  - ✍️ Book tickets with Passenger name, age, berth preference (U/M/L) and automatic seat & berth assignment
  - 🗃️ Maintain Confirmed list, RAC queue, Waiting list queue
  - ❌ Cancel tickets and automatically move RAC to Confirmed, Waiting to RAC
  - 📋 Print all passenger details: Confirmed with seat & berth, RAC, Waiting list

technologies:
  - ☕ Java (OOP: classes, inheritance, encapsulation)
  - 📚 Java Collections: ArrayList, LinkedList, Queue, Map

how_to_run:
  🐙 Clone the repository: |
    git clone https://github.com/your-username/your-repo.git
    cd your-repo
  ⚙️ Compile the Java files: |
    javac -d . src/com/practice/TrainTicketBooking/*.java
  🚀 Run the program: |
    java com.practice.TrainTicketBooking.Main

project_structure:
  - 📂 com/
  - └── practice/
  -     └── TrainTicketBooking/
  -          ├── Main.java
  -          ├── Passenger.java
  -          ├── TrainTicketBookingSystem.java
  -          ├── Booking.java
  -          ├── Canceling.java
  -          ├── PassengerDetails.java
  -          ├── PrintPassengerDetails.java

example_output: |
  🟢 Booking Conformed with preference
  🟡 Booking was added to RAC
  🟠 Booking was added to waiting List
  🔴 Sorry no booking available
  🔴 Sorry no booking available
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

future_improvements:
  - ⌨️ Add user input (Scanner) to book/cancel dynamically
  - 💾 Persist data to a file or database
  - 📈 Add berth type counts dynamically (more than 1)
  - 🖥️ Improve display with tabular format

author:
  name: "🧑‍💻 Ashok Kumar"

license: "📝 MIT License"
