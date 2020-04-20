fun main(args:Array<String>){
    println("--------------------------------------")
    println("'1' i '11' predstavlja As, sami odlucite koju vrijednost zelite")
    print("--------------------------------------")
    println()
    var con:Boolean=true
    var y:Boolean=true
    var cards: MutableList<Int> = mutableListOf<Int>(1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6,7,7,7,7,8,8,8,8,9,9,9,9,10,10,10,10,14,14,14,14,12,12,12,12,13,13,13,13)
    var PC: MutableList<Int> = mutableListOf<Int>()
    var Player: MutableList<Int> = mutableListOf<Int>()
    var delt= Dealing()
    var diler=Check()
    var winer=Winer()
    PC.add(delt.dealing(cards))
    PC.add(delt.dealing(cards))

    Player.add((delt.dealing(cards)))
    Player.add((delt.dealing(cards)))


    do{
        println("djelitelj:"+PC[0]+" *")
        print("ja:")
        for(i in Player){
            print(""+i+" ")
        }
        println()
        println("još ili dalje (još=1, dalje=0)")
        var hand= readLine()!!
        if(hand=="0"){
            con=false
        }
        else
        {
            Player.add(delt.dealing(cards))
        }
    }while (con==true)


    while (diler.PCcheck(PC,PC.size)==1){
       // diler.PCcheck(PC,PC.size)
        PC.add(delt.dealing(cards))
    }

    println("djelitelj: ")
    for(i in PC)
    {
       print(""+i+" ")
    }
    println()
    println("ja:")
    for(i in Player){
        print(""+i+" ")
    }
    winer.Winer(PC,Player)




}