package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* renamed from: fxr  reason: default package */
/* loaded from: classes.dex */
public final class fxr extends bkg implements fxs {
    final /* synthetic */ long a;
    final /* synthetic */ mld b;
    final /* synthetic */ gcf c;

    public fxr() {
        super("com.google.android.gms.learning.dynamite.proxy.IExampleStoreChunkingQueryCallback");
    }

    @Override // defpackage.fxs
    public final void e(Status status, long j, long j2) {
        kdr kdrVar = this.c.o;
        if (kdrVar != null) {
            ((AtomicLong) kdrVar.a).addAndGet(((lgh) kdrVar.d).a() - this.a);
            ((AtomicLong) this.c.o.g).addAndGet(j);
            ((AtomicLong) this.c.o.f).addAndGet(j2);
        }
        this.c.c.h("Could not acquire iterator: ".concat(String.valueOf(String.valueOf(status))));
        this.b.c(lfc.a(null, status));
    }

    @Override // defpackage.fxs
    public final void f(fxm fxmVar, long j, long j2) {
        kdr kdrVar = this.c.o;
        if (kdrVar != null) {
            ((AtomicLong) kdrVar.a).addAndGet(((lgh) kdrVar.d).a() - this.a);
            ((AtomicLong) this.c.o.g).addAndGet(j);
            ((AtomicLong) this.c.o.f).addAndGet(j2);
        }
        this.b.c(lfc.a(fxmVar, null));
    }

    @Override // defpackage.bkg
    protected final boolean hH(int i, Parcel parcel, Parcel parcel2) {
        fxk fxkVar;
        fxm fxmVar;
        if (i == 2) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                fxmVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.learning.dynamite.proxy.IExampleStoreChunkingIterator");
                if (queryLocalInterface instanceof fxm) {
                    fxmVar = (fxm) queryLocalInterface;
                } else {
                    fxkVar = new fxk(readStrongBinder);
                    long readLong = parcel.readLong();
                    long readLong2 = parcel.readLong();
                    bkh.b(parcel);
                    f(fxkVar, readLong, readLong2);
                }
            }
            fxkVar = fxmVar;
            long readLong3 = parcel.readLong();
            long readLong22 = parcel.readLong();
            bkh.b(parcel);
            f(fxkVar, readLong3, readLong22);
        } else if (i != 3) {
            return false;
        } else {
            long readLong4 = parcel.readLong();
            long readLong5 = parcel.readLong();
            bkh.b(parcel);
            e((Status) bkh.a(parcel, Status.CREATOR), readLong4, readLong5);
        }
        parcel2.writeNoException();
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxr(gcf gcfVar, long j, mld mldVar) {
        super("com.google.android.gms.learning.dynamite.proxy.IExampleStoreChunkingQueryCallback");
        this.c = gcfVar;
        this.a = j;
        this.b = mldVar;
    }
}
