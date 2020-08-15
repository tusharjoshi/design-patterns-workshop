namespace SwitchClean.strategies
{
    public class JanFebDiscountStrategy : IDiscountStrategy
    {
        public double calculateDiscount(double amount, int month)
        {
            return amount * 0.1;
        }
    }
}
