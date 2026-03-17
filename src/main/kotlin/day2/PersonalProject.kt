package day2

// ──────────────────────────────────────────────────────────────────────────────
// PersonalProject.kt — Day 2: Apply Data Types to Your Domain
// ──────────────────────────────────────────────────────────────────────────────
//
// INSTRUCTIONS:
//   1. Think about your app idea (registered on Day 1).
//   2. Identify at least 3 entities / objects in your domain.
//      Examples:
//        - Music app   → Artist, Song, Playlist
//        - Food app    → Restaurant, MenuItem, Order
//        - Fitness app → Workout, Exercise, Set
//        - E-commerce  → Product, User, Cart
//
//   3. Define each entity as a data class using:
//        - val for immutable properties (prefer val over var)
//        - String? / Int? etc. for properties that CAN be null
//        - Meaningful default values where appropriate
//
//   4. Write a printInfo() function for each entity using String templates.
//      Use ?. and ?: to safely handle any nullable properties.
//
//   5. Call printInfo() from main() with at least one real example.
//
//   6. Commit with:
//        feat: add domain data classes for [your project name]
//
// ──────────────────────────────────────────────────────────────────────────────
// EXAMPLE (delete this before submitting your own work):
//
// data class Artist(
//     val id: Int,
//     val name: String,
//     val genre: String?,          // nullable: not all artists have a single genre
//     val monthlyListeners: Long
// )
//
// fun printArtistInfo(artist: Artist) {
//     val genre = artist.genre ?: "Various"
//     println("${artist.name} | Genre: $genre | Listeners: ${artist.monthlyListeners}")
// }
// ──────────────────────────────────────────────────────────────────────────────

// ✏️ YOUR CODE STARTS HERE

fun main() {
    // Call your printInfo() functions here
}
