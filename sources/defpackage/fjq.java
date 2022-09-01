package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.enterprise.connectedapps.internal.BundleCallReceiver;
import j$.util.Objects;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* renamed from: fjq  reason: default package */
/* loaded from: classes.dex */
public final class fjq extends bkg implements fjr {
    public final fjm a;
    private final fjn b;
    private final BundleCallReceiver c;

    public fjq(fjn fjnVar, fjm fjmVar) {
        super("com.google.android.enterprise.connectedapps.ICrossProfileCallback");
        this.c = new BundleCallReceiver();
        this.b = fjnVar;
        this.a = fjmVar;
    }

    @Override // defpackage.fjr
    public final void e(long j, int i, byte[] bArr) {
        Bundle preparedCall = this.c.getPreparedCall(j, i, bArr);
        this.b.i(this.a);
        this.a.d.a(preparedCall);
        fjn fjnVar = this.b;
        ScheduledExecutorService scheduledExecutorService = fjnVar.b;
        Objects.requireNonNull(fjnVar);
        scheduledExecutorService.execute(new fci(fjnVar, 18));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fjq fjqVar = (fjq) obj;
            if (this.b.equals(fjqVar.b) && this.a.equals(fjqVar.a)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.fjr
    public final void f(long j, int i, int i2, byte[] bArr) {
        this.c.a(j, i, i2, bArr);
    }

    @Override // defpackage.fjr
    public final void g(long j, int i, byte[] bArr) {
        this.b.i(this.a);
        Bundle preparedCall = this.c.getPreparedCall(j, i, bArr);
        fjo fjoVar = this.a.d;
        fjoVar.c.c(fjoVar.a.a(preparedCall, "result", fjoVar.b));
    }

    @Override // defpackage.fjr
    public final void h(long j, Bundle bundle) {
        this.c.c(j, bundle);
    }

    @Override // defpackage.bkg
    protected final boolean hH(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            long readLong = parcel.readLong();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            byte[] createByteArray = parcel.createByteArray();
            bkh.b(parcel);
            f(readLong, readInt, readInt2, createByteArray);
        } else if (i == 2) {
            long readLong2 = parcel.readLong();
            parcel.readInt();
            bkh.b(parcel);
            h(readLong2, (Bundle) bkh.a(parcel, Bundle.CREATOR));
        } else if (i == 3) {
            long readLong3 = parcel.readLong();
            int readInt3 = parcel.readInt();
            parcel.readInt();
            byte[] createByteArray2 = parcel.createByteArray();
            bkh.b(parcel);
            g(readLong3, readInt3, createByteArray2);
        } else if (i != 4) {
            return false;
        } else {
            long readLong4 = parcel.readLong();
            int readInt4 = parcel.readInt();
            byte[] createByteArray3 = parcel.createByteArray();
            bkh.b(parcel);
            e(readLong4, readInt4, createByteArray3);
        }
        parcel2.writeNoException();
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.a);
    }

    public fjq() {
        super("com.google.android.enterprise.connectedapps.ICrossProfileCallback");
    }
}
