package defpackage;

/* compiled from: PG */
/* renamed from: dov  reason: default package */
/* loaded from: classes.dex */
public final class dov extends hlv {
    public dov(hls hlsVar) {
        super(hlsVar);
    }

    @Override // defpackage.hlv, defpackage.hlq
    public final void f(int i, int i2, CharSequence charSequence) {
        if (charSequence == null) {
            super.f(i, i2, null);
            return;
        }
        int length = charSequence.length();
        CharSequence subSequence = charSequence.subSequence(0, Math.abs(i));
        CharSequence subSequence2 = charSequence.subSequence(length - Math.abs(i2), length);
        int length2 = dou.a(subSequence).length() - subSequence.length();
        int length3 = dou.a(subSequence2).length() - subSequence2.length();
        if (i < 0) {
            i -= length2;
        } else if (i > 0) {
            i += length2;
        }
        if (i2 < 0) {
            i2 -= length3;
        } else if (i2 > 0) {
            i2 += length3;
        }
        super.f(i, i2, null);
    }

    @Override // defpackage.hlv, defpackage.hlq
    public final void g(CharSequence charSequence, int i) {
        this.f.g(dou.a(charSequence), i);
    }

    @Override // defpackage.hlv, defpackage.hlr
    public final hqk hT(int i, int i2, int i3) {
        hqk hT = this.f.hT(i, i2, i3);
        return new hqk(dou.b(hT.d()), dou.b(hT.c()), dou.b(hT.b()), -1);
    }

    @Override // defpackage.hlv, defpackage.hlq
    public final void hV(CharSequence charSequence, boolean z, int i) {
        this.f.hV(dou.a(charSequence), z, i);
    }

    @Override // defpackage.hlv, defpackage.hlq
    public final void hX(int i, int i2, CharSequence charSequence, boolean z) {
        this.f.hX(i, i2, dou.a(charSequence), z);
    }

    @Override // defpackage.hlv, defpackage.hlq
    public final void hu(int i, int i2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5) {
        this.f.hu(i, i2, dou.a(charSequence), dou.a(charSequence2), dou.a(charSequence3), dou.a(charSequence4), dou.a(charSequence5));
    }

    @Override // defpackage.hlv, defpackage.hlr
    public final CharSequence i(int i) {
        return dou.b(this.f.i(i));
    }

    @Override // defpackage.hlv, defpackage.hlr
    public final CharSequence j(int i) {
        return dou.b(this.f.j(i));
    }
}
