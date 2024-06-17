import scala.math._

object q3 {
    def main(args:Array[String]) = {

        def SphereVolume(r : Double) = {
            4/3 * Pi * r * r * r
        }

        println("Volume of the sphere = " + SphereVolume(5))
    }
}