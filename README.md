# 🧠 Typing Speed Game (Console-Based Java)

This is a **console-based typing speed game** built in Java. The game challenges users to type randomly displayed sentences as fast and accurately as possible. It calculates typing speed in Words Per Minute (WPM) and also gives a character-level accuracy score.

## 🚀 Features

- ✅ Randomly displays a sentence to type
- ⌛ Calculates time taken to type
- 🧮 Computes Words Per Minute (WPM)
- 🎯 Calculates accuracy based on correct characters
- 🗃️ Saves typing results (time, WPM, accuracy, date) to a history file
- 📜 Shows typing history on next run

## 🛠️ Technologies Used

- Java 8+
- Console I/O
- Java File I/O (`BufferedWriter`, `BufferedReader`)
- `System.currentTimeMillis()` for time tracking

## 📂 How to Run

1. Make sure you have Java installed.
2. Clone the repository or copy the code.
3. Compile and run:

📸 Example Output

🧠 Typing Speed Test
Type the sentence below as fast and accurately as you can:

👉 "Typing fast is a skill that improves with practice"

Press Enter to start...

Start typing: Typing fast is a skill that improves with practice

⏱️ Time Taken: 8.21 seconds
📈 Words Per Minute (WPM): 43.83
🎯 Accuracy: 100.00%

🎉 Result saved!

📜 Typing History
On each run, your results are saved to a file called typing_history.txt. Example:

2025-07-25 10:34:12 | Time: 8.21s | WPM: 43.83 | Accuracy: 100.00%

💡 Future Improvements
Add leaderboard from history

Visual interface with JavaFX or Swing

Include difficulty levels (easy/medium/hard)

Sentence categories (e.g. quotes, technical, casual)
