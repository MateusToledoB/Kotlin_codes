fun portaria(){
    var tentativas = 0
    var entrou = false

    while (tentativas < 3) {

        print("Qual a sua idade? ")
        val idade = readLine()

        if (idade != null && idade != "") {
            try {

                if (idade.toInt() < 18) {
                    print("Entrada não permitida para menores de idade.")
                    break

                } else{

                    print("Qual é o tipo do seu convite? ")
                    val convite = readLine()

                    if (convite != null && convite != "") {
                        when (convite.lowercase()) {
                            "comum" -> {
                                println("Entrada permitida para o setor comum")
                                entrou = true
                            }

                            "gold" -> {
                                println("Entrada permitida para o setor gold")
                                entrou = true
                            }

                            "premium" -> {
                                println("Entrada permitida para o setor premium")
                                entrou = true
                            }

                            else -> {
                                println("convite invalido")
                            }
                        }
                    } else {
                        println("Convite não pode ser nulo ou vazio")
                    }
                }
            }catch (e: Exception){
                println("Valor Invalido para idade")
            }

        }
        tentativas = tentativas + 1
    }
    if (tentativas == 3 && !entrou) {
        println("Tentativas esgotadas. Você não entrou na paty")
    }
}
fun main(){
    portaria()
}