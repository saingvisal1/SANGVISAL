package day5

// ──────────────────────────────────────────────────────────────────────────────
// StudentList.kt — Day 5: Collections & Lambdas
// ──────────────────────────────────────────────────────────────────────────────
// TODO: Use functional-style collection operations to process the student list.
//
// REQUIREMENTS:
//   - Use map, filter, groupBy, sortedBy — NO manual for-loops for data processing
//   - Use at least one scope function: let, apply, run, also, or with
//   - All results must be printed using String templates
//
// COMMITS:
//   feat: implement collection operations on student list
//   feat: add collection logic for [your project name]
// ──────────────────────────────────────────────────────────────────────────────

data class Student(
    val id: Int,
    val name: String,
    val score: Double,
    val major: String
)

val students = listOf(
    Student(1,  "Alice",   92.5, "Engineering"),
    Student(2,  "Bob",     45.0, "Design"),
    Student(3,  "Charlie", 78.0, "Engineering"),
    Student(4,  "Diana",   88.5, "Business"),
    Student(5,  "Edward",  55.0, "Design"),
    Student(6,  "Fiona",   95.0, "Engineering"),
    Student(7,  "George",  30.0, "Business"),
    Student(8,  "Hannah",  72.0, "Design"),
    Student(9,  "Ivan",    61.5, "Business"),
    Student(10, "Julia",   83.0, "Engineering"),
)

// TODO 1: Get a list of all student names (use map)
fun getAllNames(): List<String> {
    TODO("Use map to extract names")
}

// TODO 2: Get students who passed (score >= 60) sorted by score descending
fun getPassingStudents(): List<Student> {
    TODO("Use filter + sortedByDescending")
}

// TODO 3: Group students by their major
fun groupByMajor(): Map<String, List<Student>> {
    TODO("Use groupBy")
}

// TODO 4: Get the average score per major (result: Map<String, Double>)
fun averageScorePerMajor(): Map<String, Double> {
    TODO("Use groupBy + mapValues + map + average")
}

// TODO 5: Get the top N students by score (default N = 3)
fun getTopStudents(n: Int = 3): List<Student> {
    TODO("Use sortedByDescending + take")
}

// TODO 6: Use a scope function (let / apply / also / run / with)
// Print a summary report using 'with(students) { ... }'
fun printSummaryReport() {
    TODO("Use 'with' scope function to print: total, passing count, top student name")
}

fun main() {
    println("=== All Names ===")
    println(getAllNames())

    println("\n=== Passing Students (sorted by score) ===")
    getPassingStudents().forEach { println("  ${it.name}: ${it.score}") }

    println("\n=== Grouped by Major ===")
    groupByMajor().forEach { (major, list) ->
        println("  $major: ${list.map { it.name }}")
    }

    println("\n=== Average Score per Major ===")
    averageScorePerMajor().forEach { (major, avg) ->
        println("  $major: ${"%.1f".format(avg)}")
    }

    println("\n=== Top 3 Students ===")
    getTopStudents().forEach { println("  ${it.name}: ${it.score}") }

    println("\n=== Summary Report ===")
    printSummaryReport()
}
