fun main(args: Array<String>) {

    // functions
    printMyName()
    println(sum())
    println(sum(1, 6))
    println(sumThreeNumbers(1, 2))
    println(sumThreeNumbers(1, 2, 5))
    println(sumThreeNumbers(1, num3 = 4, num2 = 2))
    println(sumThreeNumbers(num1 = 5, num3 = 4, num2 = 2))
    println(testFun("Monther"))
    println(testFun())

    // classes
    val person = Person(age = 1)
    println(person)
    val person2 = Person2("Ali", 100)
    println(person2)

}

fun printMyName() {
    println("Monther")
}

fun sum(): Int {
    return 1 + 1
}

fun sum(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun sumThreeNumbers(num1: Int, num2: Int, num3: Int = 3): Int {
    return num1 + num2 + num3
}

fun testFun(name: String? = "Ali"): String {
//    if (name == null) {
//        return ""
//    }
//    return name

    return name ?: "No name entered"
}

/*
Notes:
- Kotlin doesn't support multiple inheritance, but it supports implementing multiple interfaces
 */
open class Person(
    var name: String = "",
    var age: Int = 0
): MyInterface {

    init {
        // called every time an object is created from this class
        println("Person object created")
    }

    companion object {
        // This represents static variables and functions in Java (Called by class name)
        const val MAX_AGE = 100
        fun printMaxAge() {
            println(MAX_AGE)
        }
    }

    var weight: Int = 0

    constructor(name: String, age: Int, weight: Int): this(name, age) {
        this.weight = weight
    }

    override fun getName() {
        TODO("Not yet implemented")
    }

    override fun toString(): String {
        return "name = $name, age = $age, weight = $weight"
    }

    open fun printName(): String {
        return name
    }

}

class Student(
    gpa: Float,
):Person() {

    override fun printName(): String {
        return ""
    }

}

data class Person2(
    var name: String,
    var height: Int,
) {

}

interface MyInterface {

    fun getName()

}