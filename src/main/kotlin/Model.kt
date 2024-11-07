data class Sugerencias(val image:String,val name:String,val apellido:String)
val sugerencias = listOf<Sugerencias>(
    Sugerencias("image1.jpeg", "Clara", "Perera"),
    Sugerencias("image3.jpeg", "Rocio", "Elvira"),
    Sugerencias("image5.jpeg", "Roberto", "Acosta"),
    Sugerencias("image7.jpeg", "Rodolfo", "De León"),
)

data class