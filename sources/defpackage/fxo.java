package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* renamed from: fxo  reason: default package */
/* loaded from: classes.dex */
public final class fxo extends bkg implements fxp {
    public final List a;
    public final AtomicInteger b;
    public final AtomicLong c;
    public mld d;
    public final /* synthetic */ gce e;

    public fxo() {
        super("com.google.android.gms.learning.dynamite.proxy.IExampleStoreChunkingIteratorCallback");
    }

    @Override // defpackage.fxp
    public final void e(byte[] bArr, boolean z, byte[] bArr2, long j, long j2) {
        kdr kdrVar = this.e.b.o;
        if (kdrVar != null) {
            ((AtomicLong) kdrVar.a).addAndGet(((lgh) kdrVar.d).a() - this.c.get());
            ((AtomicLong) this.e.b.o.g).addAndGet(j);
            ((AtomicLong) this.e.b.o.f).addAndGet(j2);
        }
        if (bArr == null) {
            this.d.c(lfc.a(null, null));
            return;
        }
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        if (!z || !this.a.isEmpty()) {
            this.a.add(bArr);
            int addAndGet = this.b.addAndGet(bArr.length);
            if (!z) {
                bArr = null;
            } else {
                bArr = new byte[addAndGet];
                int i = 0;
                for (byte[] bArr3 : this.a) {
                    int length = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr, i, length);
                    i += length;
                }
                this.e.a.set(true);
                this.a.clear();
            }
        }
        if (bArr == null) {
            kdr kdrVar2 = this.e.b.o;
            if (kdrVar2 == null) {
                return;
            }
            this.c.set(((lgh) kdrVar2.d).a());
            return;
        }
        this.d.c(lfc.a(new ijk(nem.u(bArr), bArr2), null));
    }

    @Override // defpackage.fxp
    public final void f(Status status, long j, long j2) {
        kdr kdrVar = this.e.b.o;
        if (kdrVar != null) {
            ((AtomicLong) kdrVar.g).addAndGet(j);
            ((AtomicLong) this.e.b.o.f).addAndGet(j2);
            kdr kdrVar2 = this.e.b.o;
            ((AtomicLong) kdrVar2.a).addAndGet(((lgh) kdrVar2.d).a() - this.c.get());
        }
        this.d.c(lfc.a(null, status));
    }

    @Override // defpackage.bkg
    protected final boolean hH(int i, Parcel parcel, Parcel parcel2) {
        if (i == 3) {
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            bkh.b(parcel);
            f((Status) bkh.a(parcel, Status.CREATOR), readLong, readLong2);
        } else if (i != 4) {
            return false;
        } else {
            byte[] createByteArray = parcel.createByteArray();
            boolean g = bkh.g(parcel);
            byte[] createByteArray2 = parcel.createByteArray();
            long readLong3 = parcel.readLong();
            long readLong4 = parcel.readLong();
            bkh.b(parcel);
            e(createByteArray, g, createByteArray2, readLong3, readLong4);
        }
        parcel2.writeNoException();
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxo(gce gceVar) {
        super("com.google.android.gms.learning.dynamite.proxy.IExampleStoreChunkingIteratorCallback");
        this.e = gceVar;
        this.a = Collections.synchronizedList(new ArrayList());
        this.b = new AtomicInteger(0);
        this.c = new AtomicLong(0L);
    }
}
