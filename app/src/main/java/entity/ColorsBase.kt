package entity


import com.google.gson.annotations.SerializedName

data class ColorsBase(
    @SerializedName("colors")
    val colors: List<Color>
) {
    data class Color(
        @SerializedName("category")
        val category: String,
        @SerializedName("code")
        val code: Code,
        @SerializedName("color")
        val color: String,
        @SerializedName("type")
        val type: String
    ) {
        data class Code(
            @SerializedName("hex")
            val hex: String,
            @SerializedName("rgba")
            val rgba: List<Int>
        )
    }
}