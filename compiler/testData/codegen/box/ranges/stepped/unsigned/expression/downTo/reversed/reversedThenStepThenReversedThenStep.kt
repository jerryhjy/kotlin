// Auto-generated by GenerateSteppedRangesCodegenTestData. Do not edit!
// IGNORE_BACKEND: JVM_IR
// IGNORE_BACKEND_FIR: JVM_IR
// KJS_WITH_FULL_RUNTIME
// WITH_RUNTIME
import kotlin.test.*

fun box(): String {
    val uintList = mutableListOf<UInt>()
    val uintProgression = 10u downTo 1u
    for (i in (uintProgression.reversed() step 2).reversed() step 3) {
        uintList += i
    }
    assertEquals(listOf(9u, 6u, 3u), uintList)

    val ulongList = mutableListOf<ULong>()
    val ulongProgression = 10uL downTo 1uL
    for (i in (ulongProgression.reversed() step 2L).reversed() step 3L) {
        ulongList += i
    }
    assertEquals(listOf(9uL, 6uL, 3uL), ulongList)

    return "OK"
}