package defpackage;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.util.Pair;
import com.google.learning.expander.pod.inferenceapi.expressiveconcepts.ExpressiveConceptsModelLessPredictor;
import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: ndh  reason: default package */
/* loaded from: classes2.dex */
public final class ndh {
    private static final String a = "ndh";

    private ndh() {
    }

    public static Pair a(File file) {
        try {
            ParcelFileDescriptor open = ParcelFileDescriptor.open(file, 268435456);
            if (open == null) {
                return new Pair(0L, null);
            }
            try {
                b();
                try {
                    return new Pair(Long.valueOf(ExpressiveConceptsModelLessPredictor.initJniWithFd(open.getFd())), open);
                } catch (Exception e) {
                    Log.e(a, "Error getting native address of native library: expressive_concepts_model_less_predictor_jni_native", e);
                    throw new ndg("Error getting native address of native library: expressive_concepts_model_less_predictor_jni_native", e);
                }
            } catch (Exception e2) {
                String str = "Error getting native address of native library: expressive_concepts_model_less_predictor_jni_native from fileDescriptor: " + open.toString();
                Log.e(a, str, e2);
                throw new ndg(str, e2);
            }
        } catch (IOException e3) {
            String concat = "Error opening FileDescriptor from ".concat(file.toString());
            Log.e(a, concat, e3);
            throw new ndg(concat, e3);
        }
    }

    private static synchronized void b() {
        synchronized (ndh.class) {
            try {
                System.loadLibrary("expressive_concepts_model_less_predictor_jni_native");
            } catch (UnsatisfiedLinkError e) {
                Log.e(a, "Error loading native library: expressive_concepts_model_less_predictor_jni_native", e);
                throw new ndg("Error loading native library: expressive_concepts_model_less_predictor_jni_native");
            }
        }
    }
}
