package defpackage;

/* compiled from: PG */
/* renamed from: ihm  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ihm {
    public static mes b(ifn ifnVar) {
        return c(ifnVar.f.getAndSet(0), ifnVar.g.getAndSet(0), ifnVar.h.getAndSet(0), ifnVar.i.getAndSet(0), ifnVar.j.getAndSet(0), ifnVar.k.getAndSet(0), ifnVar.l.getAndSet(0), ifnVar.m.getAndSet(0));
    }

    public static mes c(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        nfh t = mes.j.t();
        if (i > 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mes mesVar = (mes) t.b;
            mesVar.a |= 1;
            mesVar.b = i;
        }
        if (i2 > 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mes mesVar2 = (mes) t.b;
            mesVar2.a |= 2;
            mesVar2.c = i2;
        }
        if (i3 > 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mes mesVar3 = (mes) t.b;
            mesVar3.a |= 4;
            mesVar3.d = i3;
        }
        if (i4 > 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mes mesVar4 = (mes) t.b;
            mesVar4.a |= 8;
            mesVar4.e = i4;
        }
        if (i5 > 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mes mesVar5 = (mes) t.b;
            mesVar5.a |= 16;
            mesVar5.f = i5;
        }
        if (i6 > 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mes mesVar6 = (mes) t.b;
            mesVar6.a |= 32;
            mesVar6.g = i6;
        }
        if (i7 > 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mes mesVar7 = (mes) t.b;
            mesVar7.a |= 64;
            mesVar7.h = i7;
        }
        if (i8 > 0) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mes mesVar8 = (mes) t.b;
            mesVar8.a |= 128;
            mesVar8.i = i8;
        }
        return (mes) t.cz();
    }

    public static final iel d(String str, String str2, Object obj, int i, byte[] bArr, int i2) {
        return new iel(i2, str, str2, obj, i, bArr);
    }
}
