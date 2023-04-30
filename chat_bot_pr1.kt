import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    println("Hello! My name is DICT_Bot.\n" +
            "Please, remind me your name.")
    greetings(scanner)
    println("Let me guess your age.\n" +
            "Enter remainders of dividing your age by 3, 5 and 7.")
    getAgeAndRemainders(scanner)
    println("Now I will prove to you that I can count to any number you want.")
    outputOfNumbers(scanner)
    test(scanner)
}

fun greetings(scanner: Scanner){
    val name = scanner.nextLine()
    println("What a great name you have, $name!")
}

fun getAgeAndRemainders(scanner: Scanner){
    val remainder3 = scanner.nextInt()
    val remainder5 = scanner.nextInt()
    val remainder7 = scanner.nextInt()
    val age = ((remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105)
    println("Your age is $age!")
}
fun outputOfNumbers(scanner: Scanner){
    val number = scanner.nextInt()
    for (i in 0..number) {
        println("$i!")
    }
}

fun test(scanner: Scanner){
    println("Let's test your programming knowledge.\n" +
            "what's 2+2?\n" +
            "1. 4\n" +
            "2. 3\n" +
            "3. -4\n" +
            "4. 1")
    while(true){
        val answ = scanner.nextInt()
        if (answ == 1) {
            println("Absolutely right!\n" +
                    "Have a nice day!\n" +
                    "Bye!")
            break
        }else{
            println("Please, try again.")
        }
    }
}