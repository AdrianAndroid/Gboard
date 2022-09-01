package defpackage;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* renamed from: fzh  reason: default package */
/* loaded from: classes.dex */
final class fzh implements fwg {
    private final fzl a;
    private final lgh b;
    private final long c;
    private final fzn d;

    public fzh(fzn fznVar, fzl fzlVar, lgh lghVar) {
        this.d = fznVar;
        this.a = fzlVar;
        this.b = lghVar;
        this.c = lghVar.a();
    }

    @Override // defpackage.fwg
    public final void a(int i, String str) {
        try {
            this.a.b(new Status(i, str), this.b.a() - this.c);
        } catch (RemoteException e) {
            Log.w("brella.ExampleStoreSvc", "onIteratorNextFailure AIDL call failed, closing iterator", e);
            this.d.e();
        }
    }

    @Override // defpackage.fwg
    public final void b(byte[] bArr, byte[] bArr2) {
        long a = this.b.a() - this.c;
        try {
            fzl fzlVar = this.a;
            ftm ftmVar = null;
            ftm b = bArr == null ? null : ftl.b(bArr);
            if (bArr2 != null) {
                ftmVar = ftl.b(bArr2);
            }
            fzlVar.c(b, ftmVar, a);
        } catch (RemoteException e) {
            Log.w("brella.ExampleStoreSvc", "onIteratorNextSuccess AIDL call failed, closing iterator", e);
            this.d.e();
        }
    }
}
