package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: PG */
/* renamed from: fou  reason: default package */
/* loaded from: classes.dex */
public abstract class fou extends BasePendingResult implements fov {
    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fou(fod fodVar) {
        super(fodVar);
        fyb.aH(fodVar, "GoogleApiClient must not be null");
    }

    private final void b(RemoteException remoteException) {
        g(new Status(8, remoteException.getLocalizedMessage(), null));
    }

    protected abstract void c(fnr fnrVar);

    public final void f(fnr fnrVar) {
        try {
            c(fnrVar);
        } catch (DeadObjectException e) {
            b(e);
            throw e;
        } catch (RemoteException e2) {
            b(e2);
        }
    }

    public final void g(Status status) {
        fyb.az(!status.a(), "Failed result must not be success");
        k(a(status));
    }

    @Override // defpackage.fov
    public final /* bridge */ /* synthetic */ void h() {
        throw null;
    }
}
