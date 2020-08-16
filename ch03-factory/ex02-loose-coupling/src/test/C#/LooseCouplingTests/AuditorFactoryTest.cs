using Microsoft.VisualStudio.TestTools.UnitTesting;
using LooseCoupling;

namespace LooseCouplingTests
{
    [TestClass]
    public class AuditorFactoryTest
    {
        [TestMethod]
        public void Object_is_created()
        {
            IAuditor auditor = AuditorFactory.create();
            Assert.AreEqual("LooseCoupling.FileSystemAuditor", auditor.GetType().FullName);
        }
    }
}
