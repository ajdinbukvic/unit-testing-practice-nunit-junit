namespace Zadatak5
{
    public class Zadatak
    {
        public static int CalculateSum(int[] array)
        {
            int sum = 0;
            for (int i = 0; i < array.Length; i++) sum += array[i];
            return sum;
        }

        public static string ReverseString(string str)
        {
            var newStr = "";
            for (int i = str.Length - 1; i >= 0; i--) newStr += str[i];
            return newStr;
        }
    }
}
