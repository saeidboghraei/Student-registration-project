fun main(args: Array<String>) {
    val firstNames = mutableListOf<String>()
    val lastNames = mutableListOf<String>()
    val nationalCodes = mutableListOf<String>()
    val classes = mutableListOf<Byte>()

    while (true) {
        println("[1]New registration")
        println("[2]Student inquiry ")
        println("[0]Exit ")
        when (readLine()!!.toInt()) {
            0 -> {
                println("Goodbye")
                break
            }
            1 -> {
                println("Please enter the student's national code")
                nationalCodes.add(readLine()!!)
                println("Please enter the name of the student")
                firstNames.add(readLine()!!)
                println("Please enter the student's last name")
                lastNames.add(readLine()!!)
                println("Please enter the student's grade between 1 and 6")
                classes.add(readLine()!!.toByte())
                println("Your registration was successful")
            }
            2 -> {
                println("Please enter the student's national code")
                val nationalCode = readLine()!!
                var found = false
                for ((index, code) in nationalCodes.withIndex()) {
                    if (code == nationalCode) {
                        println("${firstNames[index]} ${lastNames[index]} (${classes[index]})")
                        found = true
                        break
                    }
                }
                if(!found){
                    println("No student has registered with this national code")
                }
            }
            else -> {
                println("Please enter a number between 0 and 2")
            }
        }
    }
}