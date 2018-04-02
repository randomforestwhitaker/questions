val example_list1 = List(4,3,-9, -999, 32, 75)
val example_list2 = List(-10, 0, 999, 3, 179, 2, 1)

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
    x match {
        case a if x >= 0 => true
        case b if x < 0 => false
    }
}


// TODO: resolve type mismatch on first case (Nil vs expected Int)
def sum(xs: List[Int]): Int = {
    xs match {
        case xs.isEmpty => Nil
        case x :: tail => x + sum(tail)
    }
}

//TODO: resolve sum helper function so average function can be tested
def average(ls: List[Int]): Double = {
    sum(ls) / ls.length
}

