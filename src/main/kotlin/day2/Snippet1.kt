package day2

// ──────────────────────────────────────────────────────────────────────────────
// Snippet 1 — Database lookup returns nullable
// ──────────────────────────────────────────────────────────────────────────────
// TODO: Fix all null safety issues.
//       Rules:
//         - Use ?. and ?: only — do NOT use !!
//         - If the user is not found, print a friendly message instead of crashing
//         - One fix = one commit: fix: resolve NPE in findUserById null return

fun findUserById(id: Int): String? {
    val db = mapOf(1 to "Alice", 2 to "Bob")
    return db[id] // Returns String? — may be null for unknown IDs
}

fun main() {
    val userName = findUserById(99)
    println(userName.uppercase()) // 💥 CRASH: userName is null
}
