fun main() {

    println("Hallo Nutzer")
    println("Wie ist dein Name")
    var name = readln()
    println("Hallo $name schön das du da bist")
    println("Jetzt sage mir noch wie schwer du bist")
    var weight = readln()
    println("Ah wie ich sehe bist du $weight KG schwer")
    println("Jetzt verrate mir noch wie Groß du bist")
    println("Hier ist es wichtig das du deine Größe in Meter angibst Beispiel: 1.95")
    var size = readln()


    var converedWeight = weight.toInt()
    var size2= size.toDouble()
    var height= size2*size2
    var bmi = converedWeight / height
    var converedBmi = bmi.toInt()

    println("Dein BMI ist somit: $converedBmi")


}