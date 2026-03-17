package day2

// ──────────────────────────────────────────────────────────────────────────────
// Snippet 3 — Chained property access on nested nullables
// ──────────────────────────────────────────────────────────────────────────────
// TODO: Fix without using !! anywhere.
//       Rules:
//         - Chain ?. across all nullable properties
//         - If horsepower is unavailable, return "HP: N/A"
//         - One fix = one commit: fix: resolve NPE in getHorsepower chained access

data class Engine(val horsepower: Int)
data class Car(val engine: Engine?)
data class Garage(val primaryCar: Car?)

fun getHorsepower(garage: Garage?): String {
    return "HP: " + garage.primaryCar.engine.horsepower // 💥 Multiple NPE risks
}

fun main() {
    val emptyGarage = Garage(primaryCar = null)
    println(getHorsepower(emptyGarage))
    println(getHorsepower(null))
}
