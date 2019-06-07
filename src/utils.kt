

fun addScoreStringSupport(round: Pair<String, String>, addOnlyFirst: Boolean = false): Int =
    when {
        round.first == "X" -> 10
        round.second == "/" -> 10
        addOnlyFirst -> number(round.first)
        else -> number(round.first) + number(round.second)
    }

fun number(num: String): Int =
    when (num) {
        "-" -> 0
        else -> num.toInt()
    }
