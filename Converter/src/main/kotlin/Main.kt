class Converter
{
    var choosenCurrency: String = ""

    fun chooseCurrency(): Double
    {
        print("Please select a currency(USD, RUB, EUR, GBP): ")
        choosenCurrency = readLine()!!.uppercase()
        var multiply = 0.0

        when(choosenCurrency)
        {
            "USD" ->
            {
                println("You choose USD")
                multiply = 5.0004
            }

            "RUB" ->
            {
                println("You choose RUB")
                multiply = 0.033
            }
            "EUR" ->
            {
                println("You choose EUR")
                multiply = 4.8449
            }
            "GBP" ->
            {
                println("You choose GBP")
                multiply = 5.5375

            }

            else -> println("You typed incorrect value")
        }
        return multiply
    }

    fun Calculate(multiply: Double)
    {
        print("Enter a value that you want to convert in $choosenCurrency: ")
        var value = readLine()!!.toDouble()
        var PLN = value * multiply
        println("$PLN PLN")
    }
}

fun main(args: Array<String>)
{
    var obj = Converter()

    var multiply = obj.chooseCurrency()
    while (true)
    {
        obj.Calculate(multiply)
    }

}