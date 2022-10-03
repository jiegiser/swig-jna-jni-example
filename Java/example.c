/*
 * @Descripttion: 
 * @Author: jiegiser
 * @Date: 2022-10-03 11:43:01
 * @LastEditors: jiegiser
 * @LastEditTime: 2022-10-03 11:43:14
 */
#include <time.h>
double My_variable = 3.0;

int fact(int n)
{
  if (n <= 1)
    return 1;
  else
    return n * fact(n - 1);
}

int my_mod(int x, int y)
{
  return (x % y);
}

char *get_time()
{
  time_t ltime;
  time(&ltime);
  return ctime(&ltime);
}