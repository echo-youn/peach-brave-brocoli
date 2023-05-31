import java.util.LinkedList

val linkedList: LinkedList<Int> = LinkedList()

repeat (100) {
  linkedList.addLast(it)
}

var iterator = linkedList.iterator()

val visited = mutableSetOf<Int>()

var isCircular = false

while (!isCircular) {
  // circular
  if (!iterator.hasNext()) {
    iterator = linkedList.iterator()
  }
  val current = iterator.next()

  if (visited.contains(current)) {
    isCircular = true
    println(visited)
  }

  visited.add(current)
  println(current)
  println(isCircular)
}

println(isCircular)

