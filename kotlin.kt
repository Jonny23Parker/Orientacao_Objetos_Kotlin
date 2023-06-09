//https://web.dio.me/project/abstraindo-formacoes-da-dio-usando-orientacao-objetos-com-kotlin/learning/9e812df2-d205-46a0-a233-499cb503ea12?back=/track/kotlin-experience&tab=path&moduleId=undefined
2
////https://web.dio.me/users/jonatas_d_siqueira?tab=skills
3
//https://web.dio.me/track/kotlin-experience?tab=about
4
// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)
5
​
6
enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }
7
​
8
class Usuario(val nome: String, val email: String)
9
​
10
data class ConteudoEducacional(val nome: String, val duracao: Int = 100)
11
​
12
data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, val nivel: Nivel) {
13
​
14
    val inscritos = mutableListOf<Usuario>()
15
​
16
    fun matricular(usuario: Usuario) {
17
        inscritos.add(usuario)
18
    }
19
    
20
    fun imprimirGradeFormacao(): String {
21
        var grade = ""
22
        for (conteudo in conteudos) {
23
            grade += "${conteudo.nome} - ${conteudo.duracao}h\n"
24
        }
25
        return grade
26
    }
27
    
28
    fun imprimirListaInscritos(): String {
29
        var lista = ""
30
        for (usuario in inscritos) {
31
            lista += "${usuario.nome} (${usuario.email})\n"
32
        }
33
        return lista
34
    }
35
}
36
​
37
fun main() {
38
    // cursos individuais
39
    val moduloJavascript = ConteudoEducacional("curso javascript", 8)
40
    val moduloTypescript = ConteudoEducacional("curso typescript", 12)
41
    val moduloHTML = ConteudoEducacional("curso html", 4)
42
    val moduloCSS = ConteudoEducacional ("curso css", 6)
43
    val moduloAngular = ConteudoEducacional("curso Angular", 7)
44
    
45
    val listConteudos = mutableListOf<ConteudoEducacional>()
46
    listConteudos.add(moduloJavascript)
47
    listConteudos.add(moduloTypescript)
48
    listConteudos.add(moduloHTML)
49
    listConteudos.add(moduloCSS)
50
    listConteudos.add(moduloAngular)
51
        
52
    // formação completa com todos os cursos
53
    val formacaoAngular = Formacao("Formação Angular Developer", listConteudos, Nivel.AVANCADO)
54
    
55
    // criar lista de usuários
56
    val jonatas = Usuario("Jonatas", "jonatas.d.siqueira@gmail.com") 
57
    val paula = Usuario("Paula", "paula.dcastro@gmail.com")
58
    val jorge = Usuario("Jorge", "jorge.irineu@hotmail.com")
59
    val claudio = Usuario("Claudio", "claudio.joaquin@hotmail.com")
60
    
61
    // matriculando usuários na formação
62
    formacaoAngular.matricular(jonatas)
63
    formacaoAngular.matricular(paula)
64
    formacaoAngular.matricular(jorge)
65
    formacaoAngular.matricular(claudio)
66
    
67
    println("======================================")
68
    println("Dados da formação dos módulos")
69
    println("${formacaoAngular.nome} - ${formacaoAngular.nivel}")
70
    println("Grade formação")
71
    println(formacaoAngular.imprimirGradeFormacao())
72
    println("=======================================")
73
    println("Lista de inscritos")
74
    println(formacaoAngular.imprimirListaInscritos())
75
}
76
​
77
​
78
//https://web.dio.me/project/abstraindo-formacoes-da-dio-usando-orientacao-objetos-com-kotlin/learning/9e812df2-d205-46a0-a233-499cb503ea12?back=/track/kotlin-experience&tab=path&moduleId=undefined
79
////https://web.dio.me/users/jonatas_d_siqueira?tab=skills
80
//https://web.dio.me/track/kotlin-experience?tab=about
81
// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

