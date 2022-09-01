package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: PG */
/* renamed from: frl  reason: default package */
/* loaded from: classes.dex */
final class frl implements IInterface {
    public final IBinder a;

    public frl(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
