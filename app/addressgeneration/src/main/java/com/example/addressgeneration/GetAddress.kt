package com.example.addressgeneration

import android.content.Context
import io.nodle.substratesdk.account.Wallet

object GetAddress {

    fun getAddress(mnemonics: String): String {
       return Wallet(mnemonics).toSS58()

    }
}