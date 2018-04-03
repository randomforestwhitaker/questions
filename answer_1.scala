import scala.collection.mutable.ListBuffer

val listOfInts1 = List(4,3,-9, -999, 32, 75)
val listOfInts2 = List(-10, 0, 999, 3, 179, 2, 1)

/*
def resolver(xs: List[Int]): Double = {
    xs match {
        case Nil => Double.NaN
        case xs.contains(-999) => 
            // apply average function to ints that pass isNonNegative 
            // condition and left of -999 condition 
            loop 
        case xs => 
            // apply average function to ints that pass isNonNegative condition
            xs.avera
    }
}
*/

// TODO: 
// [2] so many vars :(
def resolver(xs: List[Int]): Double = {
    xs match {
        case Nil => Double.NaN 
        case xs =>
            var inc = 0
            var index = xs.length
            var accum = new ListBuffer[Int]()
            var x = 0
            for (x <- xs if (x != -999 && isNonNegative(x) && inc <= index)) {
                accum += x 
                inc += 1
            }
            average(accum) 
        }
}

def isNonNegative(x: Int): Boolean = {
    x >= 0
}

def average(xs: ListBuffer[Int]): Double = {
    xs.sum / xs.length
}


