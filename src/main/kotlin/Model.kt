data class Sugerencias(val image:String,val name:String,val apellido:String)
val sugerencias = listOf<Sugerencias>(
    Sugerencias("image1.jpeg", "Clara", "Perera"),
    Sugerencias("image3.jpeg", "Rocio", "Elvira"),
    Sugerencias("image5.jpeg", "Roberto", "Acosta"),
    Sugerencias("image7.jpeg", "Rodolfo", "De León"),
)
val historias = listOf("image2.jpeg", "image4.jpeg", "image6.jpeg", "image8.jpeg", "image9.jpeg" )

data class Publicaciones(val image:String,val name:String,val imageprofile:String, val description:String)
val publicaciones = listOf<Publicaciones>(
    Publicaciones("publicaciones.webp", "China", "image2.jpeg","Buenas os traigo fotitos de la semana pasada"),
    Publicaciones("publicaciones.webp", "Pepe", "image6.jpeg","\uD83D\uDE35\u200D\uD83D\uDCAB"),
    Publicaciones("publicaciones.webp", "Veronica", "image9.jpeg","primera publicacion"),
)
val galeria = listOf("publicaciones.webp")