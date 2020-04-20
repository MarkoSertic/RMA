class Check {

    fun PCcheck(hand:MutableList<Int>,lenght:Int): Int{
        var P=1
        var br=0
        for(i in 0..lenght-1){

            if(hand[i]==14||hand[i]==12||hand[i]==13){
                hand[i]=10
            }
            if(hand[i]==1){
                hand[i]=11
            }
            br+=hand[i]
        }
        if(br<17){
           return P
        }
        if(br>21){
            for(i in 0..lenght-1){
                if(hand[i]==1){
                    hand.set(i,1)
                }
            }
            for(i in hand){
                if(i==14||i==12||i==13){
                    hand[i]=10
                }
                br+=i
            }

        }
        P=2
       return P
    }
}