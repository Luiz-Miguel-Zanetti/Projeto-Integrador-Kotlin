open abstract class DadosUser(
    var nome:String,
    var email:String,
    var senha:String,
    var cpf:String,
    var tel:String
) {

    abstract fun cadastroUser()


    abstract fun loginUser()


    abstract fun doarNota()


    abstract fun trocarProduto()


    abstract fun mostrarSaldopontos()


    abstract fun listarProdutos()
}
