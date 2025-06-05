fun main() {
    print("Введите количество слов (n) : ")
    val num: Int = readlnOrNull()?.toIntOrNull() ?: return println("Введено не число ")
    val list = mutableListOf<String>()

    for (i in 1..num){
        list.add(readln())
    }

    var minLength: Int = list[0].length
    for(el in list ){
        if (el.length < minLength){
            minLength = el.length
        }
    }

    print("Самое короткое слово : ")
    for (el in list){
        if (el.length == minLength){
            println(el)
            break
        }
    }
    
}