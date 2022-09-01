package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.enterprise.connectedapps.CrossProfileConnector_Service;
import com.google.android.enterprise.connectedapps.internal.BundleCallReceiver;
import java.util.Arrays;
import java.util.Map;

/* compiled from: PG */
/* renamed from: fjt  reason: default package */
/* loaded from: classes.dex */
public final class fjt extends bkg implements fju {
    final /* synthetic */ CrossProfileConnector_Service a;
    private final dxe b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fjt(CrossProfileConnector_Service crossProfileConnector_Service) {
        super("com.google.android.enterprise.connectedapps.ICrossProfileService");
        this.a = crossProfileConnector_Service;
        this.b = new dxe((byte[]) null);
    }

    @Override // defpackage.fju
    public final void e(long j, int i, int i2, byte[] bArr) {
        dxe dxeVar = this.b;
        this.a.getApplicationContext();
        ((BundleCallReceiver) dxeVar.a).a(j, i, i2, bArr);
    }

    @Override // defpackage.fju
    public final byte[] f(long j, int i, long j2, int i2, byte[] bArr, fjr fjrVar) {
        return this.b.j(this.a.getApplicationContext(), j, i, j2, i2, bArr, fjrVar);
    }

    @Override // defpackage.fju
    public final byte[] g(long j, int i) {
        double d;
        dxe dxeVar = this.b;
        this.a.getApplicationContext();
        BundleCallReceiver bundleCallReceiver = (BundleCallReceiver) dxeVar.a;
        Map map = bundleCallReceiver.a;
        Long valueOf = Long.valueOf(j);
        byte[] bArr = (byte[]) map.get(valueOf);
        int length = bArr.length;
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i * 250000, Math.min(length, (i + 1) * 250000));
        Double.isNaN(length);
        if (i == ((int) Math.ceil(d / 250000.0d)) - 1) {
            bundleCallReceiver.a.remove(valueOf);
        }
        return copyOfRange;
    }

    @Override // defpackage.fju
    public final Bundle h(long j) {
        dxe dxeVar = this.b;
        this.a.getApplicationContext();
        return (Bundle) ((BundleCallReceiver) dxeVar.a).b.remove(Long.valueOf(j));
    }

    @Override // defpackage.bkg
    protected final boolean hH(int i, Parcel parcel, Parcel parcel2) {
        fjr fjpVar;
        if (i == 1) {
            long readLong = parcel.readLong();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            byte[] createByteArray = parcel.createByteArray();
            bkh.b(parcel);
            e(readLong, readInt, readInt2, createByteArray);
            parcel2.writeNoException();
        } else if (i == 2) {
            long readLong2 = parcel.readLong();
            parcel.readInt();
            bkh.b(parcel);
            i(readLong2, (Bundle) bkh.a(parcel, Bundle.CREATOR));
            parcel2.writeNoException();
        } else if (i == 3) {
            long readLong3 = parcel.readLong();
            int readInt3 = parcel.readInt();
            long readLong4 = parcel.readLong();
            int readInt4 = parcel.readInt();
            byte[] createByteArray2 = parcel.createByteArray();
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                fjpVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.enterprise.connectedapps.ICrossProfileCallback");
                fjpVar = queryLocalInterface instanceof fjr ? (fjr) queryLocalInterface : new fjp(readStrongBinder);
            }
            bkh.b(parcel);
            byte[] f = f(readLong3, readInt3, readLong4, readInt4, createByteArray2, fjpVar);
            parcel2.writeNoException();
            parcel2.writeByteArray(f);
        } else if (i == 4) {
            long readLong5 = parcel.readLong();
            int readInt5 = parcel.readInt();
            bkh.b(parcel);
            byte[] g = g(readLong5, readInt5);
            parcel2.writeNoException();
            parcel2.writeByteArray(g);
        } else if (i != 5) {
            return false;
        } else {
            long readLong6 = parcel.readLong();
            parcel.readInt();
            bkh.b(parcel);
            Bundle h = h(readLong6);
            parcel2.writeNoException();
            bkh.e(parcel2, h);
        }
        return true;
    }

    @Override // defpackage.fju
    public final void i(long j, Bundle bundle) {
        dxe dxeVar = this.b;
        this.a.getApplicationContext();
        ((BundleCallReceiver) dxeVar.a).c(j, bundle);
    }

    public fjt() {
        super("com.google.android.enterprise.connectedapps.ICrossProfileService");
    }
}
