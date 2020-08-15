using SwitchClean.strategies;
using System;

namespace SwitchClean
{
    public class DiscountCalculator
    {
        public double calculateDiscount(double amount, int month)
        {
            if (!(month >= 1 && month <= 12))
                throw new ArgumentException("There should be a valid month");
            IDiscountStrategy strategy = DiscountStrategyMap.strategyMap[month];
            return strategy.calculateDiscount(amount, month);
        }
	}
}

