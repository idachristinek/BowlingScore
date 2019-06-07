fun scoreGame(game: List<Pair<Int, Int>>): Int {

    var score = 0

    game.forEachIndexed { index, it ->
        when {
            it.first == 10 -> {
                score += addScore(it)

                if (index < game.size - 3) {
                    score += addScore(game[(index + 1)])
                    score += addScore(game[(index + 2)])
                }

            }
            it.first + it.second == 10 -> {
                score += addScore(it)
                if (index < game.size - 1) {
                    score += addScore(game[index + 1], true)
                }
            }

            index < 10 -> score += addScore(it)
        }
    }
    return score
}


fun addScore(round: Pair<Int, Int>, addOnlyFirst: Boolean = false): Int =
    when {
        round.first == 10 -> 10
        addOnlyFirst -> round.first
        else -> round.first + round.second
    }