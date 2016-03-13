(List(1, 2, 3, 4, 5, 6) foldRight List.empty[String]) {
  (x, list) => s"[$x]" :: list
}