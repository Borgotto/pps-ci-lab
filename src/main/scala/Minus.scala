object ScalaMinus:
  def apply(a: Int, b: Int): Int =
    Minus.subtract(a, b)

  def subtract(a: Int, b: Int): Int =
    apply(a, b)
