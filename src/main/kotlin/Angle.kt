class Angle(leg1: Double, leg2: Double, val beta: Double) : RightTriangle(leg1, leg2) {

    fun Delta() : Double {
        return beta - super.GetTan()
    }
}