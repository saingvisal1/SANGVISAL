package day6

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

// ──────────────────────────────────────────────────────────────────────────────
// GradeManager.kt — Day 6: Mini Project 1 ⭐
// Student Grade Manager
// ──────────────────────────────────────────────────────────────────────────────
// Build a complete command-line Grade Manager app.
//
// REQUIREMENTS:
//   1. The app runs in a loop showing a menu until the user quits.
//   2. The user can: add a student, add a grade, view all students,
//      view grades for a student, and see class statistics.
//   3. Use coroutines: wrap at least one operation in a suspend function
//      and call it with runBlocking { }.
//   4. Use data classes and sealed classes from Day 4.
//   5. Use collection operators from Day 5 (no manual for-loops for stats).
//
// MENU (implement all options):
//   [1] Add student
//   [2] Add grade for a student
//   [3] View all students
//   [4] View grades for a student
//   [5] Show class statistics
//   [0] Quit
//
// COROUTINE REQUIREMENT:
//   Simulate saving with a suspend fun saveData() that uses delay(500)
//   and prints "💾 Saving..." before returning. Call it with runBlocking { }.
//
// DELIVERABLES:
//   ✅ GradeManager.kt — complete, runnable program
//   ✅ docs/diagrams/day6-flowchart.png + source (.excalidraw)
//   ✅ docs/diagrams/day6-class-diagram.png + source (.excalidraw)
//
// COMMITS:
//   feat: implement grade manager menu and data model
//   feat: implement add student and add grade features
//   feat: implement view students and statistics
//   feat: add coroutine saveData with runBlocking
//   docs: add flowchart and class diagram
// ──────────────────────────────────────────────────────────────────────────────

// ── DATA MODEL ────────────────────────────────────────────────────────────────

data class Student(val id: Int, val name: String)

data class Grade(val studentId: Int, val subject: String, val score: Double)

sealed class GradeResult {
    data class Distinction(val score: Double) : GradeResult()
    data class Pass(val score: Double)        : GradeResult()
    data class Fail(val score: Double)        : GradeResult()
}

fun evaluate(score: Double): GradeResult = when {
    score >= 85 -> GradeResult.Distinction(score)
    score >= 60 -> GradeResult.Pass(score)
    else        -> GradeResult.Fail(score)
}

// ── IN-MEMORY STORAGE ─────────────────────────────────────────────────────────

val students = mutableListOf<Student>()
val grades   = mutableListOf<Grade>()
var nextId   = 1

// ── COROUTINE: Simulate saving ────────────────────────────────────────────────

suspend fun saveData() {
    TODO("Print '💾 Saving...', delay 500ms, then print '✅ Saved!'")
}

// ── FEATURES ──────────────────────────────────────────────────────────────────

fun addStudent() {
    TODO("Read name from input, create Student, add to list, call runBlocking { saveData() }")
}

fun addGrade() {
    TODO(
        "Show list of students, read studentId + subject + score, " +
        "validate score is 0–100, add Grade, call runBlocking { saveData() }"
    )
}

fun viewAllStudents() {
    TODO("Print all students with their average score. If none, print a friendly message.")
}

fun viewStudentGrades() {
    TODO("Ask for student ID, print all grades for that student + their GradeResult label")
}

fun showStatistics() {
    TODO(
        "Use collection operators (no for-loops) to print:\n" +
        "  - Total students\n" +
        "  - Class average score\n" +
        "  - Top student\n" +
        "  - Count of Distinction / Pass / Fail"
    )
}

// ── MENU ─────────────────────────────────────────────────────────────────────

fun showMenu() {
    println("""
        ╔══════════════════════════╗
        ║    📚 Grade Manager      ║
        ╠══════════════════════════╣
        ║ [1] Add student          ║
        ║ [2] Add grade            ║
        ║ [3] View all students    ║
        ║ [4] View student grades  ║
        ║ [5] Show statistics      ║
        ║ [0] Quit                 ║
        ╚══════════════════════════╝
    """.trimIndent())
    print("Choose: ")
}

fun main() {
    println("🎓 Welcome to Grade Manager!")
    var running = true
    while (running) {
        showMenu()
        when (readLine()?.trim()) {
            "1"  -> addStudent()
            "2"  -> addGrade()
            "3"  -> viewAllStudents()
            "4"  -> viewStudentGrades()
            "5"  -> showStatistics()
            "0"  -> { println("👋 Goodbye!"); running = false }
            else -> println("❌ Invalid option. Please try again.")
        }
        println()
    }
}
