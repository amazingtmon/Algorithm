import kotlin.math.max

class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        strs.sort()

        val firstWord = strs[0]
        val lastWord = strs.last()

        var prefix = ""

        for (i in 0 until max(firstWord.length, lastWord.length)) {
            if (i > firstWord.length - 1) break
            if (i > lastWord.length - 1) break
            if (firstWord[i] != lastWord[i]) break

            prefix += "${firstWord[i]}"
        }
        return prefix
    }
}
