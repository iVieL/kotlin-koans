class DateRange(val start: MyDate, val end: MyDate) : Iterable<MyDate> {
    override fun iterator(): Iterator<MyDate> {
        return object : Iterator<MyDate> {
            var current: MyDate = start

            override fun next(): MyDate {
                if (!hasNext()) throw NoSuchElementException()
                val result = current
                current = current.followingDate()
                return result
            }

            override fun hasNext(): Boolean = current <= end
        }
    }
}
/*
class DateRange(val start: MyDate, val end: MyDate) : Iterable<MyDate> {
    override fun iterator(): Iterator<MyDate> {
        return MyDateIterator(start, end)
    }

    inner class MyDateIterator(val start: MyDate, val last: MyDate) : Iterator<MyDate> {
        var currentDate = start

        override fun hasNext(): Boolean {
            return currentDate <= last
        }

        override fun next(): MyDate {
            val date = currentDate
            currentDate = currentDate.followingDate()
            return date
        }
    }
}
*/

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}