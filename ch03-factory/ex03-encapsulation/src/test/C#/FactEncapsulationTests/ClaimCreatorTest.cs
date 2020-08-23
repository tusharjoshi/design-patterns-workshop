using Microsoft.VisualStudio.TestTools.UnitTesting;
using FactUsingEncapsulation;

namespace LooseCouplingTests
{
    [TestClass]
    public class ClaimCreatorTest
    {
        private ClaimCreator target;

        [TestInitialize()]
        public void SetUp()
        {
            target = new ClaimCreator();
        }

        [TestMethod]
        public void Object_Is_Created()
        {
            Assert.IsNotNull(target);
        }
    }
}
