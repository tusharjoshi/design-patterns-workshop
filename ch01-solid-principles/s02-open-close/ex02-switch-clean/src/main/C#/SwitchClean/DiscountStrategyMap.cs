using SwitchClean.strategies;
using System.Collections.Generic;

namespace SwitchClean
{
    public class DiscountStrategyMap
    {
        public static Dictionary<int, IDiscountStrategy> strategyMap = new Dictionary<int, IDiscountStrategy>()
        {
            {1, new JanFebDiscountStrategy()},
            {2,new JanFebDiscountStrategy()},
            {3, new OtherDiscountStrategy()},
            {4, new OtherDiscountStrategy()},
            {5, new OtherDiscountStrategy()},
            {6, new OtherDiscountStrategy()},
            {7, new OtherDiscountStrategy()},
            {8, new AugDiscountStrategy()},
            {9, new OtherDiscountStrategy()},
            {10, new OtherDiscountStrategy()},
            {11, new OtherDiscountStrategy()},
            {12, new OtherDiscountStrategy()}
        };
    }
}
