package com.example.rivalsmanager.Model

data class BattleRecordModel(
    var id: String = "",
    var uId:String = "",
    var mDeckName: String = "",
    var oDeckName: String = "",
    var job: String = "",
    var result:Int = 0,
    var order:Int = 0
) {
    override fun toString(): String {
        return "BattleRecordModel(id='$id', uId='$uId', mDeckName=$mDeckName,oDeckName=$oDeckName, job='$job',result='$result',order='$order')"
    }
}