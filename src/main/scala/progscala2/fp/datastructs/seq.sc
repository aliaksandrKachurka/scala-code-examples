val seq1 = Seq("Programming", "Scala")

val seq2 = "People" +: "should" +: "read" +: seq1

val seq3 = "Programming" +: "Scala" +: Seq.empty

val seq4 = seq2 ++ seq3

val seq5 = seq1 :+ "Rocks!"