# maratona-java

Projeto de aperfeiçoamento na liguagem Java :books:

Mentor: Willian Suane - https://www.youtube.com/watch?v=VKjFuX91G5Q&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW

"escreva uma vez rode em qualquer lugar"

JVM - Java Virtual Machine

Linguagem JAVA - compilada e interpretada

casting - forçar variável, em uma variável tentar colocar um valor que não é suportado pelo tipo que ela for

Como usar um  ternário;
Ternário = (condicao) ? verdadeiro :  falso;

ARRAYS - por padrão se inicia
byte, short, int, long, float, e double = 0(zero)
char = '\u0000'   '  '
boolean = false
String null

Arrays multidimentsionais - arrays dentro de arrays

## *Orientação a Objetos*
Mapear o mundo real no mundo computacional

### Classe = forma
- classe é o que representa algo do mundo real que apresentam funcionalidades em comum
- agrupamento de coisas do mundo real que vão dar origem a objetos
- definir valores de atributosa dentro da classe, o valor vai ser igual para todos os objetos

Coesão - propósito das classes, não misturam o porque da existência.

### VarArgs  X Array
- muda apenas a sintaxe
- quando se passa um parâmetro o varArgs deve ser o último parâmetro, após ele não funciona

### Modificadores de acesso
**Public** - pode ser acessado de qualquer classe
**Private** - pode ser acessado apenas pelo objeto
**Protected** - qualquer subclasse em qualquer pacote vai ter acesso direto aos atributos como se tivesse esse atributo na própria classe
**Default** - modificador de acesso de pacote, quando não se identifica o modificador de acesso, esse q é usado como padrão
// private --> default --> protected --> public  ~do mais restritivo para o menos restritivo

### Sobrecarga de metodos 
- o java permite criar metodos com os mesmo nome porém o tipo ou a quantidade de parâmetro diferentes

### Construtores
- Inicializador de um objeto
- o java cria o contrutor automaticamente na hora da complilação
- inicializados antes de qualquer método
- NÃO POSSUEM RETORNO

### Vantagem dos contrutores:
- obrigam a seguir algumas regras, exemplo se vc tem parâmetros obrigatórios, passando esses parâmetros no construtor, ele n permitirá criar o objeto sem que esses parâmetros sejam passados

### Blocos de inicialização
- Instância
- Executado todas as vezes que se cria um novo objeto
- Independemente de que local do código for colocado ele será inicializado primeiro que os construtores

### Bloco de inicialização estáticos
- são inicializados apenas uma vez, diferentemente dos blocos não estáticos

### Ordem de execução dentro de uma classe:
1- Alocado espaço em memória
2- Cada atributo de classe é criado e incializado com valores default ou o que for passado
3- Bloco de incialização
4- Construtor é executado

### Modificador estático - static
- colocar dps do modificador de acesso
- quando se colocar um atributo como static ele passa a pertencer a classe e não mais ao objeto, isso se prova quando se faz uma alteração no valor do modificador tem que referenciar a classe e é uma alteração que é observada em todos os objetos.

### Métodos estáticos
- n se pode acessar nenhuma variável não estática dentro de métodos estáticos, porque a inteção de se crirar um métodos estáticos é por existir a possibilidade de não ter objetos em memória.
- objetos vão ser criados depois que os valores estáticos forem inicializados

### Herança
Assosiaçao --> uma coisa tem outra coisa (Ex: Escola tem aluno)
Herança --> uma coisa é outra (Ex: Funcionario é Pessoa)

Utiliza-se herança quando se quer extender a funcionalidade de uma classe e manter um relacionamento entre elas.

super - quando se utiliza o super está se referindo ao objeto mais genérico

Todas as vezes que se adiciona um contrutor com argumento na classe mãe obrigatoriamente você deve alterar nas classes filhas

#### SEQUÊNCIA DE INICIALIZAÇÃO COM HERANÇA
1- Bloco de incialização estático da super classe é executado quando a JVM carregar classe pai
2- Bloco de inicialização estpárico da sub classe é executado quando a JVM carregar classe filha
3- Alocado espaço em memória pro objeto da superclasse é criado e inicializado com valores default ou o que for passado
4- Bloc de incialização é executado na área em que aparece
5- Contrutor é executado da superclasse
6- Alocado espaço em memória pro objeto da subclasse
7- Cada atributo de subclasse é criado e incialido com os valores default ou que for passado
8- Bloco de inicialização da subclasse é executado na ordem em que aparece
9- Construtor é executado da subclasse

#### SOBRESCRITA
Sobreescrita - em uma herança sobreescrever um método da classe mãe na classe filha

@Override - garantir que está sobrescrevendo o método correto

### MODIFICADOR final
Tipos Primitivos - serve para criar CONSTANTES
para definir uma consntate deve se usar o 'final' após o modificador de acesso (funciona sem mas pode-se colocar o 'static')e definir o tipo e atribuir valor:
Ex: private static final double VELOCIDADE_LIMITE = 150.0;

Referencias - as referências para o objeto não podem ser alteradas, porém os dados do objeto podem ser mudados
Ex: public final Comprador COMPRADOR = new Comprador();

Classes e métodos - está associado a herança quando se deseja proibir que outra classe extenda os atributos de outra, basta colocar 'final' na classe. Já quando se usa o modificador 'final' em métodos, isso impossibilita que um método da superclasse seja sobrescrito na subclasse
Nos métodos que não podem sofrer alterações de funcionamento

### Enumeração
- Tipo especial de classe
- é uma classe que vc definirá atributos que vão representar uma enumeração, nos quais não podem ser alterados
- pode ficar dentro de uma classe

**Enumeraçao de métodos**
- Consiste em criar métodos dentro das enumerações e que podem ser sobrescritos (métodos abstratos)
Método abstrato - criado na intençao de ser sobrescrito, não possui corpo e tem q colocar ponto e vírgula na frente

**Retornar Enumeração com base em atributos**
- Consiste em pegar um atributo e trazer o valor na enumeração

### CLASSES ABSTRATAS
- Foram criadas para resolver um problema de desenho de código.	
- serve para ser usada como modelo para outra classe
- em uma relação de herança é criada para ser superclasse
- não pode ser estanciada, não pode criar objetos desse tipo de classe 

### Métodos abstratos
- são métodos que podem ser sobrescritos
- se voce extende de uma classe abstrata um método abstrato, vc deve prover implementação para ele
- Regra: se uma classe abstrata(pai) extende outra classe abstrata(avô) as classes(filhas) ficarão com erro de compilação se a classe pai não implementar os métodos da classe avô

### Interface
- Foram criadas com intuito de prover implementação
- não utiliza public class e sim interface
- não utiliza-se extends, utiliza-se o implements
- uma classe concreta pode implementar N interfaces diferente da herança, no qual a subclasse só pode extender uma superclasse.
- para criar métodos que possuam implementação dentro de uma interface deve usar o 'default' que foi uma atualização que veio com o Java8 que permite que esse métodos possam possuir corpo, porém sem a obrigação de ser implementado, diferentemente dos métodos abstratos.

### POLIMORFISMO
- multiplas formas
- trocar o tipo da variável de referência, mas ainda continuar usando o mesmo objeto.
- só pode ser usado na herança

## Exceções
### Error
- Problemas quenão tem como se recuperar
- Impossíveis de corrigir com o programa em execução

**Exceções checked e unchecked (checadas e não checadas)**
Exeções checadas são aquelas que são filhas da classe Exception diretamente. Caso não forem tratadas, ocorrerá um erro de compilação, n consegue nem compilar o código
Exception
- IOException
- SQLExpection
- MalformedURLException

**RuntimeException**
- NullPointerException 
- NumberFormatException
- ClassCastException
- IndexOutBoundsException
- caso ocorra algumas dessas exceptions , deve-se conferir e vericar o código, porque provavelmente é alguma coisa que deveria ter sido tratada e não foi.
- não precisa de verificação para o código compilar

**MULTI CATCH**
Tratar de múltiplas exceções de uma vez - basta adcionar vários catchs

Exceções mais genéricas deve vir ao final, porque caso vierem no início do tratamento de exceções nunca chegará nas mais específicas.

Multi catch em linha
Ex: try {
            talvezLanceException();
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }

- tomar cuidado com Excepitions na mesma linha de herança, ex: IOExecption e FileNotFoundException, IO é mais genérica e FileNotFound é a mais específica.

### Try with resources
- se encarrega de fechar a conexão ou conexões, porém só podem ser declarados objetos ou variáveis de referência que implementem a interface Closeable ou AutoCloseble
- veio com intuito de melhorar a legibilidade do código
- fechados em ordem inversa do que são declarados

### Exceções Personalizadas
- extender Exception já significa que vc tem uma Exceção personalizada
- Dependendo da regar de negócio faz-se necessário que as Exceções sejam bastante específicas, daí a importância das exceçõespersonalizadas

### Exceções e regras de sobrescrita
Quando está sobrescrevendo:
- pode não lançar nenhuma exceção
- lançar todas as exceções
- pode adicionar qualquer exceção do tipo unchecked
- não se pode adicionar exceções mais genéricas ou do tipo checked dos que foram declarados no método original (método na classe mais genérica) 

## CLASSES UTILITÁRIAS
### *Wrappers*
byte --> Byte
short --> Short
int --> Integer
long --> Long
float --> Float
double --> Double
char --> Character
boolean --> Boolean
- poder passar os parâmetros numericos não mais com valores, mas sim como variáveis de referência
- Estruturas de Dados pacote de Coleções (ArrayList, Vetores, etc) não trabalham com tipos primitivos
- permite a utilização de métodos
- tipos primitivos não são obsoletos, devem ser usados

Unboxing e autoboxing
Autobixing - transformar tipo primitivo em Wrapper
Unboxing - transformar Wrapper em tipo primitivo

Transformar String em Wrapper
Ex : Integer = Integer.parseInt("1");

### *String*
- Strings são imutáveis
- tomar cuidado ao associar um novo valor a variável de referência, porque dependendo vc não conseguirá utilizar o valor novo

Métodos:
- charAt() -  mostra o caracter da String na posição passada como parâmetro
- toUpperCase() - coloca todos os carateres como maiúculos
- toLowerCase() - coloca todos os caracteres como minúsculo
- replace(antes, depois) - substitui na String um carater por outro
- length() - contador
- substring() - limita a String, consegue apresentar apenas uma parte do todo, colocando nos parâmetros o inicial e o final, caso passe apenasz 1 parâmetro, será apresentado da posição passada até o fim
-trim() - remove espaços em branco de uma String antes e depois


*Performance*
StringBuilder - desempenho absurdamente maior que o da String normal
StringBuffer - mesma função da String Builder, porém usada em um ambiente multThreads

### *String Builder*
- n é uma String
- n se concatena uma string builder da mesma forma que uma String normal, deve-se usar o append

Métodos:
- append() - contatena uma String a outra
- reverse() - inverte a String, do último para o primeiro caracter
- delete() - passa-se 2 parâmetros, para definir um intervalo e deleta esse intervalo


### *Date* 
- trabalha com long
- grandes partes dos métodos se tornaram obsoletos
- teve problemas de intercionalização


### *Calendar*
- Veio com intuito de resolver problemas que a classe date n suprir
- classe abstrata, ou seja, não dá pra usar o new, tem q usar o  getInstance()

Métodos:
- DAY_OF_WEEK
- DAY_OF_MONTH
- DAY_OF_YEAR
- DAY_OF_WEEK_IN_MONTH

### *DateFormat*
- Permite exibir a data de diversas formas
- evolução do Date
- classe abstrata

### *Locale*
- veio para resolver os problemas de internacionalização

### *NumberFormat*
- formata numeros de acordo com o local (locale) desejado

### *SimpleDateFormat*
- um pouco mais flexível que o DateFormat
- permite criar datas customizadas
- colocar aspas simples para o Java ignorar alguma coisa dentro de um sout

### *LocalDate*
- introduzida no java8
- só trabalha com a data
- possui vários métodos que facilitam para o desenvolvedor 
- classe imutável - garante que não ocorrerá problemas de inconsistência de dados

### *LocalTime*
- mesmo padrão que o LocalDate, porém para hora

### *LocalDateTime*
- junção do LocalTime com o LocalDate
- com métodos adicionais

### *Instant*
- Parecida com a date porém trabalha com nanosegundos

### *Duration*
- cria para trabalhar com intervalos de tempo
- baseada com segundos e nanosegundos

### *Period*
- Datas 

### *DataTimeFormatter*
- classe responsável por formatações em java atualmente
- format : tranformando Objeto para String
- parse: tranformando String para Objeto

## *ResourceBundle*
- Forma de internacionalizar mensagens
