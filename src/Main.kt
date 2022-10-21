data class Person (val id: Int){
    val address: Address= Address("")
    data class Address (val street: String)
}
fun main() {
    val company : String? = null
    val person = Person(1)
    person.address.let {
        print(it.street)
    }
     println(person.address.street)
    // проверить как работает оператор ?: (elvis)
    // что сначала: значение по умолчанию или сама переменная?
    //val id: String = company!!

    company?.let { // не выполнится, если company == null
        println(it) // it - это объект company
        println(it)
    }
    val len = company?.length // elvis-оператор
    val doublelen = len?.times(2)

    val name = readLine()

    // можно проверять значение переменной тернарным оператором
    val realname =  if (name == null) "" else name

    // то же самое, но elvis-оператором
    val realname3 = name ?: "" // в случае, если name == null, вернуть ""

    val realname2 = when (name) {
        null -> ""
        else -> name
    }
    println(realname2.length)


}