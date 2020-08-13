using System;
using Xunit;
using Xunit.Sdk;

namespace Main.Tests
{
    public class CacheTest
    {
        private Cache target;
        
        public CacheTest()
        {
            target = Cache.GetInstance();
        }

        [Fact]
        public void Check_Object_IsSame()
        {
            Cache cache = Cache.GetInstance();
            Assert.Equal(target, cache);
        }
    }
}
