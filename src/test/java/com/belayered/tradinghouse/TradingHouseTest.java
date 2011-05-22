package com.belayered.tradinghouse;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TradingHouseTest {
    TradingHouse tradingHouse;

    @Before
    public void setUp() throws Exception {
        tradingHouse = new TradingHouse.Builder("Demo Exchange").build();
    }

    @Test()
    public void addingATradingOfferShouldMakeItVisible() throws Exception {
        TradingHouse tradingHouse = new TradingHouse.Builder("Demo Exchange").build();
        TradingCommodity shoe = new TradingCommodity.Builder().description("My old nike shoe").amount(1).build();
        TradingCommodity money = new TradingCommodity.Builder().description("American Dollars").amount(10).build();
        TradingOffer tradingOffer = new TradingOffer.Builder().have(shoe).want(money).build();
        tradingHouse.addTradingOffer(tradingOffer);
        assertEquals(true, tradingHouse.tradingOfferExists(tradingOffer));
    }

    @Test
    public void oneShouldBeAbleToAddStockSellOrdersToTheTradingHouse() throws Exception {
        int amount = 10000;
        TradingCommodity sellOrder = new TradingCommodity.Builder().description("Digital Illusion").amount(amount).build();
        TradingCommodity money = new TradingCommodity.Builder().description("Dollar").amount(100*amount).build();
        TradingOffer tradingOffer = new TradingOffer.Builder().have(sellOrder).want(money).build();
        tradingHouse.addTradingOffer(tradingOffer);
        assertEquals(true, tradingHouse.tradingOfferExists(tradingOffer));
    }

}
