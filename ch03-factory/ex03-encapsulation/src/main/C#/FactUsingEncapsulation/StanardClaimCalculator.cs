using System;
using System.Collections.Generic;
using System.Text;

namespace FactUsingEncapsulation
{
    public class StanardClaimCalculator : IClaimCalculator
    {
        private readonly RuleList ruleList;
        private readonly FixedConditions fixedConditions;

        public StanardClaimCalculator(RuleList ruleList, FixedConditions fixedConditions)
        {
            this.ruleList = ruleList;
            this.fixedConditions = fixedConditions;
        }

        public double CalculateClaimAmount(string code, double amount)
        {
            //Apply Rule List logic
            return amount;
        }
    }
}
