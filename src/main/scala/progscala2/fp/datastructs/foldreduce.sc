val list = List(1, 2, 3, 4, 5, 6)

list reduce (_ + _)

list.fold(10)(_ * _)

val reduceListWith10AsSeed = (list fold 10) _

reduceListWith10AsSeed(_ * _)




