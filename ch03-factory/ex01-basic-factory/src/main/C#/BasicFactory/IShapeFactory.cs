namespace BasicFactory
{
    public interface IShapeFactory
    {
        IShape create(string type);
    }
}
