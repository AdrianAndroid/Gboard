package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* renamed from: foo  reason: default package */
/* loaded from: classes.dex */
public final class foo extends fok {
    private final fqg a;
    private final fxa b;

    public foo(int i, fqg fqgVar, fxa fxaVar, byte[] bArr) {
        super(i);
        this.b = fxaVar;
        this.a = fqgVar;
        if (i != 2 || !fqgVar.c) {
            return;
        }
        throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
    }

    @Override // defpackage.fok
    public final boolean a(fpg fpgVar) {
        return this.a.c;
    }

    @Override // defpackage.fok
    public final fmv[] b(fpg fpgVar) {
        return this.a.b;
    }

    @Override // defpackage.foq
    public final void d(Status status) {
        this.b.e(fyb.aM(status));
    }

    @Override // defpackage.foq
    public final void e(Exception exc) {
        this.b.e(exc);
    }

    @Override // defpackage.foq
    public final void f(fpg fpgVar) {
        try {
            this.a.a(fpgVar.b, this.b);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            d(foq.h(e2));
        } catch (RuntimeException e3) {
            e(e3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.foq
    public final void g(ijk ijkVar, boolean z) {
        fxa fxaVar = this.b;
        ijkVar.a.put(fxaVar, Boolean.valueOf(z));
        ((gen) fxaVar.a).i(new fpc(ijkVar, fxaVar, null, null, null));
    }
}
