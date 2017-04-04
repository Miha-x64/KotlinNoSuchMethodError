
fun main(args: Array<String>) {
    createRunnable {
        object : Runnable {
            override fun run() {
                println(SomeClass("hello"))
            }

            inner class SomeClass(var prop: String)
        }.run()
    }.run()
}

inline fun createRunnable(crossinline code: ()->Unit): Runnable = object : Runnable {
    override fun run() = code()
}
