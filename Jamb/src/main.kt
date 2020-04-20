import kotlin.random.Random

fun main (args: Array<String>){
    var printing= Printing()
    var numbers = arrayOf(1, 1, 2, 2, 3, 3)
    var throwDice = ThrowDice()
    var check = Check()
    println("" + 1 + ". bacanje ")
    throwDice.throwDice(numbers)
    printing.Printing(numbers)
    check.Checking(numbers)
    for(i in 2..3) {
        print("koje kockice se ponovno bacaju")
        throwDice.throwAgain(numbers)
        print("" + i + ". bacanje ")
        println()
        printing.Printing(numbers)
        check.Checking(numbers)
    }
}