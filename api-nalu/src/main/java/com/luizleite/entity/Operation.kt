package com.luizleite.entity

import java.util.Date

class Operation(var stockName: String, var operationDate: Date,
                var count: Long, var value: Double, var taxes: Double = 0.0,
                var broker: String)
