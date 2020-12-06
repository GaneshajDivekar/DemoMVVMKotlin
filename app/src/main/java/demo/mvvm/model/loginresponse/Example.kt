package fieldtrak.kotlin.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Example {
    @SerializedName("flag")
    @Expose
    var flag: String? = null

    @SerializedName("data")
    @Expose
    var data: Data? = null

}