fun sum(a: Int, b: Int): Int = a + b

fun repeatMessage(times: Int, message: String) {
    repeat(times) {
        println(message)
    }
}

fun main() {
    println(sum(3, 4))
    repeatMessage(3, "Hola Kotlin")
}

/*
CONCLUSIÓN — Functions:
- Las funciones permiten reutilizar código y mejorar la organización.
- Kotlin soporta funciones de una sola expresión para código más limpio.
- Las funciones ayudan a dividir problemas grandes en partes pequeñas.
*/