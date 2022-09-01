package defpackage;

import java.lang.reflect.Array;

/* compiled from: PG */
/* renamed from: ozc  reason: default package */
/* loaded from: classes2.dex */
public final class ozc {
    public final int a;
    public final oyy m;
    public final oze n;
    public final ozb o;
    public final int[] b = new int[4];
    public final ozd c = new ozd();
    public final short[][] d = (short[][]) Array.newInstance(Short.TYPE, 12, 16);
    public final short[] e = new short[12];
    public final short[] f = new short[12];
    public final short[] g = new short[12];
    public final short[] h = new short[12];
    public final short[][] i = (short[][]) Array.newInstance(Short.TYPE, 12, 16);
    public final short[][] j = (short[][]) Array.newInstance(Short.TYPE, 4, 64);
    public final short[][] k = {new short[2], new short[2], new short[4], new short[4], new short[8], new short[8], new short[16], new short[16], new short[32], new short[32]};
    public final short[] l = new short[16];
    public final oyz p = new oyz(this);
    public final oyz q = new oyz(this);

    public ozc(oyy oyyVar, oze ozeVar, int i, int i2, int i3) {
        this.a = (1 << i3) - 1;
        this.m = oyyVar;
        this.n = ozeVar;
        this.o = new ozb(this, i, i2);
        a();
    }

    public final void a() {
        int[] iArr = this.b;
        int i = 0;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        this.c.a = 0;
        for (int i2 = 0; i2 < 12; i2++) {
            oze.a(this.d[i2]);
        }
        oze.a(this.e);
        oze.a(this.f);
        oze.a(this.g);
        oze.a(this.h);
        for (int i3 = 0; i3 < 12; i3++) {
            oze.a(this.i[i3]);
        }
        for (int i4 = 0; i4 < 4; i4++) {
            oze.a(this.j[i4]);
        }
        for (int i5 = 0; i5 < 10; i5++) {
            oze.a(this.k[i5]);
        }
        oze.a(this.l);
        ozb ozbVar = this.o;
        while (true) {
            oza[] ozaVarArr = ozbVar.c;
            if (i < ozaVarArr.length) {
                oze.a(ozaVarArr[i].a);
                i++;
            } else {
                this.p.a();
                this.q.a();
                return;
            }
        }
    }
}
