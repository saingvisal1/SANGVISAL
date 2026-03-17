package day3

// ──────────────────────────────────────────────────────────────────────────────
// NumberGame.kt — Day 3: Control Flow & Functions
// ──────────────────────────────────────────────────────────────────────────────
// TODO: Implement a number guessing game using what you learned today.
//
// REQUIREMENTS:
//   1. The app picks a random number between 1 and 100 (already done below).
//   2. The player has a maximum of MAX_ATTEMPTS guesses.
//   3. After each guess, print one of:
//        - "Too low! Try again."
//        - "Too high! Try again."
//        - "🎉 Correct! You guessed it in X attempt(s)!"
//   4. If the player runs out of attempts, print:
//        - "💀 Game over! The number was $secret."
//   5. Use a loop (while or for) + when expression (no if-else chains).
//   6. Extract the feedback logic into a separate function: getHint()
//
// FUNCTIONS TO IMPLEMENT:
//   - getHint(guess: Int, secret: Int): String
//   - playGame(secret: Int)
//
// COMMIT: feat: implement number guessing game
// ──────────────────────────────────────────────────────────────────────────────

const val MAX_ATTEMPTS = 7

// TODO: Implement this function.
// Return "TOO_LOW", "TOO_HIGH", or "CORRECT" using a when expression.
fun getHint(guess: Int, secret: Int): String {
    TODO("Implement using a when expression")
}

// TODO: Implement this function.
// Use a loop that runs up to MAX_ATTEMPTS times.
// Read player input with: val input = readLine()?.trim()?.toIntOrNull()
// Handle invalid input gracefully (non-number input should not count as an attempt).
fun playGame(secret: Int) {
    TODO("Implement the game loop here")
}

fun main() {
    val secret = (1..100).random()
    println("🎮 Welcome to the Number Guessing Game!")
    println("I picked a number between 1 and 100. You have $MAX_ATTEMPTS attempts.")
    playGame(secret)
}
