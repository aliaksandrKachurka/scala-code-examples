val finicky: PartialFunction[String, String] = {
  case "finicky" => "FINICKY"
}

finicky("finicky")

//inicky("other")

val finickyOption = finicky.lift

finickyOption("finicky")

finickyOption("other")

