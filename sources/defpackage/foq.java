package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* renamed from: foq  reason: default package */
/* loaded from: classes.dex */
public abstract class foq {
    public final int c;

    public foq(int i) {
        this.c = i;
    }

    public static Status h(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public abstract void d(Status status);

    public abstract void e(Exception exc);

    public abstract void f(fpg fpgVar);

    public abstract void g(ijk ijkVar, boolean z);
}
