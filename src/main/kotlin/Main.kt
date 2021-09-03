fun main() {

    for (number in 1..20)
    {
        if (number == 5)
        {
            continue
        }
        else if (number % 11 == 0)
        {
            break
        }
        println("Number is $number")
    }
}