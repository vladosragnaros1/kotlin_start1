class Question(private val question: String) {
    private var price : Float = 1.0f;

    constructor(question: String, price: Float): this(question){
        this.price = price;
    }

    fun getQuestion(): String{
        return question;
    }
    fun getPrice(): Float{
        return price;
    }
}