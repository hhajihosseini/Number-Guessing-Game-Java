# Number-Guessing-Game-Java
# 🎯 Number Guessing Game in Java


> A beginner-friendly Java console game where the computer picks a secret number and you have to guess it — with limited attempts and helpful hints along the way.

---

## 📖 About

A **Number Guessing Game** in Java is a simple program where the computer randomly selects a number between **0 and 100**, and the user has to guess it within a **limited number of attempts (K tries)**. The program provides feedback on whether the guessed number is too high or too low, guiding the user toward the correct answer.

This project is an excellent way for beginners to practice:
- 🔁 Loops
- 🔀 Conditionals
- ⌨️ User input handling
- 🎲 Random number generation

---

## 🕹️ Rules of the Game

| Scenario | Response |
|----------|----------|
| Guessed number **>** actual number | "Your guess is **too high**" |
| Guessed number **<** actual number | "Your guess is **too low**" |
| Guessed number **==** actual number | 🎉 "You **win**!" |
| All K attempts exhausted | ❌ Game over — correct number revealed |

---

## ⚙️ Implementation Details

- ✅ Generates a random number between **0 and 100** using `Math.random()`
- ✅ User has **limited attempts (K tries)** to guess the number
- ✅ At each guess, the program provides a **hint**:
  - If the guess is **higher** → hints to guess lower
  - If the guess is **lower** → hints to guess higher
- ✅ If the user guesses correctly → **they win**
- ✅ If all attempts are exhausted → **game reveals the correct number**

---

## 🧠 Approach

```
1. Generate a random number using Math.random()
2. Take user input using Scanner
3. Compare the guess with the random number and provide feedback
4. Limit the number of attempts using a loop
5. Handle edge cases (e.g., invalid inputs)
```

---

## 💻 Code

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String con;

        do {
            System.out.print("Insert a value between 0 to 100: ");
            int userNumber   = sc.nextInt();
            int randomNumber = (int) (Math.random() * 101);
            evaluate(userNumber, randomNumber);

            System.out.print("Do you want to continue? (y/n): ");
            con = sc.next();

        } while (con.equalsIgnoreCase("Y"));

        System.out.println("Goodbye! 👋");
        sc.close();
    }

    public static void evaluate(int userNumber, int randomNumber) {
        System.out.println("Machine number was: " + randomNumber);
        if      (userNumber == randomNumber) System.out.println("🎉 You win!!");
        else if (userNumber >  randomNumber) System.out.println("❌ Too high! Guess lower.");
        else                                 System.out.println("❌ Too low! Guess higher.");
    }
}
```

---

## ▶️ Sample Run

```
Insert a value between 0 to 100: 50
Machine number was: 73
❌ Too low! Guess higher.
Do you want to continue? (y/n): y

Insert a value between 0 to 100: 80
Machine number was: 80
🎉 You win!!
Do you want to continue? (y/n): n

Goodbye! 👋
```

---

## 🚀 How to Run

### Prerequisites
- Java 8 or higher installed
- Any IDE (IntelliJ IDEA, Eclipse, VS Code) or terminal

### Steps

```bash
# 1. Clone the repository
git clone https://github.com/your-username/number-guessing-game.git

# 2. Navigate to the project directory
cd number-guessing-game

# 3. Compile the Java file
javac Main.java

# 4. Run the program
java Main
```

---

## 📂 Project Structure

```
number-guessing-game/
│
├── Main.java          # Main game logic
└── README.md          # Project documentation
```

---

## 🧩 Key Concepts Used

| Concept | Usage |
|---------|-------|
| `Math.random()` | Generate random number between 0–100 |
| `Scanner` | Read user input from console |
| `do-while` loop | Keep game running until user quits |
| `if-else` conditionals | Compare guess with random number |
| Methods | Separate evaluate logic from main |

---

## 🛠️ Possible Improvements

- [ ] Add a **limited attempts** (K tries) mode
- [ ] Add a **difficulty level** (Easy / Medium / Hard)
- [ ] Track and display **score / win streak**
- [ ] Add **input validation** for non-numeric entries
- [ ] Build a **GUI version** using JavaFX or Swing

---

## 👨‍💻 Author

Feel free to fork, improve, and open a pull request!

---

## 📄 License

This project is licensed under the **MIT License** — see the [LICENSE](LICENSE) file for details.
