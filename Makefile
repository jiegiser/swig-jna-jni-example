PYTHON_INCLUDE  = -ID:\Python310\include
    PYTHON_LIBS_DIR = -LD:\Python310\libs
    all: _factorial.pyd
    _factorial.pyd: fact.o wrap_factorial.o
        gcc -o $@ -shared fact.o wrap_factorial.o $(PYTHON_LIBS_DIR) -lpython3 $(PYTHON_LIBS_DIR) -lpython37
    wrap_factorial.o: wrap_factorial.cpp
        gcc -o $@ -c $< $(PYTHON_INCLUDE)
    fact.o: fact.cpp fact.hpp
        gcc -c fact.cpp
    wrap_factorial.cpp: factorial.i fact.hpp
        swig -c++ -python -py3 -o wrap_factorial.cpp factorial.i