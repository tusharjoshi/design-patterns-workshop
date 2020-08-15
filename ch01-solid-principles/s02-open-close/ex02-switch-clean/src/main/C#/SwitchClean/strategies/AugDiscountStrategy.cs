namespace SwitchClean.strategies
{
    public class AugDiscountStrategy : IDiscountStrategy
    {
        public double calculateDiscount(double amount, int month)
        {
            return amount * 0.2;
        }
    }
}
