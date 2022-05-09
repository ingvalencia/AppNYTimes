package com.gvalencia.appnytimes

import com.google.gson.annotations.SerializedName

data class ArticuloMedia (
    var type:String,
    @SerializedName("media-metadata")  var medias:List<MediaMetadata>
)