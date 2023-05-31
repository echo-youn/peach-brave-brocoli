import java.util.LinkedList

val linkedList: LinkedList<Int> = LinkedList()

repeat (100) {
    linkedList.addLast(it)
}

var iterator = linkedList.iterator()
var iterator2 = linkedList.iterator()

var cursor = -1
var cursor2 = -1

var isCircular = false
var counter = 0

while (!isCircular) {
    if (!iterator.hasNext()) {
        iterator = linkedList.iterator()
    }
    if (!iterator2.hasNext()) {
        iterator2 = linkedList.iterator()
    }
    counter++

    cursor = iterator.next()
    println("cursor: $cursor")

    if (counter % 2 == 0) {
        cursor2 = iterator2.next()
        println("cursor2: $cursor2")
    }

    if (cursor == cursor2) {
        isCircular = true
        println(cursor)
        println(cursor2)
    }
    println(isCircular)
}

println(isCircular)




