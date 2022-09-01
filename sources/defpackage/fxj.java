package defpackage;

import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* renamed from: fxj  reason: default package */
/* loaded from: classes.dex */
public final class fxj extends fzk {
    public final fxp a;
    public final lgh b;
    public final AtomicLong c;
    private final int e;
    private final fxl g;
    private final AtomicBoolean f = new AtomicBoolean(false);
    public final AtomicLong d = new AtomicLong(0);

    public fxj(fxp fxpVar, int i, fxl fxlVar, lgh lghVar, long j) {
        this.a = fxpVar;
        this.e = i;
        this.g = fxlVar;
        this.b = lghVar;
        this.c = new AtomicLong(j);
    }

    private final void d(byte[] bArr, fxi fxiVar) {
        boolean z;
        if (this.f.getAndSet(true)) {
            Log.w("ExmplStrItrCallback", "Ignoring onIteratorNextSuccess, result already returned!");
            return;
        }
        try {
            if (bArr == null) {
                fxiVar.a(null, true);
            } else if (bArr.length <= this.e) {
                fxiVar.a(bArr, true);
            } else {
                int i = 0;
                while (true) {
                    int length = bArr.length;
                    if (i >= length) {
                        return;
                    }
                    int i2 = this.e + i;
                    if (i2 >= length) {
                        z = true;
                    } else {
                        length = i2;
                        z = false;
                    }
                    fxiVar.a(Arrays.copyOfRange(bArr, i, length), z);
                    i += this.e;
                }
            }
        } catch (TransactionTooLargeException e) {
            Log.w("ExmplStrItrCallback", "Failed to return app's result over AIDL callback", e);
            try {
                this.a.f(new Status(8, "TransactionTooLargeException"), 0L, 0L);
            } catch (RemoteException unused) {
                Log.w("ExmplStrItrCallback", "Failed to return app's result over AIDL callback", e);
            }
            this.g.b();
            throw e;
        } catch (RemoteException e2) {
            Log.w("ExmplStrItrCallback", "Failed to return app's result over AIDL callback", e2);
            this.g.b();
        }
    }

    @Override // defpackage.fzl
    public final void b(Status status, long j) {
        if (this.f.getAndSet(true)) {
            Log.w("ExmplStrItrCallback", "Ignoring onIteratorNextFailure, result already returned!");
            return;
        }
        try {
            this.a.f(status, j, this.b.a() - this.c.get());
        } catch (RemoteException e) {
            Log.w("ExmplStrItrCallback", "Failed to call onIteratorNextFailure on AIDL callback", e);
            this.g.b();
        }
    }

    @Override // defpackage.fzl
    public final void c(ftm ftmVar, ftm ftmVar2, long j) {
        byte[] bArr = null;
        byte[] bArr2 = ftmVar == null ? null : (byte[]) ftl.c(ftmVar);
        if (ftmVar2 != null) {
            bArr = (byte[]) ftl.c(ftmVar2);
        }
        d(bArr2, new fxi(this, bArr, j));
    }
}
