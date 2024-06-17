object q5 {
    def main(args:Array[String]) = {

        def easy_pace(de : Int) = {
            8 * de
        }

        def tempo(dt : Int) = {
            7 * dt
        }

        def totalTime(de : Int,dt : Int) = {
            easy_pace(de) + tempo(dt)
        }

        println("Total running time = " + totalTime(4,3) + "min")
    }

}