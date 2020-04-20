class Check {
    fun Checking(dice: Array<Int>){
        var sorted = arrayOf(1, 1, 2, 2, 3, 3)
        for(i in 0..5){
            sorted[i]=dice[i]
        }
        sorted.sort()
        var br=0
        for(i in 0..4){
            if(sorted[i]==sorted[i+1])
            {br++}
        }
        if(sorted[0]==sorted[5]) br++
        if(br==6) println("Jamb")
        if(br==4)println("Poker")
        if(br==1)println("Skala")
    }
}