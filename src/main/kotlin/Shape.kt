abstract class Shape(
    var name: String
) {
    init {
        println("i am a super class")
    }

    abstract fun area(): Double

    abstract fun perimeter(): Double

    fun changeName(newName: String){
        name = newName
    }
}