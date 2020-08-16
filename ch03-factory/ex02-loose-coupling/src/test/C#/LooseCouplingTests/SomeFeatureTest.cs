using System;
using System.Collections.Generic;
using System.Text;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using LooseCoupling;

namespace LooseCouplingTests
{
    [TestClass]
    public class SomeFeatureTest
    {
        private SomeFeatureTest target;

        [TestInitialize()]
        public void SetUp()
        {
            target = new SomeFeatureTest();
        }

        [TestMethod]
        public void Object_Is_Created()
        {
            Assert.IsNotNull(target);
        }
    }
}
