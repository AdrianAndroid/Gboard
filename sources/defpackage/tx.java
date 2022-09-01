package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* renamed from: tx  reason: default package */
/* loaded from: classes2.dex */
public final class tx {
    public static Object a(Activity activity, int i) {
        return activity.requireViewById(i);
    }

    public static int b(int i) {
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i == 8) {
                return 3;
            }
            if (i == 16) {
                return 4;
            }
            if (i == 32) {
                return 5;
            }
            if (i == 64) {
                return 6;
            }
            if (i == 128) {
                return 7;
            }
            if (i == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i);
        }
        return 0;
    }
}
