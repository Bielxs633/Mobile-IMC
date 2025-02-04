// Programador ( dev ): Gabriel
// Data: 04/02/2025

package br.senai.sp.jandira.imc.model
import java.time.LocalDate
import java.time.Period
import kotlin.math.pow

class Paciente {

    var nome: String = ""
    // ? => nullable safe ( força o valor ser nulo );
    var dataNascimento: LocalDate? = null
    var peso: Int = 0
    // Float => Menor precisão ( por um 'f' no final para indiar um float); & Double => Maior precisão;
    var altura: Float = 0.0f
    var telefone: String = ""

    fun calcularIMC(): Float{
        var imc = peso / altura.pow(2)
        return imc
    }

    fun mostrarDados(){
        println("--------------------------")
        println("DADOS DO PACIENTE")
        println("--------------------------")
        println("NOME: $nome")
        println("IDADE: ${calcularIdade()}")
        println("PESO: $peso")
        println("ALTURA: $altura")
        println("IMC: ${calcularIMC()}")
        println("CLASSIFICAÇÃO: ${classificarIMC()}")
        println("--------------------------")
    }

    fun classificarIMC(): String{
        val imc = calcularIMC()
        var classificacao = ""

        if (imc <= 18.5){
            classificacao = "Abaixo do Peso"
        }else if (imc > 18.5 && imc <= 25.00){
            classificacao = "Peso Ideal"
        }else{
            classificacao = "Acima do Peso"
        }

       return classificacao

    }

    fun calcularIdade(): Int{
        val hoje = LocalDate.now()
        val idade = Period.between(dataNascimento, hoje).years

        return idade
    }
}