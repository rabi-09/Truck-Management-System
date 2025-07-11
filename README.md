<h1 align="center">🚛 Truck Management System</h1>

<p align="center">
  <em>A simple Java project demonstrating CRUD operations with MySQL — built for learning purposes.</em>
</p>

---


## 📌 Overview

The **Truck Management System** is a console-based Java application that performs basic CRUD operations and connects to a MySQL database using JDBC. This project was created as a learning exercise to understand core backend concepts.


---


## 🚀 Features

✅ Simple and clean Java code structure  
✅ Basic CRUD operations:  
- ➕ Create new truck records  
- 📄 Read/display all trucks  
- 🖊️ Update truck information  
- ❌ Delete truck entries  

✅ MySQL database connection using JDBC  
✅ Built and managed with Maven  
✅ Designed and developed in IntelliJ IDEA


---


## 🧰 Tech Stack

| Technology | Description               |
|------------|---------------------------|
| ☕ Java     | Core programming language |
| 🔌 JDBC     | Java Database Connectivity|
| 🐬 MySQL    | Relational database       |
| 🛠️ Maven   | Dependency & build tool   |
| 🧠 IntelliJ | Development IDE           |


---


## 🗃️ Project Structure

```plaintext
Truck-Management-System/
│
├── src/                     # Source code
│   └── main/java/           # Java classes
│
├── pom.xml                  # Maven project file
├── .gitignore               # Git ignore rules
└── README.md                # Project documentation
```


---


## 💾 Database Setup

1. Open MySQL and create a new database:
   ```sql
   CREATE DATABASE truck_management;
   ```
2. Create a new Table:
  ```sql
    create table truck (
    	id int primary key auto_increment,
        company varchar(30),
        model varchar(30),
        capacity int,
        driver_name varchar(30)
    );
  ```
3. Update the DB connection URL, username, and password in code


---


## 🚀 How to Run

1. **Clone the repository**
   ```bash
   git clone https://github.com/rabi-09/Truck-Management-System.git
   cd Truck-Management-System


---


## 📝 Notes

- 📘 This project was created **purely for educational purposes**.
- 🛠️ It demonstrates the integration of **Java, JDBC, Maven, and MySQL**.
- 🧪 You are encouraged to **modify, explore, and enhance** it as part of your learning journey.
- 💡 Suitable for beginners learning basic **backend programming** and **database connectivity**.


---


## 👨‍💻 Author

👤 **Rabi Narayan Das**  
- 🔗 GitHub Profile: [github.com/rabi-09](https://github.com/rabi-09)
- 🔗 Linkedin Profile: [linkedin.com/rabinarayandas](https://www.linkedin.com/in/rabinarayandas/)

---
