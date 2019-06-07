

fun scoreWithFold(game: List<Pair<String, String>>): Int =
    game.foldIndexed(0) { index, score, it ->
        when {
            it.first == "X" ->
                score + addStrike(game, index, it)

            it.second == "/" ->
                score + addSpare(game, index, it)

            index < 10 ->
                score + addScoreStringSupport(it)

            else -> score
        }
    }


fun addStrike(game: List<Pair<String, String>>, index: Int, element: Pair<String, String>): Int =
    when {
        index < game.size - 3 && game[index + 1].first == "X" ->
            addScoreStringSupport(element) +
                    addScoreStringSupport(game[(index + 1)]) +
                    addScoreStringSupport(game[(index + 2)])

        index < game.size - 2 && game[index + 1].first != "X"->
            addScoreStringSupport(element) +
                    addScoreStringSupport(game[(index + 1)])

        else -> addScoreStringSupport(element)
    }


fun addSpare(game: List<Pair<String, String>>, index: Int, element: Pair<String, String>): Int =
    when {
        index < game.size - 1 ->
            addScoreStringSupport(element) +
                    addScoreStringSupport(game[index + 1], true)

        else -> addScoreStringSupport(element)
    }