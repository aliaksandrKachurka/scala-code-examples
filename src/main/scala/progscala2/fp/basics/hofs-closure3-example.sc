object Multiplier {
  var factor = 2

  // Compare: val multiplier = (i: Int) => factor * i
  def multiplier(i: Int) = i * factor
}

(1 to 10) filter (_ % 2 == 0) map Multiplier.multiplier product

Multiplier.factor = 3

(1 to 10) filter (_ % 2 == 0) map Multiplier.multiplier product

