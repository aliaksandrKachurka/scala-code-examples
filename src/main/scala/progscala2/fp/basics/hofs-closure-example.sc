var factor = 2

val multiplier = (i: Int) => factor * i

(1 to 10) filter (_ % 2 == 0) map multiplier product

factor = 3

(1 to 10) filter (_ % 2 == 0) map multiplier product

