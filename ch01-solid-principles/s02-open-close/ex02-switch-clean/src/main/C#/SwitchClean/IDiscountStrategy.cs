using System;
using System.Collections.Generic;
using System.Text;

namespace SwitchClean
{
    public interface IDiscountStrategy
    {
        double calculateDiscount(double amount, int month);
    }
}
