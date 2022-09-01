package defpackage;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: ndf  reason: default package */
/* loaded from: classes2.dex */
public class ndf {
    private static final String e = "ndf";
    public final long a;
    protected ParcelFileDescriptor b;
    final String c;
    boolean d;

    /* JADX INFO: Access modifiers changed from: protected */
    public ndf(long j) {
        if (j != 0) {
            this.a = j;
            this.c = "expressive_concepts_model_less_predictor_jni_native";
            return;
        }
        throw new ndg("Failed to load C++ pointer from JNI");
    }

    public final synchronized void a() {
        if (this.d) {
            return;
        }
        ParcelFileDescriptor parcelFileDescriptor = this.b;
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException e2) {
                Log.e(e, "Failed to close descriptor", e2);
            }
        }
        this.b = null;
        deinitJni(this.a);
        this.d = true;
    }

    protected void deinitJni(long j) {
        throw null;
    }

    protected final void finalize() {
        try {
            if (this.d) {
                a();
            } else {
                String str = e;
                String str2 = this.c;
                Log.w(str, "Finalizing an already closed Jni instance: " + str2);
            }
        } finally {
            super.finalize();
        }
    }
}
