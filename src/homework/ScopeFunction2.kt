package homework

class NoteBook(var model: String, var year :Int, var price :Int){
    fun getDiscount(){
        price -=25
    }
}

fun main(){
    var notebook = NoteBook("LG그램",2022,250)
    println("model = ${notebook.model}, year : ${notebook.year}, price: ${notebook.price}")

    var myNoteBook = NoteBook("LG그램",2022,250).apply{
        model = "[New!] $model"
        getDiscount()
        println("model = ${model}, year = $year, price : $price")
    }


    var noteModel = myNoteBook.run{
        println("model = $model, year: $year, price: $price")
        "model: ${model}(${year})"
    }
    println(noteModel)

    with(myNoteBook){
        println("model = $model, year:$year, price:$price ")
    }

    val infoNoteBook = myNoteBook.let{
        "MyNoteBook => model : ${it.model}, year: ${it.year}, price: ${it.price}"
    }
    println(infoNoteBook)

    var myNoteBook2 = NoteBook("LG그램 360",2022,300).also{
        it.model = "[NEW! 2022] ${it.model}"
        it.getDiscount()
    }
    println("myNoteBook2 => model: ${myNoteBook2.model}, price: ${myNoteBook2.price}")
}