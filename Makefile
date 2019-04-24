# input your JavaVM Header path
JAVAVAM_HEADERS = $(MY_JAVAVM_HEADERS)


all:
	make CalcJNI.class
	make CalcClient.class
	make CalcJNI.h
	make libadd.dylib

makeHeader: CalcJNI.h

clientBuild: CalcClient.class

jniBuild: CalcJNI.class

cppBuild: libadd.dylib

CalcJNI.h: CalcJNI.java
	javac -h . CalcJNI.java

CalcClient.class: CalcClient.java
	javac CalcClient.java

CalcJNI.class: CalcJNI.java
	javac CalcJNI.java

libadd.dylib: add.cpp
	clang++ -I $(JAVAVAM_HEADERS) ./add.cpp -dynamiclib -o libadd.dylib

begin:
	java -Djava.library.path=. CalcClient

clean:
	-rm CalcJNI.h
	-rm *.class
	-rm *.dylib
