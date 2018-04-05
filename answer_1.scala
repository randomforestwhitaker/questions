def resolver(xs: List[Int]): Double = {
    val cleaned = xs.takeWhile(_ != -999).takeWhile(_ >= 0)
    average(cleaned)
}

def average(xs: List[Int]): Double = {
    xs match {
        case Nil => Double.NaN
        case xs => 
            xs.sum / xs.length
    }
}


