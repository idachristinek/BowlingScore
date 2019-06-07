
import kotlin.test.assertEquals
import org.junit.jupiter.api.Test as test

class TestSource {
    @test
    fun allStrikes() {
        val round = listOf(
            Pair(10,0),
            Pair(10,0),
            Pair(10,0),
            Pair(10,0),
            Pair(10,0),
            Pair(10,0),
            Pair(10,0),
            Pair(10,0),
            Pair(10,0),
            Pair(10,0),
            Pair(10,0),
            Pair(10,0)
        )
        assertEquals(300, scoreGame(round))
    }
    @test
    fun allRegularRound() {
        val round = listOf(
            Pair(5,2),
            Pair(5,2),
            Pair(5,2),
            Pair(5,2),
            Pair(5,2),
            Pair(5,2),
            Pair(5,2),
            Pair(5,2),
            Pair(5,2),
            Pair(5,2)
        )

        assertEquals(70, scoreGame(round))
    }
    @test
    fun spareInLast() {
        val round = listOf(
            Pair(5,2),
            Pair(5,2),
            Pair(5,2),
            Pair(5,2),
            Pair(5,2),
            Pair(5,2),
            Pair(5,2),
            Pair(5,2),
            Pair(5,2),
            Pair(5,5),
            Pair(3,3)
        )

        assertEquals(76, scoreGame(round))
    }
    @test
    fun spareInMiddle() {
        val round = listOf(
            Pair(5,2),
            Pair(5,2),
            Pair(5,2),
            Pair(5,2),
            Pair(5,2),
            Pair(5,5),
            Pair(5,2),
            Pair(5,2),
            Pair(5,2),
            Pair(5,2)
        )

        assertEquals(78, scoreGame(round))
    }
}