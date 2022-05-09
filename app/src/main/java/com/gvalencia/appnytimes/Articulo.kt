package com.gvalencia.appnytimes

data class Articulo(
    var url:String,
    var section:String,
    var title:String,
    var published_date:String,
    var media:List<ArticuloMedia>
)