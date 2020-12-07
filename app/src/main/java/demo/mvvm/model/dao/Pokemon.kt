package demo.mvvm.model.dao

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "favorite_table")
class Pokemon(var name: String, var url: String) {
    @PrimaryKey(autoGenerate = true)
    var id = 0

}