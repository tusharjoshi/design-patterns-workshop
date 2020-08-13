using System;

namespace Main
{
    public class Cache
    {
        // https://azuredevopslabs.com/labs/devopsserver/github/
	    private static Cache cacheInstance = new Cache();

	    private Cache()
	    {
	    }

	    public static Cache GetInstance()
        {
		    return cacheInstance;
        }
    }
}
