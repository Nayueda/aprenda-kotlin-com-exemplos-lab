class Usuario (var name: String, var formacao: String, val nivel: Nivel)

enum class Nivel {BASICO, INTERMEDIARIO, AVANCADO}

data class ConteudoEducacional(val name: String, val duracao: Int = 60)

class Formacao(val name: String, val nivel: Nivel, val conteudos: List<ConteudoEducacional>){ 
	val inscritos = mutableListOf<Usuario>()


    fun matricular(usuario: Usuario) {
        if (usuario.nivel == nivel){
        inscritos.add(usuario)
        println("Usuário ${usuario.name} matriculado na formação $name com sucesso.")
   		} else {
        println("Usuário ${usuario.name} não possui o nível adequado para esta formação.")
        }
	}
}

fun main (){
    val user1 = Usuario ("Ana","Engenharia", Nivel.AVANCADO)
    val user2 = Usuario ("Mateus","Portugues", Nivel.INTERMEDIARIO)
    val user3 = Usuario ("Zeila", "Matematica", Nivel.BASICO)
    
    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin")
    val conteudo2 = ConteudoEducacional("Conceitos de Kotlin ", 90)
    
    val formacao = Formacao ("Formação Kotlin", Nivel.BASICO, listOf(conteudo1,conteudo2))
    formacao.matricular(user1)
    formacao.matricular(user2)
    formacao.matricular(user3)

}