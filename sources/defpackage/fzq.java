package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: fzq  reason: default package */
/* loaded from: classes.dex */
public final class fzq extends bkg implements fzr {
    private final String a;
    private final fxs b;
    private final AtomicBoolean c;
    private final long d;
    private final lgh e;
    private final Object f;
    private final List g;
    private final fxx h;

    public fzq(String str, fxs fxsVar, long j, lgh lghVar, Object obj, List list, fxx fxxVar) {
        super("com.google.android.gms.learning.internal.IExampleStoreQueryCallbackV2");
        this.c = new AtomicBoolean(false);
        this.a = str;
        this.b = fxsVar;
        this.d = j;
        this.e = lghVar;
        this.f = obj;
        this.g = list;
        this.h = fxxVar;
    }

    @Override // defpackage.fzr
    public final void e(Status status, long j) {
        if (this.c.getAndSet(true)) {
            Log.w("ExmplStrQryCallback", "Ignoring onStartQueryFailure, result already returned!");
            return;
        }
        try {
            this.b.e(status, j, this.e.a() - this.d);
        } catch (RemoteException e) {
            Log.w("ExmplStrQryCallback", "Failed to call onStartQueryFailure on AIDL callback", e);
        }
    }

    @Override // defpackage.fzr
    public final void f(fzo fzoVar, long j) {
        fxl fxlVar;
        if (this.c.getAndSet(true)) {
            Log.w("ExmplStrQryCallback", "Ignoring onStartQuerySuccess, result already returned!");
            return;
        }
        synchronized (this.f) {
            fxlVar = new fxl(this.a, fzoVar, this.e, this.f, this.g, this.h);
        }
        try {
            this.b.f(fxlVar, j, this.e.a() - this.d);
        } catch (RemoteException e) {
            Log.w("ExmplStrQryCallback", "Failed to call onStartQuerySuccess on AIDL callback", e);
            fxlVar.b();
        }
    }

    @Override // defpackage.bkg
    protected final boolean hH(int i, Parcel parcel, Parcel parcel2) {
        fzo fzmVar;
        if (i == 2) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                fzmVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.learning.internal.IExampleStoreIteratorV2");
                fzmVar = queryLocalInterface instanceof fzo ? (fzo) queryLocalInterface : new fzm(readStrongBinder);
            }
            long readLong = parcel.readLong();
            bkh.b(parcel);
            f(fzmVar, readLong);
        } else if (i != 3) {
            return false;
        } else {
            long readLong2 = parcel.readLong();
            bkh.b(parcel);
            e((Status) bkh.a(parcel, Status.CREATOR), readLong2);
        }
        parcel2.writeNoException();
        return true;
    }

    public fzq() {
        super("com.google.android.gms.learning.internal.IExampleStoreQueryCallbackV2");
    }
}
