package day2

// ──────────────────────────────────────────────────────────────────────────────
// Snippet 4 — List element access may be null
// ──────────────────────────────────────────────────────────────────────────────
// TODO: Handle the case where the list may be empty or contain nulls.
//       Rules:
//         - Use ?. and ?: only — do NOT use !!
//         - If no admin is found, return "No admin found"
//         - One fix = one commit: fix: resolve NPE in getFirstAdmin list access

fun getFirstAdmin(users: List<String?>): String {
    val first = users.firstOrNull { it?.startsWith("admin_") == true }
    return first.uppercase() // 💥 CRASH: first is String? not String
}

fun main() {
    val users = listOf("alice", null, "admin_bob", "charlie")
    println(getFirstAdmin(users))

    val noAdmins = listOf("alice", "bob")
    println(getFirstAdmin(noAdmins))
}
