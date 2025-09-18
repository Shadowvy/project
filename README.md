# 🎮 GuessMaster

A desktop Java Swing game that uses SQLite to store user accounts and high scores. Players can sign up, sign in, and play two game modes: **Alphabet** (guess letters) and **Number** (guess numbers) with three difficulty levels (Easy / Medium / Hard).

---

## 🚀 Features
- 🔐 User sign-up & sign-in (SQLite)
- 🕹️ Two modes: Alphabet & Number
- 🎚️ Difficulty levels: Easy, Medium, Hard
- 🏆 High score tracking and leaderboard
- 🎨 Built with Java Swing GUI

---

## 📂 Project Structure (src/guessinggame)
- `GuessingGame.java`        — Main entry point (launches Welcome)
- `Database.java`           — SQLite connection helper
- `Player.java`             — Player model + score management (reads/writes DB)
- `Dashboard.java`          — Main dashboard GUI
- `GameDashboard.java`      — Mode & difficulty selection
- `StartPlayingPage.java`   — Gameplay UI + logic
- `HighScore.java`          — Leaderboard UI
- `SignupPage.java`         — User registration UI + logic
- `SigninPage.java`         — User login UI + logic
- `DifficultyType.java`     — Abstract difficulty class
- `EasyLevel.java`          — Easy level logic
- `MediumLevel.java`        — Medium level logic
- `HardLevel.java`          — Hard level logic
- `GameMode.java`           — Abstract game mode
- `AlphaMode.java`          — Alphabet mode
- `NumberMode.java`         — Number mode
- `Welcome.java`            — Welcome screen

---

## ⚙️ Setup & Installation (local)
1. Clone the repo:
   ```bash
   git clone https://github.com/yourusername/GuessMaster.git
   cd GuessMaster
   ```

2. Open the project in your IDE (NetBeans / IntelliJ / Eclipse).

3. Run the main class:
   ```
   guessinggame.GuessingGame
   ```
4. That’s it ✅, the game will start from the Welcome screen.

---

## ▶️ How to run
- From your IDE: run the `GuessingGame` main class (it launches the Welcome screen).
- From command line (compiled `.class` files present):
  ```bash
  java -cp ".:path/to/sqlite-jdbc.jar" guessinggame.GuessingGame
  ```
  *(On Windows replace `:` with `;` in the classpath.)*

---

## 🤝 Contributing
- Feel free to open issues or PRs if you want to add features, fix bugs, or improve UI/UX.
- Suggestions: add unit tests, improve validation (password hashing), or add animations/graphics.

---

## 👨‍💻 Author
Muhammad Suayb — B.Sc Software Engineering
LinkedIn: https://www.linkedin.com/in/muhammedshoaib
