package defpackage;

import com.google.android.libraries.handwriting.classifiers.HandwritingRecognizerJNI$JNIResult;
import java.lang.reflect.Array;

/* compiled from: PG */
/* renamed from: gpr  reason: default package */
/* loaded from: classes.dex */
public abstract class gpr extends gpi {
    protected long a;

    @Override // defpackage.gpi
    public final gpm b(gpq gpqVar) {
        long currentTimeMillis = System.currentTimeMillis();
        float[][][] fArr = new float[gpqVar.size()][];
        long j = -1;
        long j2 = -1;
        int i = 0;
        while (i < gpqVar.size()) {
            if (j2 == j) {
                j2 = !((gpp) gpqVar.get(0)).f() ? ((gpp) gpqVar.get(0)).b(0).c : j;
            }
            gpp gppVar = (gpp) gpqVar.get(i);
            float[][] fArr2 = (float[][]) Array.newInstance(Float.TYPE, gppVar.a(), 4);
            for (int i2 = 0; i2 < gppVar.a(); i2++) {
                gpo b = gppVar.b(i2);
                float[] fArr3 = fArr2[i2];
                fArr3[0] = b.a;
                fArr3[1] = b.b;
                fArr3[2] = (float) (b.c - j2);
                fArr3[3] = b.d;
            }
            fArr[i] = fArr2;
            i++;
            j = -1;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        HandwritingRecognizerJNI$JNIResult handwritingRecognizerJNI$JNIResult = new HandwritingRecognizerJNI$JNIResult();
        recognizeJNI(this.a, fArr, gpqVar.b, gpqVar.c, gpqVar.e, gpqVar.d, handwritingRecognizerJNI$JNIResult);
        long currentTimeMillis3 = System.currentTimeMillis();
        String.format("Copy: %d   Recognize: %d   Total: %d", Long.valueOf(currentTimeMillis2 - currentTimeMillis), Long.valueOf(currentTimeMillis3 - currentTimeMillis2), Long.valueOf(currentTimeMillis3 - currentTimeMillis));
        return new gpm(handwritingRecognizerJNI$JNIResult.results, handwritingRecognizerJNI$JNIResult.scores, handwritingRecognizerJNI$JNIResult.segmentationStrings, handwritingRecognizerJNI$JNIResult.segmentationPoints);
    }

    public void c() {
        throw null;
    }

    public abstract void deinitJNI(long j);

    protected final void finalize() {
        c();
        super.finalize();
    }

    protected abstract void recognizeJNI(long j, float[][][] fArr, int i, int i2, String str, String str2, HandwritingRecognizerJNI$JNIResult handwritingRecognizerJNI$JNIResult);
}
