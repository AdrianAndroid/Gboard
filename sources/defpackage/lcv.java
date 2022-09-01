package defpackage;

import android.app.ActivityManager;
import android.util.DisplayMetrics;

/* compiled from: PG */
/* renamed from: lcv  reason: default package */
/* loaded from: classes.dex */
public final class lcv {
    public final int a;
    public final int b;
    public final int c;

    public lcv(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public lcv(int i, int i2, int i3, byte[] bArr) {
        this.c = i;
        this.b = i2;
        this.a = i3;
    }

    public lcv(int i, int i2, int i3, char[] cArr) {
        this.b = i;
        this.c = i2;
        this.a = i3;
    }

    public lcv(ayi ayiVar) {
        ActivityManager activityManager;
        int i = ayiVar.b.isLowRamDevice() ? ayiVar.g >> 1 : ayiVar.g;
        this.a = i;
        int round = Math.round(activityManager.getMemoryClass() * 1048576 * (true == ayiVar.b.isLowRamDevice() ? ayiVar.f : ayiVar.e));
        float f = ((DisplayMetrics) ayiVar.h.a).widthPixels * ((DisplayMetrics) ayiVar.h.a).heightPixels * 4;
        int round2 = Math.round(ayiVar.d * f);
        int round3 = Math.round(f * ayiVar.c);
        int i2 = round - i;
        if (round3 + round2 <= i2) {
            this.c = round3;
            this.b = round2;
            return;
        }
        float f2 = ayiVar.d;
        float f3 = ayiVar.c;
        float f4 = i2 / (f2 + f3);
        this.c = Math.round(f3 * f4);
        this.b = Math.round(f4 * ayiVar.d);
    }

    public final int a() {
        return this.b + this.a;
    }

    public final int b() {
        return this.c + this.a;
    }
}
