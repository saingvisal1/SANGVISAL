package day2

// ──────────────────────────────────────────────────────────────────────────────
// Snippet 5 — Mixed null safety anti-patterns (hardest)
// ──────────────────────────────────────────────────────────────────────────────
// TODO: Rewrite using Kotlin idioms.
//       Rules:
//         - Remove ALL !! usages — replace with ?. and ?:
//         - Use String templates instead of + concatenation
//         - If name is missing, use "Unknown product"
//         - If price is missing, use 0.0
//         - One fix = one commit: fix: resolve NPE in formatProduct anti-patterns

data class Product(val name: String?, val price: Double?)

fun formatProduct(product: Product?): String {
    val name = product!!.name!!       // 💥 !! used twice
    val price = product!!.price!!     // 💥 !! used twice
    return "$name costs $" + price.toString() // unsafe + concatenation
}

fun main() {
    val p1 = Product("Laptop", 999.0)
    val p2 = Product(null, null)
    val p3: Product? = null

    println(formatProduct(p1))
    println(formatProduct(p2))
    println(formatProduct(p3))
}
