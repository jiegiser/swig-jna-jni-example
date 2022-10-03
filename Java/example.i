/*
 * @Descripttion:
 * @Author: jiegiser
 * @Date: 2022-10-03 11:43:22
 * @LastEditors: jiegiser
 * @LastEditTime: 2022-10-03 15:21:20
 */

%module example
 %{
 /* Put header files here or function declarations like below */
 extern double My_variable;
 extern int fact(int n);
 extern int my_mod(int x, int y);
 extern char *get_time();
 %}
 
 extern double My_variable;
 extern int fact(int n);
 extern int my_mod(int x, int y);
 extern char *get_time();