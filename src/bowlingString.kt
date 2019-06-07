
fun scoreGameString(game: List<Pair<String, String>>): Int {

    var score = 0

    game.forEachIndexed { index, it ->
        when {
            it.first == "X" -> {
                score += addScoreStringSupport(it)

                if (index < game.size - 3) {
                    score += addScoreStringSupport(game[(index + 1)])
                    score += addScoreStringSupport(game[(index + 2)])
                }

            }
            it.second == "/" -> {
                score += addScoreStringSupport(it)
                if (index < game.size - 1) {
                    score += addScoreStringSupport(game[index + 1], true)
                }
            }

            index < 10 -> score += addScoreStringSupport(it)
        }
    }
    return score
}