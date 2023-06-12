namespace Zadatak5
{
    public class Program
    {
        public static decimal GetAverage(int[] array)
        {
            if (array.Length == 0) throw new ArgumentException("Array is empty");
            decimal sum = 0;
            for (int i = 0; i < array.Length; i++) sum += array[i];
            return decimal.Round(sum / array.Length, 2);
        }

        public static bool IsPrime(int n) 
        {
            for (int i = 2; i < n; i++)
                if (n % i == 0)
                    return false;
            return true;
        }

        public static int GetLargest(int[] array)
        {
            if (array.Length == 0) throw new ArgumentException("Array is empty");
            int largest = array[0];
            for (int i = 1; i < array.Length; i++)
                if (array[i] > largest) largest = array[i];
            return largest;
        }
    }
}
