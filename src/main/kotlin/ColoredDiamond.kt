class ColoredDiamond(name: String, weight: Double, point: Int, var color: Color) : Diamond(name, weight, point) {
    override fun Q(): Double {
        return when (color) {
            Color.CIAN -> super.Q()+1
            Color.YELLOW -> super.Q() - 0.5
            else -> super.Q()
        }
    }
}