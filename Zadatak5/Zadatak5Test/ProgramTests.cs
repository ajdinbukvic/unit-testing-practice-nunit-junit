using Microsoft.VisualStudio.TestTools.UnitTesting;
using Zadatak5;
using Assert = NUnit.Framework.Assert;

namespace Zadatak5Test
{
    public class ProgramTests
    {
        [Test]
        public void GetAverage_Positive_Array()
        {
            var array = new[] { 1, 2, 3, 4 };
            var result = Program.GetAverage(array);
            Assert.That(result, Is.EqualTo(2.5));
        }

        [Test]
        public void GetAverage_Negative_Array()
        {
            var array = new[] { -5, -6, -7, -8 };
            var result = Program.GetAverage(array);
            Assert.That(result, Is.EqualTo(-6.5));
        }

        [Test]
        [ExpectedException(typeof(ArgumentException))]
        public void GetAverage_Empty_Array()
        {
            var array = Array.Empty<int>();
            Assert.Throws<ArgumentException>(() => Program.GetAverage(array));
        }

        [Test]
        public void IsPrime_Two()
        { 
            Assert.IsTrue(Program.IsPrime(2));
        }

        [Test]
        public void IsPrime_Three()
        {
            Assert.IsTrue(Program.IsPrime(3));
        }

        [Test]
        public void IsPrime_Four()
        {
            Assert.IsFalse(Program.IsPrime(4));
        }

        [Test]
        public void GetLargest_Positive_Array()
        {
            var array = new[] { 12, 26, 7, 19, 41, 20, 17, 38 };
            var result = Program.GetLargest(array);
            Assert.That(result, Is.EqualTo(41));
        }

        [Test]
        public void GetLargest_Negative_Array()
        {
            var array = new[] { -25, -48, -13, -31, -15, -56, -44};
            var result = Program.GetLargest(array);
            Assert.That(result, Is.EqualTo(-13));
        }

        [Test]
        [ExpectedException(typeof(ArgumentException))]
        public void GetLargest_Empty_Array()
        {
            var array = Array.Empty<int>();
            Assert.Throws<ArgumentException>(() => Program.GetLargest(array));
        }
    }
}
