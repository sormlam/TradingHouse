package com.belayered.tradinghouse;

public class TradingCommodity {
    private TradingCommodity() {
    }

    public static class Builder {
        private String description;
        private int amount;

        public Builder() {
        }
        public TradingCommodity build() {
            return new TradingCommodity();
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder amount(int amount) {
            this.amount = amount;
            return this;
        }

    }
}
