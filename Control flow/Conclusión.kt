fun main() {
    val number = 7

    when {
        number < 0 -> println("Negative number")
        number == 0 -> println("Zero")
        number in 1..10 -> println("Between 1 and 10")
        else -> println("Greater than 10")
    }

    for (i in 1..5) {
        println("Iteration $i")
    }
}

/*
CONCLUSIÓN — Control Flow:
- Las estructuras de control determinan el flujo de ejecución del programa.
- when es más legible y potente que switch.
- Los ciclos permiten repetir tareas de forma eficiente.
*/