package br.digital.com.aulaKolinSemObjeto

fun main () {
    println("Hello World!!!")
}

fun meuNome (nome: String, sobrenome: String) : String {
    return nome + sobrenome
}

fun exemploLista () {
    var lista = arrayListOf<String>();
    lista.add("primeiroItem")
    println(lista.get(0))
}

fun comparaInteiros (arg1: Int, arg2: Int, arg3: Int) : Int {
    return maxOf(arg1, arg2, arg3)
}

fun comparaStrings (str1: String, str2: String) : Boolean{
    return str1 != str2
}

fun ehPar (num: Int) :Boolean {
    return num % 2 == 0
}

fun imprimeImpares () {
    for (i in 1..200 step 2) {
            print("$i, ")
    }
}

fun analisaNumeros (numA: Int, numB: Int, numC: Int, numD: Int) : Boolean {
    return (numA > numC && numA > numD) || (numB > numC && numB > numD)
}

fun imprimePositivos () {
    for (i in 0..100) {
        print(i)
    }
}
