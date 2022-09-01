package defpackage;

/* compiled from: PG */
/* renamed from: ovk  reason: default package */
/* loaded from: classes2.dex */
public final class ovk {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public ovk f;
    public ovk g;

    public ovk() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public ovk(byte[] bArr, int i, int i2, boolean z) {
        oll.e(bArr, "data");
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = false;
    }

    public final ovk a() {
        ovk ovkVar = this.f;
        if (ovkVar == this) {
            ovkVar = null;
        }
        ovk ovkVar2 = this.g;
        oll.b(ovkVar2);
        ovkVar2.f = this.f;
        ovk ovkVar3 = this.f;
        oll.b(ovkVar3);
        ovkVar3.g = this.g;
        this.f = null;
        this.g = null;
        return ovkVar;
    }

    public final ovk b() {
        this.d = true;
        return new ovk(this.a, this.b, this.c, true);
    }

    public final void c(ovk ovkVar, int i) {
        oll.e(ovkVar, "sink");
        if (!ovkVar.e) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = ovkVar.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (ovkVar.d) {
                throw new IllegalArgumentException();
            }
            int i4 = ovkVar.b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = ovkVar.a;
            nxp.A(bArr, bArr, 0, i4, i2);
            i2 = ovkVar.c - ovkVar.b;
            ovkVar.c = i2;
            ovkVar.b = 0;
        }
        byte[] bArr2 = this.a;
        byte[] bArr3 = ovkVar.a;
        int i5 = this.b;
        nxp.A(bArr2, bArr3, i2, i5, i5 + i);
        ovkVar.c += i;
        this.b += i;
    }

    public final void d(ovk ovkVar) {
        oll.e(ovkVar, "segment");
        ovkVar.g = this;
        ovkVar.f = this.f;
        ovk ovkVar2 = this.f;
        oll.b(ovkVar2);
        ovkVar2.g = ovkVar;
        this.f = ovkVar;
    }
}
