package defpackage;

/* compiled from: PG */
/* renamed from: lct  reason: default package */
/* loaded from: classes.dex */
public final class lct {
    public final int a;
    public final int b;
    public final int c;
    public final Object d;

    public lct(String str, int i, int i2) {
        this.d = str;
        this.b = i;
        this.c = i2;
        this.a = -1;
    }

    public lct(String str, int i, int i2, int i3) {
        this.d = str;
        this.b = i;
        this.a = i3;
        this.c = i2;
    }

    public lct(String str, int i, int i2, int i3, byte[] bArr) {
        this.d = str;
        this.b = i;
        this.c = i2;
        this.a = i3;
    }

    public lct(lcu lcuVar, int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = lcuVar;
    }

    public static lct a(String str, int i, int i2) {
        return b(str, i, i2, 3);
    }

    public static lct b(String str, int i, int i2, int i3) {
        return new lct(str, i, i2, i3);
    }
}
