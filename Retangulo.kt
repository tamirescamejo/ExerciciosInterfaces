package exercício2

class Retangulo() : Forma {

    override fun calcularArea() {
        super.calcularArea()

        println("Digite a base do Retângulo: ")
        val base = readln().toInt()

        println("Digite a altura do Retângulo: ")
        val altura = readln().toInt()

        val area = base * altura

        println("A área do retângulo é $area")
    }

}