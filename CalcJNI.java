public class CalcJNI {
    static {
      // lib***.soの***
      System.loadLibrary("add");
    }
  
    // nativeメソッドの宣言
    public native void hello();
    public native int getOne();
    public native int add(int x, int y);
  }

  /*
  javac HelloJNI.java 
  javac -h . HelloJNI.java 
  clang++ -I $MY_JAVAVM_HEADERS ./hello.cpp -dynamiclib -o libhello.dylib
  java -Djava.library.path=. HelloJNI
*/