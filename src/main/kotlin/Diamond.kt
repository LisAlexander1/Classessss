open class Diamond(var name: String, var weight: Double, var point: Int) {
    open fun Q() : Double {
      return 0.4 * weight + 0.6 * point
    }
}