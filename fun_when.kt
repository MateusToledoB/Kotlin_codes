fun main(){
    println(caclulabonus("Coordenador", 4000.90f, 0))

}

fun caclulabonus(cargo: String, salario: Float, tempo: Int): String {
    return when (cargo.lowercase()) {
        "gerente" -> {
            if (tempo < 2){
                val bonus: Float = 2000.00f
                var salario_calculado = salario + bonus
                "Para o cargo de $cargo com tempo de experiencia menor que 2 anos o bonûs é de: R$ $bonus, ficando um total de R$ $salario_calculado"
            }else{
                val bonus: Float = 3000.00f
                var salario_calculado = salario + bonus
                "Para o cargo de $cargo o bonûs é de: R$ $bonus, ficando um total de R$ $salario_calculado"
            }
        }
        "coordenador" ->{
            if (tempo<1){
                val bonus: Float = 1500.00f
                var salario_calculado = salario + bonus
                "Para o cargo de $cargo com tempo de experiencia menor que 1 ano o bonûs é de: R$ $bonus, ficando um total de R$ $salario_calculado"
            }else{
                val bonus: Float = 1800.00f
                var salario_calculado = salario + bonus
                "Para o cargo de $cargo o bonûs é de: R$ $bonus, ficando um total de R$ $salario_calculado"
            }
        }
        "engenheiro" ->{
            val bonus: Float = 1000.00f
            var salario_calculado = salario + bonus
            "Para o cargo de $cargo o bonûs é de: R$ $bonus, ficando um total de R$ $salario_calculado"
        }
        "estagiario" ->{
            val bonus: Float = 500.00f
            var salario_calculado = salario + bonus
            "Para o cargo de $cargo o bonûs é de: R$ $bonus, ficando um total de R$ $salario_calculado"
        }
        else-> "Cargo não conhecido"
        }



    }



