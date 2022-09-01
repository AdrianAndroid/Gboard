package defpackage;

import android.content.res.Resources;
import android.util.SparseArray;
import android.util.TypedValue;

/* compiled from: PG */
/* renamed from: eyh */
/* loaded from: classes.dex */
public final class eyh {
    public static volatile eyh a;

    public static boolean a(int i) {
        return i == 1;
    }

    public static boolean b(int i) {
        return i == 0;
    }

    public static boolean c(int i) {
        return !b(i);
    }

    public static /* synthetic */ void d(Throwable th, Throwable th2) {
        try {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
        } catch (Exception unused) {
        }
    }

    public static float e(SparseArray sparseArray, euu euuVar, float f) {
        eut i = era.i(sparseArray, euuVar);
        return i == null ? f : (float) i.i;
    }

    public static float f(Resources resources, SparseArray sparseArray, euu euuVar) {
        return TypedValue.applyDimension(1, e(sparseArray, euuVar, 0.0f), resources.getDisplayMetrics());
    }
}
