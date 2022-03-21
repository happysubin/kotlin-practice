package homework

fun main(){
    //NoteBook 인스턴스 생성
    var notebook = NoteBook("LG그램",2022,250)
    println("model = ${notebook.model}, year : ${notebook.year}, price: ${notebook.price}")

    //apply는 특정 객체를 생성하면서, 초기화 과정을 수행할 때 많이사용한다. 람다식 인자로 생성한 객체(this)를 전달, 속성을 초기화 한 후 객체를 반환
    //참조 연산자 없이 멤버 사용

    var myNoteBook = NoteBook("LG그램",2022,250).apply{
        model = "[New!] $model"
        getDiscount()
        println("model = ${model}, year = $year, price : $price")
    }

    //run 객체에서 호출하는 형태와 인자가 없는 익명 함수처럼 동작하는 2가지 형태가 있으며, 인스턴스의 함수나 속성을 스코프내에서 처리 한후 결과 값을 받아야할 때 유용
    //호출 형태 (T: 수신 객체)
    // 1. 객체에서 호출하는 형태 2. 객체 없이 호출하는 형태
    // -apply처럼 run 스코프 안에서 참조 연산자 없이 인스턴스 멤버를 사용하며, 반혼 값은 람다식의 실행결과를 반환
    // Safe Calls(?.) 연산자와 함께 사용 가능

    var noteModel = myNoteBook.run{
        println("model = $model, year: $year, price: $price")
        "model: ${model}(${year})"
    }
    println(noteModel)

    //with : run과 동일한 기능을 가지지만, 인스턴스를 참조 연산자 대신, 파라미터로 받아 처리
    with(myNoteBook){
        println("model = $model, year:$year, price:$price ")
    }

    // let : 자신을 호출한 객체를 람다식의 인자로 전달. 람다식 결과를 반환
    // let은 주로 nullable한 값을 처리할 때 사용 (safe calls(?.) 함께 사용 가능)
    // 람다식 인자가 한 개일 경우 it을 통해 인스턴스를 사용

    val infoNoteBook = myNoteBook.let{
        "MyNoteBook => model : ${it.model}, year: ${it.year}, price: ${it.price}"
    }
    println(infoNoteBook)

    //also : apply 와 같이 인스턴스 자신을 다시 반환하며, it을 통해서 인스턴스를 사용
    // -apply가 주로 객체 생성 후 초기화하여 객체를 반환한다면, also는 속성 설정뿐만 아니라 객체에 대한 추가적인 작업을 한 후 객체 반환

    var myNoteBook2 = NoteBook("LG그램 360",2022,300).also{
        it.model = "[NEW! 2022] ${it.model}"
        it.getDiscount()
    }
    println("myNoteBook2 => model: ${myNoteBook2.model}, price: ${myNoteBook2.price}")
}