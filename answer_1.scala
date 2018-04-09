def resolver(xs: List[Int]): Double = {
    val cleaned = xs.takeWhile(_ != -999).filter(_ >= 0)
    average(cleaned)
}

def average(xs: List[Int]): Double = {
    xs match {
        case Nil => Double.NaN
        case ys => 
            ys.sum / ys.length
    }
}


