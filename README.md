# Kelola Movie App

## Deskripsi
Aplikasi desktop sederhana berbasis Java Swing dengan konsep MVC (Model View Controller) untuk mengelola data movie menggunakan database MySQL.

Fitur utama:
- Tambah data movie
- Update data movie
- Hapus data movie
- Menampilkan data movie dalam tabel
- Perhitungan nilai rata-rata otomatis

Project ini dibuat menggunakan:
- Java Swing
- JDBC MySQL
- NetBeans
- MVC Pattern
- DAO Pattern

---

# Struktur Project

```bash
pengelolaanmovie
│
├── Connector
│   └── Connector.java
│
├── Controller
│   └── MovieController.java
│
├── DAO
│   ├── DataMovie.java
│
├── Model
│   └── ModelMovie.java
│
├── View
│   └── ViewKelola.java
│
└── Main.java
```

---

# Cara Menjalankan

## 1. Clone Repository

```bash
git clone https://github.com/FiernazIngga/latihanResponsiPBO.git
```

## 2. Buka Project

Buka project menggunakan:
- NetBeans
- IntelliJ IDEA
- VSCode Java

---

## 3. Setup Database MySQL

### Import Database
1. Buka phpMyAdmin atau MySQL
2. Import file database yang ada di repository

```sql
db_movie.sql
```
--- 

## 4. Setup JDBC MySQL

Tambahkan library:

```bash
mysql-connector-j
```

Jika menggunakan NetBeans:

```text
Klik kanan project
→ Properties
→ Libraries
→ Add JAR/Folder
```

---

## 5. Atur Koneksi Database

Edit file:

```java
Connector.java
```

Sesuaikan:

```java
String url = "jdbc:mysql://localhost/movie_db";
String user = "root";
String pass = "";
```

---

# Konsep MVC

## Model

Berisi struktur data movie.

```java
ModelMovie.java
```

---

## View

Berisi tampilan GUI Swing.

```java
ViewKelola.java
```

---

## Controller

Mengatur logika program dan penghubung View dengan DAO.

```java
MovieController.java
```

---

## DAO

Berfungsi untuk akses database.

```java
DataMovieDAO.java
```

DAO menangani:
- INSERT
- SELECT
- UPDATE
- DELETE

---

# Fitur Validasi

Input:
- Alur
- Penokohan
- Akting

hanya boleh bernilai:

```text
0 - 5
```

# Author

GitHub:
https://github.com/FiernazIngga
