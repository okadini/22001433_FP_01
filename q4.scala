object q4 {
    def main(args:Array[String]) = {

        def bookPrice(n : Int) : Double = {
            24.95 * n
        }

        def discountPrice(n : Int) : Double = {
            0.6 * bookPrice(n)
        }

        def shippingCost(n : Int) : Double = {
            if(n <= 50) {
                3 * n
            }

            else {
                (3 * 50) + (0.75 * (n-50))
            }
        }

        def totalCost(n : Int) : Double = {
            discountPrice(n) + shippingCost(n)
        }

        println(f"Total wholesale cost = Rs.${totalCost(60)}%.2f")
    }
}