fun main() {

    //Задача 1
    val employees = listOf(
        Employee("Андрей", 26, 40_000),
        Employee("Михаил", 28, 45_000),
        Employee("Борис", 25, 43_000),
        Employee("Алексей", 30, 50_000),
        Employee("Никита", 23, 38_000)
    )
    println("Пример работы решения задачи 1:\n" +
            sortEmployeesByName(employees) + "\n" +
            sortEmployeesByAge(employees) + "\n" +
            sortEmployeesBySalary(employees)
    )

    //Задача 2
    val matrix = listOf(
        listOf(1, 3, 2),
        listOf(5, 2, 9),
        listOf(8, 4, 3),
        listOf(2, 1, 6)
    )
    println("Пример работы решения задачи 2:")
    sortMatrixRows(matrix).forEach { println(it) }

    //Задача 3
    val matrix2 = arrayOf(
        arrayOf(1, 2, 1),
        arrayOf(4, 3, 3),
        arrayOf(2, 3, 1),
        arrayOf(5, 4, 8)
    )
    println("Пример работы решения задачи 3:")
    countAndPrintSawtoothArraysFromMatrix(matrix2)
}

//Класс для задачи 1
class Employee(val name: String, val age: Int, val salary: Int) {
    override fun toString(): String {
        return "Employee(name: $name, age: $age, salary: $salary)"
    }
}

//Функции для задачи 1
fun sortEmployeesByName(employees: List<Employee>) = employees.sortedBy { it.name }

fun sortEmployeesByAge(employees: List<Employee>) = employees.sortedBy { it.age }

fun sortEmployeesBySalary(employees: List<Employee>) = employees.sortedBy { it.salary }

//Функции для задачи 2
fun sortMatrixRows(matrix: List<List<Int>>): List<List<Int>> {
    val sortedMatrix = mutableListOf<List<Int>>()
    matrix.forEach { sortedMatrix.add(it.sorted()) }
    return sortedMatrix
}

//Функции для задачи 3
fun countAndPrintSawtoothArraysFromMatrix(matrix: Array<Array<Int>>) {
    var sawtoothArraysCount = 0
    matrix.forEach { row ->
        if ((row[0] < row[1] && row[1] > row[2]) || (row[0] > row[1] && row[1] < row[2])) {
            println(row.contentToString())
            sawtoothArraysCount++
        }
    }
    println("Количество пилообразных массивов: $sawtoothArraysCount")
}