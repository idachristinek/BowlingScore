
import kotlin.test.assertEquals
import org.junit.jupiter.api.Test as test

class TestSource2 {

    @test
    fun spareInMiddleString() {
        val round = listOf(
            Pair("5","2"),
            Pair("5","2"),
            Pair("5","2"),
            Pair("5","2"),
            Pair("5","2"),
            Pair("5","/"),
            Pair("5","2"),
            Pair("5","2"),
            Pair("5","2"),
            Pair("5","2")
        )
        assertEquals(78, scoreGameString(round))
    }

    @test
    fun regularString() {
        val round = listOf(
            Pair("5","2"),
            Pair("5","2"),
            Pair("5","2"),
            Pair("5","2"),
            Pair("5","2"),
            Pair("5","2"),
            Pair("5","2"),
            Pair("5","2"),
            Pair("5","2"),
            Pair("5","2")
        )
        assertEquals(70, scoreGameString(round))
    }

    @test
    fun allFailString() {
        val round = listOf(
            Pair("-","-"),
            Pair("-","-"),
            Pair("-","-"),
            Pair("-","-"),
            Pair("-","-"),
            Pair("-","-"),
            Pair("-","-"),
            Pair("-","-"),
            Pair("-","-"),
            Pair("-","-")
        )
        assertEquals(0, scoreGameString(round))
    }

    @test
    fun oneStrikeString() {
        val round = listOf(
            Pair("-","-"),
            Pair("-","-"),
            Pair("-","-"),
            Pair("-","-"),
            Pair("X","-"),
            Pair("-","-"),
            Pair("-","-"),
            Pair("-","-"),
            Pair("-","-"),
            Pair("-","-")
        )
        assertEquals(10, scoreGameString(round))
    }

    @test
    fun strikeString() {
        val round = listOf(
            Pair("X","-"),
            Pair("X","-"),
            Pair("X","-"),
            Pair("X","-"),
            Pair("X","-"),
            Pair("X","-"),
            Pair("X","-"),
            Pair("X","-"),
            Pair("X","-"),
            Pair("X","-"),
            Pair("X","-"),
            Pair("X","-")
        )

        assertEquals(300, scoreGameString(round))
    }

    @test
    fun spareInLastString() {
        val round = listOf(
            Pair("5","2"),
            Pair("5","2"),
            Pair("5","2"),
            Pair("5","2"),
            Pair("5","2"),
            Pair("5","2"),
            Pair("5","2"),
            Pair("5","2"),
            Pair("5","2"),
            Pair("5","/"),
            Pair("3","-")
        )

        assertEquals(76, scoreGameString(round))
    }


    @test
    fun regularStringFold() {
        val round = listOf(
            Pair("5","2"),
            Pair("5","2"),
            Pair("5","2"),
            Pair("5","2"),
            Pair("5","2"),
            Pair("5","2"),
            Pair("5","2"),
            Pair("5","2"),
            Pair("5","2"),
            Pair("5","2")
        )
        assertEquals(70, scoreWithFold(round))
    }

    @test
    fun spareStringFold() {
        val round = listOf(
            Pair("5","2"),
            Pair("5","2"),
            Pair("5","2"),
            Pair("5","2"),
            Pair("5","2"),
            Pair("5","2"),
            Pair("5","2"),
            Pair("5","2"),
            Pair("5","2"),
            Pair("5","/"),
            Pair("3","-")
        )
        assertEquals(76, scoreWithFold(round))
    }

}