


      /*Por falta de banco de dados o usuario já está cadastrado com e-mail raian.guilherme@gmailcom e senha 1234
        para fazer o login utilize, ou modifique na class já utilize a opçao login, e não a de cadastro */



fun main() {
    var user1 = Usuario("", "raian.guilherme", "77", "", "")
    println(
        "********************************************** Bem vindo ao app Not + Hungry **********************************************\n" +

                "\n1- Fazer Cadastro\n" +
                "2- Fazer Login\n" +
        "\nDigite qual ação deseja fazer:\n"
    )
    print("Opção escolhida: ")
    var resp = readln().toInt()
    when (resp) {
        1 -> {
            println("\n***Cadastro de novo usuário***\n")
            user1.cadastroUser()
            user1.loginUser()
        }
        2 -> {
            user1.loginUser()

        }
    }
    do {
        println("********************************************** Bem vindo ao app Not + Hungry **********************************************\n")
        println(
            "Informe o que deseja fazer:\n" +
                    "\n1- Doar nota fiscal\n" +
                    "\n2- Visualizar produtos\n" +
                    "\n3- Consultar seu saldo de pontos:\n" +
                    "\n4- Resgatar produtos\n" +
                    "\n5- Informações sobre o app\n" +
                    "\n6- Deslogar\n"
        )
        print("Opção escolhida: ")
        var aux = readln().toInt()

        when (aux) {
            1 -> {
                user1.doarNota()

            }
            2 -> {
                var listProdutos = mutableListOf<String>("\n1-Camiseta\n", "\n2-Boné\n", "\n3-Vouncher15%\n", "\n4-Caneca\n")
                listProdutos.forEach {
                    println(it)
                }


            }
            3 -> {
                user1.mostrarSaldopontos()
                println()
            }
            4 -> {
                user1.resgatarProduto()
            }
            5 -> {
                user1.infoApp()
            }
            6 -> {
                println("Até mais!!")
            }
            else -> {
                println("Opção inválida!")
                println("Digite apenas entre as opções 1,2,3,4,5 e 6")
                println()
            }
        }
    } while (aux != 6)

}