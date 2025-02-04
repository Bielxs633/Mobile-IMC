package br.senai.sp.jandira.imc.model

import java.time.LocalDate
import java.time.LocalTime

class Consulta {

    var dataConsulta: LocalDate? = null
    var horaConsulta: LocalTime? = null
    var medico: Medico? = null
    var paciente: Paciente? = null
    var valor: Valor? = null

}