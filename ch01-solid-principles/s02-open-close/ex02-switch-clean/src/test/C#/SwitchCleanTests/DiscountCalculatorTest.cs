using Microsoft.VisualStudio.TestTools.UnitTesting;
using SwitchClean;
using System;

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
        public void verify_aug_discount_20()
        {
            var discountAmount = target.calculateDiscount(1000, 8);
            Assert.AreEqual(200, discountAmount);
        }

        [TestMethod]
        public void verify_other_discount_0()
        {
            var discountAmount = target.calculateDiscount(1000, 6);
            Assert.AreEqual(0, discountAmount);
        }

        [TestMethod]
        public void verify_other_discount_InvalidMonth()
        {
            Assert.ThrowsException<ArgumentException>(() => target.calculateDiscount(1000, 14));
        }
    }
}
