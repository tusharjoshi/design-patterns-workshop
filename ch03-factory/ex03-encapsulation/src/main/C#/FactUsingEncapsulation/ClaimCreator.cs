using System;
using System.Collections.Generic;
using System.Text;

namespace FactUsingEncapsulation
{
    public class ClaimCreator
    {
        public IClaimCalculator create()
        {
            RuleList ruleList = new RuleList();
            FixedConditions fixedConditions = new FixedConditions();
            return new StanardClaimCalculator(ruleList, fixedConditions);
        }
    }
}
