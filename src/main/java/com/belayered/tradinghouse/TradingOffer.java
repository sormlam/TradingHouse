package com.belayered.tradinghouse;

public class TradingOffer {
    private final TradingCommodity have;
    private final TradingCommodity want;

    private TradingOffer(TradingCommodity have, TradingCommodity want) {
        this.have = have;
        this.want = want;
    }

    public static class Builder {
        private TradingCommodity have;
        private TradingCommodity want;

        public Builder() {
        }

        public Builder have(TradingCommodity have) {
            this.have = have;
            return this;
        }
        public Builder want(TradingCommodity want) {
            this.want = want;
            return this;
        }
        public TradingOffer build() {
            return new TradingOffer(have, want);
        }

    }
}
