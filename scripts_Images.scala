//Return number of iages and scripts in www.cnn.com
import scala.io.Source
val page = io.Source.fromURL("https://www.cnn.com/")("ISO-8859-1").mkString


val scriptRegex = "(?i)<script.*</script>".r
val imgRegex = """(http)?s?:?(\/\/[^"']*\.(jpg|jpeg|gif|png|svg))""".r

val scriptsplit = scriptRegex.findAllIn(page).matchData.toList.size

val imgsplit = imgRegex.findAllIn(page).matchData.toList.size
//val scripts = scriptsplit.findAllIn(page).mkString(" ")
println("Scripts:")
println(scriptsplit)
println("Images:")
println(imgsplit)



