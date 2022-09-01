package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: fft  reason: default package */
/* loaded from: classes.dex */
public final class fft extends goh implements gpa {
    public ffu a;
    private final lga n;
    private final boolean o;

    public fft(Context context, gow gowVar, String str, opu opuVar, bnc bncVar, int i, blc blcVar, lga lgaVar, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        super(context, gowVar, str, opuVar, bncVar, i, blcVar, null, null, null, null, null);
        this.n = lgaVar;
        this.o = z;
    }

    @Override // defpackage.goh, defpackage.gpa
    public final gpd a() {
        ffu ffuVar = new ffu(this.l, this.e, this.k, this.f, this.n, new gox(super.d(), b(), c(), this.d, this.c), this.o, null, null);
        this.a = ffuVar;
        return ffuVar;
    }
}
