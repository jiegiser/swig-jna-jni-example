'''
Descripttion: 
Author: jiegiser
Date: 2022-10-03 11:18:07
LastEditors: jiegiser
LastEditTime: 2022-10-03 15:18:35
'''
from distutils.core import setup, Extension

setup(name='example',
      py_modules=['example.py'],
      ext_modules=[
        Extension('_example',
                  ['example_wrap.c'],
                  include_dirs = [],
                  define_macros = [],

                  undef_macros = [],
                  library_dirs = [],
                  libraries = ['example']
                  )
        ]
)