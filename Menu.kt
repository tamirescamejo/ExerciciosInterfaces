package exercício2

import kotlin.system.exitProcess

class Menu {

    fun menuOpcoes() {

            println("|---------------------------------------|")
            println("|               MENU                    |")
            println("|---------------------------------------|")
            println("| Digite qual forma deseja calcula:     |")
            println("|---------------------------------------|")
            println("| Opção 1 - Calcular área do Quadrado   |")
            println("| Opção 2 - Calcular área do Triângulo  |")
            println("| Opção 3 - Calcular área do Retângulo  |")
            println("| Opção 4 - Sair                        |")
            println("|---------------------------------------|")

                when(readln().toInt()){
                1 -> Retangulo()
                2 -> Triângulo()
                3 -> Retangulo()
                4 -> exitProcess(0)

                else -> {
                    println("\n     Opção Inválida!    \n")

                    menuOpcoes()
                }
            }
        }
}