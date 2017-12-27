package spark


trait Task[T] extends Serializable {
  def run: T
  def preferredLocations: Seq[String] = Nil
}

class FunctionTask[T](body: () => T)
extends Task[T] {
  def run: T = body()
}
