package core

fun main(){
    val interviewQuestions = QuestionStorage.easyInterviewQuestions // получаем вопросы из "хранилища"

    // Всегда используй такой стиль "заноса" аргументов, так ты явно указываешь, куда ты хочешь записать данные
    // Птмч иногда при дополнении аргументов - можно проебаться и перепутать местами аргументы
    val interview = Interview(interviewQuestions = interviewQuestions)
    interview.startInterview()

    val interviewResult = interview.getInterviewResult()
    val passResult = if(interviewResult) "прошел" else "не прошел" // аля тернарный оператор
    println("Ты $passResult интервью!")

    // ; - в Котлине необязательны, нужно только для того, чтобы разделять блоки, пример: var a = 0; var b = 0;
    // Типы данных необязательно указывать
    var a = 0; var b = 0
}
