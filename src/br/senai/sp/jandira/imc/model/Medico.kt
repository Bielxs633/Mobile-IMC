package br.senai.sp.jandira.imc.model

class Medico {

    var nome: String = ""
    var especialidades: ArrayList<String> = ArrayList()
    var crm: String = ""
    var telefone: String = ""

    fun mostrarFichaMedico(){
        println("---------------------------")
        println("|     Ficha do Médico     |")
        println("---------------------------")
        println("|NOME: $nome               ")
        println("|CRM: $crm                 ")
        println("|TEL: $telefone            ")
        println("|ESPECIALIDADES:           ")
        for(especialidade in especialidades){
          println("$especialidade")
        }
        println("---------------------------")
    }
}

// Looping:
// for(contador in 1..10 step 2){
//     println(contador)
// }