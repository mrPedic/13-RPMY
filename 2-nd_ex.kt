fun main () {
    print("Введите слово : ")
    var input = readln()

    val str: String = input.replace("жы","жи").replace("шы","ши")

    if (input == str)
        println("В слове не было ошибки")
    else
        println("В слове была ошибка")

    println("На всякий исправленное слово : $str")
    println("\n\nТеперь вторая часть 2-го задания")
    print("Введите строку из имен \n>>>")

    input = readln()
    val list = input.split(" ").filter { it.isNotEmpty() && (it.last() == 'а' || it.last() == 'я') }.toMutableList()


    println("Оставшиеся женские имена : $list")
}