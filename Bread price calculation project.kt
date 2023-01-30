fun main(){



    val breads = arrayOf("lavash ","barbarism","stone")
    val price = arrayOf(500,2500,3000)

    println("Choose the desired bread")
    println("[0] lavash ")
    println("[1] barbarism")
    println("[2] stone ")
    extracted(breads, price)



}

fun extracted(breads: Array<String>, price: Array<Int>) {
    try {
        var Bread = readLine()?.toInt()!!
        println(" How many breads ${breads[Bread]} have you taken ")
        var Number = readLine()?.toInt()!!
        var Total = price[Bread] * Number
        println(" Your total purchase:$Total")

    }catch (e:NumberFormatException){
        println("The entered value is not correct")
        println(e.message)

    }catch (e:ArrayIndexOutOfBoundsException){
        println("The entered value is out of range")
        println(e.message)
    }catch (e:Exception){
        println("The value is invalid")
        println(e.message)
    }

}


