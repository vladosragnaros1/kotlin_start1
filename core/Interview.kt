package core

import models.Question

// Поля, которые не выходят за пределы класса - необходимо делать приватными
// поля классов следует писать в стиле camelCasing: minscore -> minScore
// Конструкторы в Котлине более удобные и простые, объявляются внутри кр. скобок класса
class Interview(private val interviewQuestions: Array<Question>): InterviewContract {
    private val interviewMinScore: Float = 5.0f
    private var interviewScore: Float = 0.0f

    override fun startInterview() {
        getInterviewScore()
    }

    private fun getInterviewScore() {
        interviewQuestions.forEach { question ->
            println(question.question)

            // Пример крутого использования, так можно с легкостью сокращать код внутри методов
            // Старайся максимально разбивать методы, чтобы они были МАКСИМАЛЬНО компактными и короткими
            // Так можно легко дебажить, исправлять и дополнять код
            val answer = getAnswer()
            if(answer == "+") interviewScore += question.price
        }
    }

    private fun getAnswer(): String {
        var answer = readLine()
        while (answer != "-" && answer != "+") {
            println("Введи '+' или '-'")
            answer = readLine()
        }
        return answer
    }

    // Тоже пример крутой фичи
    override fun getInterviewResult(): Boolean = interviewScore > interviewMinScore

    /*override fun getInterviewResult(): Boolean {
        return interviewScore > interviewMinScore
    }*/
}