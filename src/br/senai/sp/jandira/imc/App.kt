package br.senai.sp.jandira.imc

import br.senai.sp.jandira.imc.model.Consulta
import br.senai.sp.jandira.imc.model.Medico
import br.senai.sp.jandira.imc.model.Paciente
import java.time.LocalDate
import java.util.Scanner

fun main() {

//    var leitor = Scanner(System.`in`)

    var paciente1 = Paciente()
    var paciente2 = Paciente()
    var paciente3 = Paciente()

    paciente1.nome = "Gabriel"
    paciente1.dataNascimento = LocalDate.of(2008, 2, 15)
    paciente1.peso = 69
    paciente1.altura = 1.78f
    paciente1.telefone = "(11)13131-3131"
    paciente1.mostrarDados()

    paciente2.nome = "Giovanna"
    paciente2.dataNascimento = LocalDate.of(2007, 8, 31)
    paciente2.peso = 54
    paciente2.altura = 1.67f
    paciente2.telefone = "(11)77777-7777"
    paciente2.mostrarDados()

//    print("Qual o Nome do Paciente: ")
//    paciente3.nome = leitor.nextLine()
//    print("Qual a Data de Nascimento do Paciente: ")
//    paciente3.dataNascimento = LocalDate.of(2007, 8, 31)
//    print("Qual o Peso do Paciente: ")
//    paciente3.peso = leitor.nextInt()
//    print("Qual a Altura do Paciente: ")
//    paciente3.altura = leitor.nextFloat()
//    print("Qual o Telefone do Paciente: ")
//    paciente3.telefone = leitor.nextLine()
//    paciente3.mostrarDados()

    // Criação de Médicos
    var medico = Medico()
    var medico1 = Medico()
    var medico2 = Medico()

    // Preenchendo os dados de cada médico
    medico.nome = "Gabriel Soares"
    medico.crm = "13131"
    medico.telefone = "(11)13131-3131"
    medico.especialidades.add("Nutricionista")
    medico.especialidades.add("Gatroentorologista")
    medico1.especialidades.addAll(listOf("Pediatra", "Psicologo", "Dermatologista", "Clinico Geral"))
    medico.mostrarFichaMedico()

    medico1.nome = "Giovanna Xavier"
    medico1.crm = "77777"
    medico1.telefone = "(11)77777-7777"
    medico1.especialidades.addAll(listOf("Cardiologista", "Otorrionolaringologista", "Clinico Geral"))
    medico1.mostrarFichaMedico()

    medico2.nome = "Giovanna Xavier"
    medico2.crm = "77777"
    medico2.telefone = "(11)77777-7777"
    medico2.especialidades.addAll(listOf("Cardiologista", "Otorrionolaringologista", "Clinico Geral"))
    medico2.mostrarFichaMedico()

    // Criar uma consulta
    var c1 = Consulta()
    c1.marcarConsulta(100.0, LocalDate.of(2025, 2,15 ))

}

