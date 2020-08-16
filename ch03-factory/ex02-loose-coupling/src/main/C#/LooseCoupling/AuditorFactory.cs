using System;
using System.Collections.Generic;
using System.Text;

namespace LooseCoupling
{
    public class AuditorFactory
    {
        public static IAuditor create()
        {
            return new FileSystemAuditor();
        }
    }
}
