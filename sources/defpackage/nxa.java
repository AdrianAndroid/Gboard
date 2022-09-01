package defpackage;

import android.os.Binder;
import android.os.Parcel;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: nxa  reason: default package */
/* loaded from: classes2.dex */
public final class nxa extends Binder {
    private static final Logger a = Logger.getLogger(nxa.class.getName());
    private nwz b;

    public nxa(nwz nwzVar) {
        this.b = nwzVar;
    }

    public final void a() {
        this.b = null;
    }

    @Override // android.os.Binder
    protected final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        nwz nwzVar = this.b;
        if (nwzVar != null) {
            try {
                return nwzVar.y(i, parcel);
            } catch (RuntimeException e) {
                Logger logger = a;
                Level level = Level.WARNING;
                logger.logp(level, "io.grpc.binder.internal.LeakSafeOneWayBinder", "onTransact", "failure sending transaction " + i, (Throwable) e);
            }
        }
        return false;
    }

    @Override // android.os.Binder, android.os.IBinder
    public final boolean pingBinder() {
        return this.b != null;
    }
}
