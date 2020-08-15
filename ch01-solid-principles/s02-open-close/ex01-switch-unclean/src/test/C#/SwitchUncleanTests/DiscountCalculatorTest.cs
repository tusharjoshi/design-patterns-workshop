using Microsoft.VisualStudio.TestTools.UnitTesting;
using SwitchUnclean;

namespace SwitchUncleanTests
{
    [TestClass]
    public class DiscountCalculatorTest
    {
        private DiscountCalculator target;

        [TestInitialize()]
        public void beforeEach()
        {
            target = new DiscountCalculator();
        }

        [TestMethod]
        public void TestMethod_JanFeb()
        {
            var discountAmount = target.calculateDiscount(10000, 1);
            Assert.AreEqual(1000, discountAmount);
        }

        [TestMethod]
        public void verify_aug_discount_10()
        {
            var discountAmount = target.calculateDiscount(1000, 8);
            Assert.AreEqual(200, discountAmount);
        }

        [TestMethod]
        public void verify_other_discount_10()
        {
            var discountAmount = target.calculateDiscount(1000, 6);
            Assert.AreEqual(0, discountAmount);
        }
    }
}
