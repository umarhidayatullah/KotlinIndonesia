import java.util.*

fun main(args: Array<String>){
    println("Hello ${args[0]}")
    feedTheFish()
}
fun feedTheFish() {
    val day = randomDay()
    val food = "bakwan"
    println("Today is $day and the fish eat $food")
}
fun randomDay() : String {
    val week = listOf("Sun", "Month", "Tiw", "Woden", "Thor", "Freya", "Saturnus")
    return week[Random().nextInt(7)]
}