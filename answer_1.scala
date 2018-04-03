val listOfInts1 = List(4,3,-9, -999, 32, 75)
val listOfInts2 = List(-10, 0, 999, 3, 179, 2, 1)

def resolver(example_list: List[Int]): Double = {
    example_list match {
        case Nil => Nil
        case example_list.contains(-999) => 
            /* apply average function to ints that pass isNonNegative 
            condition and left of -999 condition */
        case example_list => 
            // apply average function to ints that pass isNonNegative condition
    }
}

def isNonNegative(x: Int): Boolean = {
    x >= 0
}

def average(xs: List[Int]): Double = {
    xs.sum / xs.length
}

