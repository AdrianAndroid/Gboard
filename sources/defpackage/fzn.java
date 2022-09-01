package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;

/* compiled from: PG */
/* renamed from: fzn  reason: default package */
/* loaded from: classes.dex */
public final class fzn extends bkg implements fzo {
    private final fwh a;
    private final lgh b;
    private final Object c;
    private boolean d;

    public fzn(fwh fwhVar, lgh lghVar) {
        super("com.google.android.gms.learning.internal.IExampleStoreIteratorV2");
        this.c = new Object();
        this.d = false;
        this.a = fwhVar;
        this.b = lghVar;
    }

    @Override // defpackage.fzo
    public final void e() {
        synchronized (this.c) {
            if (this.d) {
                Log.w("brella.ExampleStoreSvc", "IExampleStoreIterator.close called more than once");
                return;
            }
            this.d = true;
            this.a.close();
        }
    }

    @Override // defpackage.fzo
    public final void f(fzl fzlVar) {
        jdg.v(fzlVar != null);
        synchronized (this.c) {
            if (this.d) {
                Log.w("brella.ExampleStoreSvc", "IExampleStoreIterator.next called after close");
            } else {
                this.a.b(new fzh(this, fzlVar, this.b));
            }
        }
    }

    @Override // defpackage.bkg
    protected final boolean hH(int i, Parcel parcel, Parcel parcel2) {
        fzl fzjVar;
        if (i == 2) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                fzjVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.learning.internal.IExampleStoreIteratorCallbackV2");
                fzjVar = queryLocalInterface instanceof fzl ? (fzl) queryLocalInterface : new fzj(readStrongBinder);
            }
            bkh.b(parcel);
            f(fzjVar);
        } else if (i == 3) {
            int readInt = parcel.readInt();
            bkh.b(parcel);
            synchronized (this.c) {
                if (this.d) {
                    Log.w("brella.ExampleStoreSvc", "IExampleStoreIterator.request called after close");
                } else {
                    this.a.c(readInt);
                }
            }
        } else if (i != 4) {
            return false;
        } else {
            e();
        }
        parcel2.writeNoException();
        return true;
    }

    public fzn() {
        super("com.google.android.gms.learning.internal.IExampleStoreIteratorV2");
    }
}
