package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: PG */
/* renamed from: bu  reason: default package */
/* loaded from: classes.dex */
public final class bu implements IInterface {
    public final IBinder a;

    public bu(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
