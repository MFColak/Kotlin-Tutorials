
fun main() {

    val rectangle = Rectangle(3.0,5.0)
    println("Rectangle area is ${rectangle.area()}")

    val myCircle1 = Circle(3.0)
    myCircle1.changeName("fatih")
    println("New name of the circle is ${myCircle1.name}")

    val myTriangle = Triangle(3.0, 5.0, 7.0)
    myTriangle.changeName("abidin")
    println("New name of the triangle is ${myTriangle.name}")

}