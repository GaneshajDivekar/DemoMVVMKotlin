package fieldtrak.kotlin.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Data {
    @SerializedName("user_id")
    @Expose
    var userId: Int? = null

    @SerializedName("user_display_name")
    @Expose
    var userDisplayName: String? = null

    @SerializedName("mobile_no")
    @Expose
    var mobileNo: String? = null

    @SerializedName("user_photo_path")
    @Expose
    var userPhotoPath: String? = null

    @SerializedName("user_email")
    @Expose
    var userEmail: String? = null

    @SerializedName("manager")
    @Expose
    var manager: String? = null

    @SerializedName("app_version")
    @Expose
    var appVersion: String? = null

    @SerializedName("is_expense_applicable")
    @Expose
    var isExpenseApplicable: Boolean? = null

    @SerializedName("user_home")
    @Expose
    var userHome: String? = null

    @SerializedName("business_units")
    @Expose
    var businessUnits: List<BusinessUnit>? = null

    @SerializedName("push_token")
    @Expose
    var pushToken: Any? = null

    @SerializedName("is_ldap_user")
    @Expose
    var isLdapUser: Boolean? = null

    @SerializedName("api_list")
    @Expose
    var apiList: String? = null

}