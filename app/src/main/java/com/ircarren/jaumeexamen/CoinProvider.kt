package com.ircarren.jaumeexamen

object CoinProvider {
    val Crypto = listOf(
        Moneda("Bitcoin", "BTC", "23.182,69", 1.35,"https://www.cryptocompare.com/media/19633/btc.png", R.drawable.btc),
        Moneda("Ethereum", "ETH", "1.442,45", -2.65,"https://www.cryptocompare.com/media/20646/eth_logo.png", R.drawable.eth),
        Moneda("BUSD", "BUSD", "1,00", 0.00,"https://www.cryptocompare.com/media/37746245/bch.png", R.drawable.busd),
        Moneda ("Tether", "USDT", "1,00", 0.00,"https://www.cryptocompare.com/media/37746338/usdt.png", R.drawable.usdt),
        Moneda("Ripple", "XRP", "0,39", 0.45,"https://www.cryptocompare.com/media/34477776/xrp.png", R.drawable.xrp),
        Moneda("Litecoin", "LTC", "101,09", -2.65,"https://www.cryptocompare.com/media/35309662/ltc.png", R.drawable.ltc),
        Moneda("The Graph", "GRT", "0,18", -2.65,"https://www.cryptocompare.com/media/37746245/bch.png", R.drawable.grt),
        Moneda("Btc Cash", "BCH", "1.442,45", -2.65,"https://www.cryptocompare.com/media/37746245/bch.png", R.drawable.bch),
        Moneda("Bitcoin SV", "BSV", "1.442,45", -2.65,"https://www.cryptocompare.com/media/37746245/bch.png", R.drawable.bsv1),
        Moneda("Stellar", "XLM", "1.442,45", -2.65,"https://www.cryptocompare.com/media/34477776/xrp.png", R.drawable.xlm),
        Moneda("Cardano", "ADA", "1.442,45", -2.65,"https://www.cryptocompare.com/media/12318177/ada.png", R.drawable.ada),
        Moneda("Chainlink", "LINK", "1.442,45", -2.65,"https://www.cryptocompare.com/media/34477776/xrp.png", R.drawable.link),
        Moneda("EOS", "EOS", "1.442,45", -2.65,"https://www.cryptocompare.com/media/1383652/eos_1.png", R.drawable.eos),
        Moneda("Tezos", "XTZ", "1.442,45", -2.65,"https://www.cryptocompare.com/media/34477776/xrp.png", R.drawable.xtz),
        Moneda("Monero", "XMR", "1.442,45", -2.65,"https://www.cryptocompare.com/media/19969/xmr.png", R.drawable.xmr),
        Moneda("TRON", "TRX", "1.442,45", -2.65,"https://www.cryptocompare.com/media/34477776/xrp.png", R.drawable.trx),
        Moneda("Cosmos", "ATOM", "1.442,45", -2.65,"https://www.cryptocompare.com/media/34477776/xrp.png", R.drawable.atom),
        Moneda("Dai", "DAI", "1.442,45", -2.65,"https://www.cryptocompare.com/media/37746245/bch.png", R.drawable.dai),
        Moneda("NEO", "NEO", "1.442,45", -2.65,"https://www.cryptocompare.com/media/1383857/neo.png", R.drawable.neo),
        Moneda("Dash", "DASH", "1.442,45", -2.65,"https://www.cryptocompare.com/media/20646/eth_logo.png", R.drawable.dash),
        Moneda("Uniswap", "UNI", "1.442,45", -2.65,"https://www.cryptocompare.com/media/34477776/xrp.png", R.drawable.uni),
        Moneda("Maker", "MKR", "1.442,45", -2.65,"https://www.cryptocompare.com/media/34477776/xrp.png", R.drawable.mkr),
        Moneda("Zcash", "ZEC", "1.442,45", -2.65,"https://www.cryptocompare.com/media/351360/zec.png", R.drawable.zecd),
        Moneda("Dogecoin", "DOGE", "1.442,45", -2.65,"https://www.cryptocompare.com/media/19684/doge.png", R.drawable.doge),
        Moneda("Bitcoin Gold", "BTG", "1.442,45", -2.65,"https://www.cryptocompare.com/media/12318177/ada.png", R.drawable.btg),
        Moneda("Aave", "AAVE", "1.442,45", -2.65,"https://www.cryptocompare.com/media/34477776/xrp.png", R.drawable.aave),
        Moneda("Compound", "COMP", "1.442,45", -2.65,"https://www.cryptocompare.com/media/34477776/xrp.png", R.drawable.comp),
        Moneda("IOTA", "MIOTA", "1.442,45", -2.65,"https://www.cryptocompare.com/media/1383857/neo.png", R.drawable.miota),
        Moneda("Ethereum Classic", "ETC", "1.442,45", -2.65,"https://www.cryptocompare.com/media/20646/eth_logo.png", R.drawable.etc),
        Moneda("Decred", "DCR", "1.442,45", -2.65,"https://www.cryptocompare.com/media/20646/eth_logo.png", R.drawable.decred),
        Moneda("VeChain", "VET", "1.442,45", -2.65,"https://www.cryptocompare.com/media/1383857/neo.png", R.drawable.ven),
        Moneda("Ontology", "ONT", "1.442,45", -2.65,"https://www.cryptocompare.com/media/1383857/neo.png", R.drawable.ont),
        Moneda("Zilliqa", "ZIL", "1.442,45", -2.65,"https://www.cryptocompare.com/media/1383857/neo.png", R.drawable.zil),
        Moneda("Kusama", "KSM", "1.442,45", -2.65,"https://www.cryptocompare.com/media/34477776/xrp.png", R.drawable.ksm),
        Moneda("Synthetix", "SNX", "1.442,45", -2.65,"https://www.cryptocompare.com/media/34477776/xrp.png", R.drawable.snx),



    )
}

data class Moneda(val _coinName: String, val _coinSymbol: String, val _coinPrice: String, val _coinChange: Double, val _coinImage: String, val _coinIcon: Int) {

}
