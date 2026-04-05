// Advice.kt
data class AdviceResponse(val slip: Slip)
data class Slip(val advice: String)

// RMCharacter.kt
data class RMCharacter(val name: String, val species: String)