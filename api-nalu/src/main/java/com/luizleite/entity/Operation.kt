package com.luizleite.entity

import java.util.Date

class Operation(var stockName: String, var operationDate: Date,
                var count: Long, var value: Double, var taxes: Double,
                var broker: String) {
    constructor(stockName: String, operationDate: Date, count: Long, value: Double, broker: String) :
            this(stockName, operationDate, count, value, 0.0, broker)
}
