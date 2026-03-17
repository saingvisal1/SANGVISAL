package day4

// ──────────────────────────────────────────────────────────────────────────────
// DomainModels.kt — Day 4: OOP — Classes, Interfaces & Inheritance
// ──────────────────────────────────────────────────────────────────────────────
// TODO: Complete the class bodies and add your own domain models below.
//
// REQUIREMENTS:
//   1. Complete the Student, Course, and Grade stubs (section A).
//   2. Add a sealed class GradeResult with at least 3 subclasses (section B).
//   3. Add a companion object to Student with a factory method (section C).
//   4. Model your own app domain using the same OOP concepts (section D).
//   5. Draw a Class Diagram in Excalidraw and export to docs/diagrams/
//
// COMMITS:
//   feat: complete Student Course Grade domain models
//   feat: add sealed class GradeResult
//   feat: add companion object factory to Student
//   feat: add [your app] domain models
//   docs: add class diagram to docs/diagrams
// ──────────────────────────────────────────────────────────────────────────────

// ── SECTION A: Complete these stubs ──────────────────────────────────────────

interface Describable {
    fun describe(): String  // TODO: implement in each class below
}

data class Student(
    val id: Int,
    val name: String,
    val email: String?,
    // TODO: add any other properties you think a Student needs
) : Describable {
    override fun describe(): String {
        TODO("Return a readable description using String templates")
    }
}

data class Course(
    val code: String,
    val title: String,
    val maxStudents: Int = 30,
    // TODO: add any other properties
) : Describable {
    override fun describe(): String {
        TODO("Return a readable description")
    }
}

data class Grade(
    val student: Student,
    val course: Course,
    val score: Double,          // 0.0 – 100.0
) : Describable {
    // TODO: add a computed property 'isPassing' (score >= 60)
    override fun describe(): String {
        TODO("Return: '<name> scored <score> in <course> — PASS/FAIL'")
    }
}

// ── SECTION B: Sealed class ───────────────────────────────────────────────────

// TODO: Define a sealed class GradeResult with subclasses:
//   - Distinction (score >= 85)
//   - Pass        (score >= 60)
//   - Fail        (score < 60)
// Each subclass should hold the score as a property.

// sealed class GradeResult { ... }

// TODO: Write a function that maps a Double score to a GradeResult
// fun evaluate(score: Double): GradeResult { ... }

// ── SECTION C: Companion object ───────────────────────────────────────────────

// TODO: Add a companion object inside Student with:
//   - A counter that tracks how many Student instances were created
//   - A factory function: Student.create(name, email) that auto-assigns IDs

// ── SECTION D: Your App Domain ───────────────────────────────────────────────

// TODO: Define 2–3 classes for your own app using OOP concepts learned today.
// Use: data class, sealed class, interface, companion object, inheritance.

// ── MAIN ─────────────────────────────────────────────────────────────────────

fun main() {
    // TODO: Create instances of Student, Course, Grade and call describe()
    // TODO: Test your sealed class with a when expression
    // TODO: Test your companion object factory
}
