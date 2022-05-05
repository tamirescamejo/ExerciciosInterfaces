package exercício2

class Quadrado() : Forma {

    override fun calcularArea() {
        super.calcularArea()

        println("Digite o lado do Quadrado: ")
        val lado = readln().toInt()

        val area = lado *lado

        println("A área do quadrado é $area ")

    }
}
