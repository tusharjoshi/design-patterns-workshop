namespace BasicFactory
{
    public class ShapeFactory : IShapeFactory
    {
        public IShape create(string type)
        {
            switch (type)
            {
                case "CIRCLE":
                    return new Circle();
                case "RECTANGLE":
                    return new Rectangle();
                default:
                    return null;
            }
        }
    }
}
