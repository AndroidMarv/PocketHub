#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring

JNICALL
Java_com_merevik_pockhub_feature_LandingActivity_stringFromJNI(
        JNIEnv *env,
        jobject) {
    std::string hello = "PocketHub";
    return env->NewStringUTF(hello.c_str());
}
