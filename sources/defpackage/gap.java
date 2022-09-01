package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* compiled from: PG */
/* renamed from: gap  reason: default package */
/* loaded from: classes.dex */
public final class gap extends bkf implements gar {
    public gap(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.internal.training.IInAppResultHandler");
    }

    @Override // defpackage.gar
    public final int e() {
        Parcel hG = hG(2, a());
        int readInt = hG.readInt();
        hG.recycle();
        return readInt;
    }

    @Override // defpackage.gar
    public final void f(fwm fwmVar, boolean z, List list, fpo fpoVar) {
        Parcel a = a();
        bkh.d(a, fwmVar);
        bkh.c(a, true);
        a.writeTypedList(list);
        bkh.f(a, fpoVar);
        hJ(3, a);
    }
}
