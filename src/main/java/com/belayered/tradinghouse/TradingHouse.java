package com.belayered.tradinghouse;

import java.util.ArrayList;
import java.util.Collection;

public class TradingHouse {
    private final String name;
    private final Collection<TradingOffer> tradingOffers;

    private TradingHouse(String name, Collection<TradingOffer> tradingOffers) {
        this.name = name;
        this.tradingOffers = tradingOffers;
    }

    public void addTradingOffer(TradingOffer tradingOffer) {
        tradingOffers.add(tradingOffer);
    }

    public boolean tradingOfferExists(TradingOffer tradingOffer) {
        return tradingOffers.contains(tradingOffer);
    }

    public static class Builder {
        private final String name;
        public Builder(String name) {
            this.name = name;
        }
        public TradingHouse build() {
            return new TradingHouse(name, new ArrayList<TradingOffer>());
        }
    }
}
