package entity


import com.google.gson.annotations.SerializedName

data class TestBase(
    @SerializedName("array")
    val array: List<Int>,
    @SerializedName("boolean")
    val boolean: Boolean,
    @SerializedName("color")
    val color: String,
    @SerializedName("null")
    val nullX: Any,
    @SerializedName("number")
    val number: Int,
    @SerializedName("object")
    val objectX: Object,
    @SerializedName("string")
    val string: String
) {
    data class Object(
        @SerializedName("a")
        val a: String,
        @SerializedName("c")
        val c: String,
        @SerializedName("e")
        val e: String
    )
}