class Converter
{
    var choosenCurrency: String = ""
    var loop: Boolean = true

    fun chooseCurrency(): Double
    {
        print("Please select a currency(USD, RUB, EUR, GBP): ")
        choosenCurrency = readLine()!!.uppercase()
        var multiplier = 0.0

        when(choosenCurrency) //changing the multiplier for currencies
        {
            "USD" ->
            {
                println("You choose USD")
                multiplier = 5.0004
            }

            "RUB" ->
            {
                println("You choose RUB")
                multiplier = 0.033
            }
            "EUR" ->
            {
                println("You choose EUR")
                multiplier = 4.8449
            }
            "GBP" ->
            {
                println("You choose GBP")
                multiplier = 5.5375
            }

            else -> println("You typed incorrect value")
        }
        return multiplier
    }

    fun Calculate(multiply: Double)
    {
        print("""Enter a value in $choosenCurrency that you want to convert to PLN, or type "choose" to choose the currency again, "quit" for exit the program: """)
        var value = readLine()!!

        if(value == "choose") {main()} //selecting the currency again
        else if (value == "quit") {loop = false} //stoping the loop, quiting from application
        else
        {
            var value = value.toDouble()
            var PLN = value * multiply
            println("$PLN PLN")
        }
    }
}

fun main()
{
    var obj = Converter()

    println()
    var multiplier = obj.chooseCurrency()
    while (obj.loop)
    {
        obj.Calculate(multiplier)
    }
}
