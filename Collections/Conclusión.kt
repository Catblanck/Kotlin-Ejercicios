fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    val evenNumbers = numbers.filter { it % 2 == 0 }
    val doubledNumbers = numbers.map { it * 2 }

    println("Original: $numbers")
    println("Even numbers: $evenNumbers")
    println("Doubled numbers: $doubledNumbers")
}

/*
CONCLUSIÓN — Collections:
- Las colecciones permiten almacenar y manipular grupos de datos.
- Kotlin ofrece funciones como map y filter que simplifican el procesamiento.
- El uso de listas inmutables reduce errores y mejora la seguridad del código.
*/