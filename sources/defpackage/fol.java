package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fol  reason: default package */
/* loaded from: classes.dex */
public abstract class fol extends fok {
    protected final fxa a;

    public fol(int i, fxa fxaVar, byte[] bArr) {
        super(i);
        this.a = fxaVar;
    }

    protected abstract void c(fpg fpgVar);

    @Override // defpackage.foq
    public final void d(Status status) {
        this.a.e(new fnx(status));
    }

    @Override // defpackage.foq
    public final void e(Exception exc) {
        this.a.e(exc);
    }

    @Override // defpackage.foq
    public final void f(fpg fpgVar) {
        try {
            c(fpgVar);
        } catch (DeadObjectException e) {
            d(foq.h(e));
            throw e;
        } catch (RemoteException e2) {
            d(foq.h(e2));
        } catch (RuntimeException e3) {
            e(e3);
        }
    }

    @Override // defpackage.foq
    public void g(ijk ijkVar, boolean z) {
    }
}
