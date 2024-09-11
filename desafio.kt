
enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    private val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuário ${usuario.nome} cadastrado com sucesso.")
    }

    fun listaInscritos() {
        if (inscritos.isEmpty()) {
            println("Nenhum usuário matriculado.")
        } else {
            println("Usuários matriculados na formação $nome:")
            inscritos.forEach { println("- ${it.nome}") }
        }
    }
}

fun main() {
    // Criando alguns conteúdos educacionais
    val conteudoKotlin = ConteudoEducacional("Kotlin", 120)
    val conteudoJava = ConteudoEducacional("Java", 180)
    val conteudoWeb = ConteudoEducacional("Desenvolvimento Web", 200)

    // Criando uma formação
    val formacaoDesenvolvedor = Formacao(
        nome = "Desenvolvedor Fullstack",
        conteudos = listOf(conteudoKotlin, conteudoJava, conteudoWeb),  // Lista de conteúdos
        nivel = Nivel.INTERMEDIARIO  // Nível da formação
    )
    // Criando alguns usuários
    val usuario1 = Usuario("Alice")
    val usuario2 = Usuario("Bob")
    val usuario3 = Usuario("Carol")

    // Matriculando os usuários na formação
    formacaoDesenvolvedor.matricular(usuario1)
    formacaoDesenvolvedor.matricular(usuario2)

    // Listando os inscritos
    formacaoDesenvolvedor.listaInscritos()

    // Testando com mais matrículas
    formacaoDesenvolvedor.matricular(usuario3)
    formacaoDesenvolvedor.listaInscritos()
}