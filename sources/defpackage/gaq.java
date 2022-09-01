package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: gaq  reason: default package */
/* loaded from: classes.dex */
public final class gaq extends bkg implements gar {
    final /* synthetic */ fwp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gaq(fwp fwpVar) {
        super("com.google.android.gms.learning.internal.training.IInAppResultHandler");
        this.a = fwpVar;
    }

    @Override // defpackage.gar
    public final int e() {
        return 1;
    }

    @Override // defpackage.gar
    public final void f(fwm fwmVar, boolean z, List list, fpo fpoVar) {
        this.a.a(fwmVar, z, new fxa(fpoVar));
    }

    @Override // defpackage.bkg
    protected final boolean hH(int i, Parcel parcel, Parcel parcel2) {
        fpo fpmVar;
        if (i == 2) {
            parcel2.writeNoException();
            parcel2.writeInt(1);
        } else if (i != 3) {
            return false;
        } else {
            fwm fwmVar = (fwm) bkh.a(parcel, fwm.CREATOR);
            boolean g = bkh.g(parcel);
            ArrayList createTypedArrayList = parcel.createTypedArrayList(fwf.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                fpmVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                fpmVar = queryLocalInterface instanceof fpo ? (fpo) queryLocalInterface : new fpm(readStrongBinder);
            }
            bkh.b(parcel);
            f(fwmVar, g, createTypedArrayList, fpmVar);
        }
        return true;
    }

    public gaq() {
        super("com.google.android.gms.learning.internal.training.IInAppResultHandler");
    }
}
