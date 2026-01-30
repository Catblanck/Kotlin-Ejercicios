/*data class Employee(val name: String, val salary: Int)

fun employeeById(id: Int): Employee? = when (id) {
    1 -> Employee("Mary", 20)
    2 -> null
    3 -> Employee("John", 21)
    else -> null
}

fun salaryById(id: Int): Int {
    return employeeById(id)?.salary ?: 0
}

fun main() {
    println((1..4).sumOf { salaryById(it) })
}*/

/*
CONCLUSIÓN — Null Safety:
- Kotlin evita errores comunes relacionados con valores nulos.
- El operador ?. permite acceder de forma segura a propiedades.
- El operador ?: proporciona valores por defecto cuando hay null.
*/
