package mforn.io.xtock.data.webservice.configuration


// Configuration
const val BASE_URL = "https://api.iextrading.com/1.0"
const val TIME_OUT_MILLIS = 5000L

// Params
const val STOCK="stock"
const val PERIOD="period"

// Stock API
//https://api.iextrading.com/1.0/stock/URTH/chart/5y
const val PATH_STOCK = "stock/{$STOCK}/chart/{$PERIOD}"
const val PATH_SECTOR_PERFORMANCE = "stock/market/sector-performance"

// DATA API
//https://api.iextrading.com/1.0/ref-data/symbols
const val PATH_DATA_SYMBOLS = "ref-data/symbols"