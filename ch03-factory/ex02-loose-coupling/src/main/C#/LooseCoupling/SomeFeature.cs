namespace LooseCoupling
{
    public class SomeFeature
    {
        public void Feature()
        {
            IAuditor factory = AuditorFactory.create();
            factory.Log("Some feature called");
        }
    }
}
