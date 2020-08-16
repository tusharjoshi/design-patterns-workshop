using Microsoft.VisualStudio.TestTools.UnitTesting;
using BasicFactory;

namespace ShapeFactoryTests
{
    [TestClass]
    public class BasicShapeFactoryTest
    {
        private ShapeFactory target;

        [TestInitialize()]
        public void setUp()
        {
            target = new ShapeFactory();
        }

        [TestMethod]
        public void Check_Objects_Created()
        {
            IShape circle = target.create("CIRCLE");
            IShape rectangle = target.create("RECTANGLE");
            Assert.AreSame("CIRCLE", circle.getName());
            Assert.AreSame("RECTANGLE", rectangle.getName());
        }

        [TestMethod]
        public void Objects_Not_Same()
        {
            IShape rect1 = target.create("RECTANGLE");
            IShape rect2 = target.create("RECTANGLE");
            Assert.AreNotEqual(rect1, rect2);
        }

        [TestMethod]
        public void Objects_Returns_Null_InvalidType()
        {
            IShape rect1 = target.create("UNKNOWN");
            Assert.IsNull(rect1);
        }
    }
}
