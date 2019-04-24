#include "CalcJNI.h"

/*
 * Class:     CalcJNI
 * Method:    hello
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_CalcJNI_hello
  (JNIEnv *, jobject) {
   printf("Hello World! hogehoge\n");
}

/*
 * Class:     CalcJNI
 * Method:    getOne
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_CalcJNI_getOne
  (JNIEnv *, jobject) {
    return 1;
}

JNIEXPORT jint JNICALL Java_CalcJNI_add
  (JNIEnv *, jobject, jint x, jint y) {
    return x+y;
  }

// clang++ -I $MY_JAVAVM_HEADERS ./hello.cpp -dynamiclib -o libhello.dylib
