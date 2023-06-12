using Zadatak5;

namespace Zadatak5Test
{
    public class ZadatakTests
    {
        
        [Test]
        public void CalculateSum_Positive_Array()
        {
            var result = Zadatak.CalculateSum(new int[] { 5, 10, 15, 20 });
            Assert.That(result, Is.EqualTo(50));
        }

        [Test]
        public void CalculateSum_Negative_Array()
        {
            var result = Zadatak.CalculateSum(new int[] { -1, -2, -3, -4 });
            Assert.That(result, Is.EqualTo(-10));
        }

        [Test]
        public void CalculateSum_Empty_Array()
        {
            var result = Zadatak.CalculateSum(new int[] { });
            Assert.That(result, Is.EqualTo(0));
        }

        [Test] 
        public void ReverseString_One_Word()
        {
            var str = "test";
            var result = Zadatak.ReverseString(str);
            Assert.That(result, Is.EqualTo("tset"));
        }

        [Test]
        public void ReverseString_More_Words()
        {
            var str = "test sa vise rijeci";
            var result = Zadatak.ReverseString(str);
            Assert.That(result, Is.EqualTo("icejir esiv as tset"));
        }

        [Test]
        public void ReverseString_Empty_String()
        {
            var str = "";
            var result = Zadatak.ReverseString(str);
            Assert.That(result, Is.EqualTo(""));
        }
    }
}
