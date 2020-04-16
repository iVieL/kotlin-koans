data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate) = when {
        year != other.year -> year - other.year
        month != other.month -> month - other.month
        else -> dayOfMonth - other.dayOfMonth
    }
/*
    override operator fun compareTo(date: MyDate): Int {
        val _this = year*10000+month*100+dayOfMonth
        val other = date.year*10000+date.month*100+date.dayOfMonth
        val diff = _this - other
        return diff
    }
*/
}


fun test(date1: MyDate, date2: MyDate) {
    // this code should compile:
    println(date1 < date2)
}
