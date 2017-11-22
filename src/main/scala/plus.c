#include <jni.h>
#include "PlusJNI.h"
#include <stdio.h>

 JNIEXPORT jint JNICALL Java_PlusJNI_plus
    (JNIEnv * env, jobject jobj, jint jx, jint jy)
    {
        return jx + jy;
    }
