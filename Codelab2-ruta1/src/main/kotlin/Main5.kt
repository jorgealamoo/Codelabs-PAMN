fun main() {
    val song1 = Song("Ahora Y Siempre", "Quevedo", 2021, 86000000)
    val song2 = Song("Olvidada", "NiIdea", 2004, 256)
    song1.printDescription()
    song2.printDescription()
}

class Song(private val title: String, private val artist: String, private val publicationYear: Int, private val plays: Int){
    private var popular: Boolean = plays >= 1000;

    fun printDescription(){
        println("\n$title, interpretada por $artist, se lanzó en $publicationYear")
        if (popular) println("Es bastante popular con $plays reproducciones")
        else println("No es muy popular con tan solo $plays reproducciones")
    }
}