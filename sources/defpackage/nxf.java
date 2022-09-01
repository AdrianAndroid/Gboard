package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: nxf  reason: default package */
/* loaded from: classes2.dex */
public abstract class nxf {
    public static final Logger a = Logger.getLogger(nxf.class.getName());
    protected final IBinder b;

    public nxf(IBinder iBinder) {
        this.b = iBinder;
    }

    public static nxf b(IBinder iBinder, Executor executor) {
        if (iBinder instanceof Binder) {
            return new nxd(iBinder, executor);
        }
        return new nxe(iBinder);
    }

    public abstract void a(int i, nxj nxjVar);

    public final boolean c(int i, Parcel parcel) {
        try {
            return this.b.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
