package core

import models.Question

// Статический класс - object.
// К этому объекту можно обратиться из любой точки программы,
// и он будет хранить одни и те же данные

// Не рекомендуется использовать его для передачи данных
// Подходит исключительно для хранения статических данных

// Хранилище вопросов
object QuestionStorage {

    val easyInterviewQuestions: Array<Question> = arrayOf(
        Question(question = "ты знаешь язык пиотон?", price = 0.5f),
        Question(question = "ты знаешь что такое условная конструкция?", price = 1f),
        Question(question = "ты знаешь как работает оператор if?", price = 0.5f),
        Question(question = "ты знаешь кто поет розовое вино?", price = 3.0f),
        Question(question = "ты знаешь кто изобрен язык пиотон?", price = 1.5f),
        Question(question = "ты знаешь что такое классы?", price = 0.5f),
    )

}