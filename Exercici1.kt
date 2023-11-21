import java.util.*

fun main(){
    // Definir Scanner
    val scan = Scanner(System.`in`)

    // Misatges
    val mensaje1: String = ""
    val mensaje2: String = ""

    // Llegir numero
    val numero: Int = comprobarEnter(scan, mensaje1, mensaje2)

    // Busca els divisors del numero
    val divisors: MutableList<Int> = trovarDivisors(numero)

    // Calcular numero perfecte
    val numeroPerfecte: Boolean = calcularNumeroPerfecte(numero, divisors)

    // Mostrar el resultat
    if (numeroPerfecte == true) println("El numero $numero és perfecte")
    else println("El numero $numero no és perfecte")
}

fun trovarDivisors(numeroEntrada: Int): MutableList<Int> {
    val divisors: MutableList<Int> = mutableListOf()

    // Trobar els divisors
    for (numero in 1..(numeroEntrada/2)) {
        if (numeroEntrada % numero == 0) {
            divisors.add(numero)
        }
    }

    return divisors
}

fun calcularNumeroPerfecte(numero: Int, divisors: MutableList<Int>): Boolean{
    var numeroPerfecte: Boolean

    // Fer calcul de numero perfecte
    var sumaDivisors: Int = 0
    for (divisor in divisors){
        sumaDivisors += divisor
    }
    if (sumaDivisors == numero) numeroPerfecte = true
    else numeroPerfecte = false

    return numeroPerfecte
}
