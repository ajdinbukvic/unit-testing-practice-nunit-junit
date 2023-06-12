using Zadatak5;

namespace Zadatak5Test
{
    public class NumberCheckerTests
    {
        
        [Test]
        public void IsEven_ReturnsTrue_ForEvenNumber()
        {
            Assert.IsTrue(NumberChecker.IsEven(6));
        }

        [Test]
        public void IsEven_ReturnsFalse_ForOddNumber()
        {
            Assert.IsFalse(NumberChecker.IsEven(9));
        }

    }
}
