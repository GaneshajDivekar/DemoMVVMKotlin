package fieldtrak.kotlin.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class BusinessUnit {
    @SerializedName("business_unit_id")
    @Expose
    var businessUnitId: Int? = null

    @SerializedName("business_unit_desc")
    @Expose
    var businessUnitDesc: String? = null

    @SerializedName("business_unit_code")
    @Expose
    var businessUnitCode: String? = null

}