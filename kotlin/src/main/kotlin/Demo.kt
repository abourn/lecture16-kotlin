import java.util.*

//the main method (package-level)
fun main(args: Array<String>){
    println("Hello world!")

    var x:Int = 448   
    x++
    val message:String = "I am immutable. I will not change because I am a value (val)"
    println(x)
    /* 
        Variables are statically typed.  For example, we can't change x to be a string, 
        because it was declared as an int (even if you don't explicitly state the type)
    
        Variables cannot be null, unless we explicitly state that is intended. Use a ?
        to say that it's allowed to be null. Helps b/c you can catch errors at compile
        instead of runtime
    */
    
    var messageVar:String? = "This could be null!"

    val integer:Int = 5
    var root:Double = Math.sqrt(integer.toDouble()) // you have to cast integer to double! Won't do it automatically

    val quantity = 5
    val price = 2.95
    val cost:String = "$quantity items at $$price costs ${quantity*price}" // can refer to variables inside of strings by using a $
    println(cost)

    var nums:Array<Int> = arrayOf(1, 2, 3, 4, 5) // Array has a private constructor, so we use helper methods to create arrays
    println(nums.size)
    nums[4] = 10

    // Functions
                                            // return type
    fun makeFullName(first:String, last:String):String {
        return first + " " + last
    }
                                            // a void return type. Not necessary to specify
    fun printFullName(first:String, last:String):Unit {
        println(first + " " + last)
    }

    println(makeFullName("Ada", "Jones"))
    printFullName("Ada", "Jones")

                                // we give the parameters default values here
    fun makeFullNameWithDefaults(first:String = "First", last:String = "Last"):String {
        return first + " " + last
    }

    println(makeFullNameWithDefaults("Ada")) // will produce 'Ada Last'
    println(makeFullNameWithDefaults(last="Ada", first="Jones")) // produces Jones Ada 

    // like arrow functions in JS 
    fun square(n:Int):Int = n*n // we assign this expression to the function itself. No need to 'return' something
    println(square(14))

    // can create anonymous functions, which we can use to pass in as parameters...helpful for mapping!
    var squareAnon = fun(n:Int):Int {
        return n*n
    }
    /*
        Or...lamda functions! Put it straight up inside the map call!

        val squares = numbers.map( { n:Int -> n*n } )
        
        Or, crazier yet, we can even get rid of the one parameter (n) by using the 'it' keyword, and just say
        multiply it (the parameter) by it! (to get a square)
        
        val squares = numbers.map( { it * it } )
    
    */

    val numbers = intArrayOf(1, 2, 3, 4, 5)
    val squares = numbers.map(squareAnon)
    println(squares.joinToString())




}