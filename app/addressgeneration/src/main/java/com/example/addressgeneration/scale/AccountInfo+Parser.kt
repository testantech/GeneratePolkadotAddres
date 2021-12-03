package io.nodle.substratesdk.scale

import io.nodle.substratesdk.types.AccountData
import io.nodle.substratesdk.types.AccountInfo
import java.nio.ByteBuffer
import java.nio.ByteOrder

/**
 * @author Lucien Loiseau on 30/07/20.
 */

class ScaleEncoderException(msg: String?) : Exception(msg)

// with the release of Substrate 3.0, the refCount has been changed into two UInt32
// consumers and producers
fun ByteBuffer.readAccountInfoSub3(): AccountInfo {
    return AccountInfo(
        readU32(),
        readU32(),
        readU32(),
        AccountData(
            readU128(),
            readU128(),
            readU128(),
            readU128()
        )
    )
}