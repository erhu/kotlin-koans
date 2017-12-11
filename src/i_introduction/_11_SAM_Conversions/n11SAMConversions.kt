package i_introduction._11_SAM_Conversions

fun task11(): List<Int> {
    return arrayListOf(1, 5, 2).sortedWith(kotlin.Comparator { x, y -> y - x })
}
