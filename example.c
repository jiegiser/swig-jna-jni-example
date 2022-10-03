/*
 * @Descripttion:
 * @Author: jiegiser
 * @Date: 2022-09-24 15:26:15
 * @LastEditors: jiegiser
 * @LastEditTime: 2022-09-24 15:27:10
 */
/* Compute factorial of n */
double My_variable = 3.0;

int fact(int n)
{
  if (n <= 1)
    return 1;
  else
    return n * fact(n - 1);
}
/* Compute n mod m */

int my_mod(int n, int m) { return (n % m); }