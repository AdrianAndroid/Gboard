package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* compiled from: PG */
/* renamed from: fxl  reason: default package */
/* loaded from: classes.dex */
public final class fxl extends bkg implements fxm {
    public final String a;
    private final fzo b;
    private final lgh c;
    private final Object d;
    private final fxx e;
    private boolean f;
    private final List g;

    public fxl(String str, fzo fzoVar, lgh lghVar, Object obj, List list, fxx fxxVar) {
        super("com.google.android.gms.learning.dynamite.proxy.IExampleStoreChunkingIterator");
        this.f = false;
        this.a = str;
        this.b = fzoVar;
        this.c = lghVar;
        this.d = obj;
        this.g = list;
        this.e = fxxVar;
        synchronized (obj) {
            list.add(this);
        }
    }

    public final void b() {
        c(bsd.l);
    }

    public final void c(Runnable runnable) {
        synchronized (this.d) {
            if (this.f) {
                runnable.run();
                return;
            }
            try {
                this.b.e();
            } catch (RemoteException | RuntimeException e) {
                Log.w("ExmplStrChkngIterator", "Failed to call close() on app's iterator", e);
                if (e instanceof RuntimeException) {
                    this.e.a(job.IN_APP_EXAMPLE_STORE_ITERATOR_CLOSE_RUNTIME_EXC, this.a);
                }
            }
            this.g.remove(this);
            this.f = true;
            runnable.run();
        }
    }

    @Override // defpackage.fxm
    public final void e(fpo fpoVar) {
        c(new fqa(fpoVar, 3));
    }

    @Override // defpackage.fxm
    public final void f(fxp fxpVar, int i) {
        long a = this.c.a();
        synchronized (this.d) {
            int i2 = 8;
            if (this.f) {
                try {
                    Log.w("ExmplStrChkngIterator", "next() called after close()");
                    fxpVar.f(new Status(8, "next() called after close()"), 0L, this.c.a() - a);
                } catch (RemoteException e) {
                    Log.w("ExmplStrChkngIterator", "Failed to call onIteratorNextFailure on AIDL callback", e);
                }
                return;
            }
            try {
                this.b.f(new fxj(fxpVar, i, this, this.c, a));
            } catch (RemoteException | RuntimeException e2) {
                Log.w("ExmplStrChkngIterator", "Failed to call next() on app's iterator", e2);
                if (e2 instanceof RuntimeException) {
                    this.e.a(job.IN_APP_EXAMPLE_STORE_ITERATOR_NEXT_RUNTIME_EXC, this.a);
                }
                if (true != (e2 instanceof RemoteException)) {
                    i2 = 10;
                }
                try {
                    fxpVar.f(new Status(i2, lgf.a(e2)), 0L, this.c.a() - a);
                } catch (RemoteException e3) {
                    Log.w("ExmplStrChkngIterator", "Failed to call onIteratorNextFailure on AIDL callback", e3);
                }
                b();
            }
            return;
        }
    }

    @Override // defpackage.bkg
    protected final boolean hH(int i, Parcel parcel, Parcel parcel2) {
        fxp fxpVar = null;
        fpo fpoVar = null;
        if (i == 2) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.learning.dynamite.proxy.IExampleStoreChunkingIteratorCallback");
                fxpVar = queryLocalInterface instanceof fxp ? (fxp) queryLocalInterface : new fxn(readStrongBinder);
            }
            int readInt = parcel.readInt();
            bkh.b(parcel);
            f(fxpVar, readInt);
            return true;
        } else if (i != 3) {
            return false;
        } else {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                fpoVar = queryLocalInterface2 instanceof fpo ? (fpo) queryLocalInterface2 : new fpm(readStrongBinder2);
            }
            bkh.b(parcel);
            e(fpoVar);
            return true;
        }
    }

    public fxl() {
        super("com.google.android.gms.learning.dynamite.proxy.IExampleStoreChunkingIterator");
    }
}
