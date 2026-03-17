package day2

// ──────────────────────────────────────────────────────────────────────────────
// Snippet 2 — Config value parsed from environment
// ──────────────────────────────────────────────────────────────────────────────
// TODO: Fix the crash when PORT is not set in environment.
//       Rules:
//         - Use ?. and ?: only — do NOT use !!
//         - Default port should be 8080 when PORT env variable is missing
//         - Use toIntOrNull() instead of toInt()
//         - One fix = one commit: fix: resolve NPE in getServerPort env variable

fun getServerPort(): Int {
    val portStr: String? = System.getenv("PORT")
    return portStr.toInt() // 💥 CRASH: portStr is null when PORT is not set
}

fun main() {
    println("Server running on port: ${getServerPort()}")
}
