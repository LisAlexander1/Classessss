open class RightTriangle {
    var leg1: Double
    var leg2: Double

    constructor(leg1: Double, leg2: Double) {
        this.leg1 = if (leg1 > 0) leg1 else 1.0
        this.leg2 = if (leg2 > 0) leg2 else 1.0
    }

    open fun GetTan() : Double {
        return leg2 / leg1;
    }
}