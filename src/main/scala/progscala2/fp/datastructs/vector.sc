val vec1 = Vector("Programming", "Scala")

val vec2 = "People" +: "should" +: "read" +: vec1

val vec3 = "Programming" +: "Scala" +: Vector.empty

val vec4 = vec2 ++ vec3

val vec5 = vec1 :+ "Rocks!"

vec5(0)