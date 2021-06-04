package com.test.article.utils

import com.test.article.constants.Constants.DAY_MILLIS
import com.test.article.constants.Constants.HOUR_MILLIS
import com.test.article.constants.Constants.MINUTE_MILLIS
import java.util.*

/**
 * Created by Binay on 4/6/21.
 */
private fun currentDate(): Date {
    val calendar = Calendar.getInstance()
    return calendar.time
}

fun getTimeAgo(date: Date): String? {
    var time = date.time
    if (time < 1000000000000L) {
        time *= 1000
    }
    val now: Long = currentDate().time
    if (time > now || time <= 0) {
        return "in the future"
    }
    val diff = now - time
    return if (diff < MINUTE_MILLIS) {
        "just now"
    } else if (diff < 2 * MINUTE_MILLIS) {
        "1 minute ago" // for exactly one minute
    } else if (diff < 60 * MINUTE_MILLIS) {
        "${diff / MINUTE_MILLIS} minutes ago" //  more than one minute like 2 minutes ago
    } else if (diff < 2 * HOUR_MILLIS) {
        "1 hour ago" // for exactly one hour
    } else if (diff < 24 * HOUR_MILLIS) {
        "${diff / HOUR_MILLIS} hours ago" //  more than one minute like 2 hours ago
    } else if (diff < 48 * HOUR_MILLIS) {
        "1 day ago"
    } else {
        val noOfDays: Long = diff / DAY_MILLIS
        if (noOfDays < 7) {
            "${diff / DAY_MILLIS} days ago"
        } else {
            "${noOfDays / 7} weeks ago"
        }
    }
}

