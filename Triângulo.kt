package exercício2

class Triângulo(): Forma {

    override fun calcularArea() {
        super.calcularArea()

        println("Digite a base do Triângulo: ")
        val base = readln().toInt()

        println("Digite a altura do Triângulo: ")
        val altura = readln().toInt()

        val area = base * altura / 2

        println("A área do triângulo é $area ")

    }
}