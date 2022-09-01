package defpackage;

/* compiled from: PG */
/* renamed from: dfr  reason: default package */
/* loaded from: classes.dex */
public final class dfr {
    public int a;
    public float b;
    public float c;
    public float d;
    public float e;
    public int f;
    public String g;
    public boolean h;

    public final mrl a() {
        nfh t = mrl.j.t();
        float f = this.d;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrl mrlVar = (mrl) t.b;
        int i = mrlVar.a | 16;
        mrlVar.a = i;
        mrlVar.f = f;
        float f2 = this.e;
        int i2 = i | 32;
        mrlVar.a = i2;
        mrlVar.g = f2;
        float f3 = this.b;
        int i3 = i2 | 64;
        mrlVar.a = i3;
        mrlVar.h = f3;
        float f4 = this.c;
        int i4 = i3 | 128;
        mrlVar.a = i4;
        mrlVar.i = f4;
        int i5 = this.a;
        int i6 = i4 | 1;
        mrlVar.a = i6;
        mrlVar.b = i5;
        int i7 = this.f;
        int i8 = i6 | 2;
        mrlVar.a = i8;
        mrlVar.c = i7;
        boolean z = this.h;
        int i9 = i8 | 8;
        mrlVar.a = i9;
        mrlVar.e = z;
        String str = this.g;
        if (str != null) {
            mrlVar.a = i9 | 4;
            mrlVar.d = str;
        }
        return (mrl) t.cz();
    }
}
