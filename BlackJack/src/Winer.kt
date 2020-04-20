class Winer {
    fun Winer (PC:MutableList<Int>,Player:MutableList<Int>){
        var r1=0
        var r2=0
        for(i in PC){
            r1+=i
        }
        for(i in Player){
            r2+=i
        }
        if(r2>=22)println("PC pobjednik")
        else{
            if(r1>r2 && r1<22) println("PC pobjednik")
            if(r1==r2)println("izjednaceno")
            if(r2<r1&&r2<=21){
                println("Čestitamo")
            }
        }
    }
}