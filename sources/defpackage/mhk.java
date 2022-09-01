package defpackage;

/* compiled from: PG */
/* renamed from: mhk  reason: default package */
/* loaded from: classes.dex */
public final class mhk {
    public final mhn a;
    public final CharSequence b;
    public final int c;
    public int d;
    public int e;
    public int f;
    public String[] g;
    public int h;

    public mhk(mhn mhnVar, CharSequence charSequence) {
        this.a = mhnVar;
        jdg.u(charSequence);
        this.b = charSequence;
        int length = charSequence.length();
        this.c = length;
        jdg.y(length >= 0, "Invalid start index: %s", 0);
        this.d = 1;
        this.e = 0;
        this.f = -1;
        this.g = null;
        this.h = -1;
    }
}
