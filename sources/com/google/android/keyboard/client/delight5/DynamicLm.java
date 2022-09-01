package com.google.android.keyboard.client.delight5;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public class DynamicLm {
    private static final ltg logger = ltg.j("com/google/android/keyboard/client/delight5/DynamicLm");
    private static final iov protoUtils = new iov();

    public DynamicLm(Context context) {
        JniUtil.loadLibrary(cbd.c.b(context).getAbsolutePath());
    }

    private static native void clearDynamicLmNative(byte[] bArr);

    private static native void closeDynamicLmNative(byte[] bArr);

    private static native void flushDynamicLmNative(byte[] bArr);

    private static native byte[] getDynamicLmStatsNative(byte[] bArr);

    private static native byte[] getNgramFromDynamicLmNative(byte[] bArr);

    private static native byte[] incrementNgramInDynamicLmNative(byte[] bArr);

    private static native byte[] iterateOverDynamicLmNative(byte[] bArr);

    private static native boolean openDynamicLmNative(byte[] bArr);

    private static native void pruneDynamicLmIfNeededNative(byte[] bArr);

    private static native void setNgramInDynamicLmNative(byte[] bArr);

    private static native void updateTwiddlerDynamicLmNative(byte[] bArr);

    public static boolean validateDynamicLm(mvm mvmVar) {
        byte[] b = protoUtils.b(mvmVar);
        return b != null && validateDynamicLmNative(b);
    }

    private static native boolean validateDynamicLmNative(byte[] bArr);

    public void clearDynamicLm(mvm mvmVar) {
        byte[] b = protoUtils.b(mvmVar);
        if (b == null) {
            ((ltd) ((ltd) logger.c()).k("com/google/android/keyboard/client/delight5/DynamicLm", "clearDynamicLm", 107, "DynamicLm.java")).t("clearDynamicLm failed: could not serialize proto.");
        } else {
            clearDynamicLmNative(b);
        }
    }

    public void closeDynamicLm(mvm mvmVar) {
        byte[] b = protoUtils.b(mvmVar);
        if (b == null) {
            ((ltd) ((ltd) logger.c()).k("com/google/android/keyboard/client/delight5/DynamicLm", "closeDynamicLm", 87, "DynamicLm.java")).t("closeDynamicLm failed: could not serialize proto.");
        } else {
            closeDynamicLmNative(b);
        }
    }

    public void flushDynamicLm(mvm mvmVar) {
        byte[] b = protoUtils.b(mvmVar);
        if (b == null) {
            ((ltd) ((ltd) logger.c()).k("com/google/android/keyboard/client/delight5/DynamicLm", "flushDynamicLm", 97, "DynamicLm.java")).t("flushDynamicLm failed: could not serialize proto.");
        } else {
            flushDynamicLmNative(b);
        }
    }

    public muq getDynamicLmStats(mvm mvmVar) {
        iov iovVar = protoUtils;
        byte[] b = iovVar.b(mvmVar);
        if (b == null) {
            return null;
        }
        return (muq) iovVar.a((nhf) muq.e.N(7), getDynamicLmStatsNative(b));
    }

    public muj getNgramFromDynamicLm(mui muiVar) {
        iov iovVar = protoUtils;
        byte[] b = iovVar.b(muiVar);
        if (b == null) {
            return null;
        }
        return (muj) iovVar.a((nhf) muj.a.N(7), getNgramFromDynamicLmNative(b));
    }

    public mul incrementNgramInDynamicLm(muk mukVar) {
        iov iovVar = protoUtils;
        byte[] b = iovVar.b(mukVar);
        if (b == null) {
            return null;
        }
        return (mul) iovVar.a((nhf) mul.a.N(7), incrementNgramInDynamicLmNative(b));
    }

    public mun iterateOverDynamicLm(mum mumVar) {
        iov iovVar = protoUtils;
        byte[] b = iovVar.b(mumVar);
        if (b == null) {
            return null;
        }
        return (mun) iovVar.a((nhf) mun.a.N(7), iterateOverDynamicLmNative(b));
    }

    public boolean openDynamicLm(mvm mvmVar) {
        byte[] b = protoUtils.b(mvmVar);
        return b != null && openDynamicLmNative(b);
    }

    public void pruneDynamicLmIfNeeded(muo muoVar) {
        byte[] b = protoUtils.b(muoVar);
        if (b == null) {
            ((ltd) ((ltd) logger.c()).k("com/google/android/keyboard/client/delight5/DynamicLm", "pruneDynamicLmIfNeeded", 149, "DynamicLm.java")).t("pruneDynamicLmIfNeeded failed: could not serialize proto.");
        } else {
            pruneDynamicLmIfNeededNative(b);
        }
    }

    public void setNgramInDynamicLm(mup mupVar) {
        byte[] b = protoUtils.b(mupVar);
        if (b == null) {
            ((ltd) ((ltd) logger.c()).k("com/google/android/keyboard/client/delight5/DynamicLm", "setNgramInDynamicLm", 128, "DynamicLm.java")).t("setNgramInDynamicLm failed: could not serialize proto.");
        } else {
            setNgramInDynamicLmNative(b);
        }
    }

    public void updateTwiddlerDynamicLm(mus musVar) {
        byte[] b = protoUtils.b(musVar);
        if (b == null) {
            ((ltd) ((ltd) logger.c()).k("com/google/android/keyboard/client/delight5/DynamicLm", "updateTwiddlerDynamicLm", 179, "DynamicLm.java")).t("updateTwiddlerDynamicLm failed: could not serialize proto.");
        } else {
            updateTwiddlerDynamicLmNative(b);
        }
    }
}
