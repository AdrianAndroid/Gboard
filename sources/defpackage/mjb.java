package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* renamed from: mjb  reason: default package */
/* loaded from: classes.dex */
public final class mjb implements miy {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public mjb(lcx lcxVar, miy miyVar, int i) {
        this.c = i;
        this.b = lcxVar;
        this.a = miyVar;
    }

    public mjb(mjf mjfVar, mjc mjcVar, int i) {
        this.c = i;
        this.a = mjfVar;
        this.b = mjcVar;
    }

    public mjb(mjf mjfVar, opu opuVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.c = i;
        this.a = mjfVar;
        this.b = opuVar;
    }

    public final String toString() {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                return this.b.toString();
            }
            String valueOf = String.valueOf(this.a);
            return "propagating=[" + valueOf + "]";
        }
        return ((opu) this.b).toString();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [lcx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [hiv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, miy] */
    /* JADX WARN: Type inference failed for: r1v8, types: [mjc, java.lang.Object] */
    @Override // defpackage.miy
    public final mko a(Object obj) {
        mjd mjdVar;
        mjd mjdVar2;
        int i = this.c;
        if (i == 0) {
            mjdVar = ((mjf) this.a).b;
            Object obj2 = this.b;
            mjdVar2 = new mjd();
            try {
                return kcu.K(((opu) obj2).a.a(irh.a((Cursor) obj)));
            } finally {
            }
        } else if (i != 1) {
            mjdVar = ((mjf) this.a).b;
            ?? r1 = this.b;
            mjdVar2 = new mjd();
            try {
                mjf a = r1.a(mjdVar2.a, obj);
                a.d(mjdVar2);
                return a.c;
            } finally {
            }
        } else {
            lcx lcxVar = this.b;
            try {
                return this.a.a(obj);
            } finally {
            }
        }
    }
}
