package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: noy  reason: default package */
/* loaded from: classes2.dex */
public final class noy implements npa {
    private volatile Object a;
    private final Object b = new Object();
    private final opu c;

    public noy(opu opuVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.c = opuVar;
    }

    @Override // defpackage.npa
    public final Object a() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    opu opuVar = this.c;
                    oiy oiyVar = bnu.a;
                    this.a = new bok(new mok((Context) opuVar.a), null, null);
                }
            }
        }
        return this.a;
    }
}
