package com.gvalencia.appnytimes

data class NYTResponse(
    var status:String,
    var copyright:String,
    var num_results:Int,
    var results:List<Articulo>
)