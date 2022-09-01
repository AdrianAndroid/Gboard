package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* renamed from: byg  reason: default package */
/* loaded from: classes.dex */
public final class byg {
    final String a;
    final String b;
    final int c;
    final mqf d;

    public byg(String str, String str2, int i, mqf mqfVar) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = mqfVar;
    }

    public final String toString() {
        return String.format(Locale.US, "{nwp-tflite-package: sym:%s model:%s version: %d}", this.a, this.b, Integer.valueOf(this.c));
    }
}
