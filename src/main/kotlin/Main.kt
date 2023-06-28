fun main() {

    println("Hallo Nutzer")
    println("Wie ist dein Name")
    // Hier gibt der User seinen Namen ein
    var name = readln()
    println("Hallo $name schön das du da bist")
    println("Jetzt sage mir noch wie schwer du bist")
    // Hier gibt der User seine Gewicht ein
    var weight = readln()
    println("Ah wie ich sehe bist du $weight KG schwer")
    println("Jetzt verrate mir noch wie Groß du bist")
    println("Hier ist es wichtig das du deine Größe in Meter angibst Beispiel: 1.95")
    // Hier gibt der User seine Grpße ein
    var size = readln()

    // Hier wandle ich das eingegebene Gewicht in ein Integer Zahl um, da die Readln immer einen String speichert
    var converedWeight = weight.toInt()
    // Hier wandle ich die eigegebene Größe in eine Double Zahl um, da die Readln immer einen String speichert
    var size2= size.toDouble()
    // Hier mache ich die erste zwischen Rechnung da ich Größe*Größe als Ergebnis benötige für die Berechnung des BMI
    var height= size2*size2
    // Hier wird der BMI errechnet
    var bmi = converedWeight / height
    // Hier wandel ich den errechneten BMI in eine Integer Zahl um, da der BMI immer als Ganze Zahl angegeben wird
    var converedBmi = bmi.toInt()

    println("Dein BMI ist somit: $converedBmi")


}