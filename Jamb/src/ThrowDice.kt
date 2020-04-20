import kotlin.random.Random

class ThrowDice {
    fun throwDice(numbers:Array<Int>){
        for(i in 0..5)
        {
            numbers[i]=(1..6).random()
        }
    }
fun throwAgain(numbers: Array<Int>){

    var throwAgain = readLine()!!
    var AgainList = throwAgain.split(",").map { it.toInt() }
    for(i in AgainList){
        numbers[i-1]=(1..6).random()
    }
}
}