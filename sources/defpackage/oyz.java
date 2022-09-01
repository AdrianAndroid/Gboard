package defpackage;

import java.lang.reflect.Array;

/* compiled from: PG */
/* renamed from: oyz  reason: default package */
/* loaded from: classes2.dex */
public final class oyz {
    final short[] a;
    final short[][] b;
    final short[][] c;
    final short[] d;
    final /* synthetic */ ozc e;

    public oyz() {
        this.a = new short[2];
        this.b = (short[][]) Array.newInstance(Short.TYPE, 16, 8);
        this.c = (short[][]) Array.newInstance(Short.TYPE, 16, 8);
        this.d = new short[256];
    }

    public oyz(ozc ozcVar) {
        this.e = ozcVar;
        this.a = new short[2];
        this.b = (short[][]) Array.newInstance(Short.TYPE, 16, 8);
        this.c = (short[][]) Array.newInstance(Short.TYPE, 16, 8);
        this.d = new short[256];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        oze.a(this.a);
        for (int i = 0; i < 16; i++) {
            oze.a(this.b[i]);
        }
        for (int i2 = 0; i2 < 16; i2++) {
            oze.a(this.c[i2]);
        }
        oze.a(this.d);
    }

    public final int b(int i) {
        if (this.e.n.b(this.a, 0) == 0) {
            return this.e.n.c(this.b[i]) + 2;
        }
        if (this.e.n.b(this.a, 1) == 0) {
            return this.e.n.c(this.c[i]) + 10;
        }
        return this.e.n.c(this.d) + 18;
    }
}
