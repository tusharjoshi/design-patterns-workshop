namespace SwitchUnclean
{
    public class DiscountCalculator
    {
        public double calculateDiscount(double amount, int month)
        {
            double discount = 0;
            switch (month)
            {
                case 1:
                case 2:
                    discount = amount * 0.1;
                    break;
                case 8:
                    discount = amount * 0.2;
                    break;
                default:
                    discount  = 0;
                    break;
            }
            return discount;
        }
	}
}

