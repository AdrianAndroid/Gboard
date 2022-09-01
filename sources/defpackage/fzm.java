package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* renamed from: fzm  reason: default package */
/* loaded from: classes.dex */
public final class fzm extends bkf implements fzo {
    public fzm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.internal.IExampleStoreIteratorV2");
    }

    @Override // defpackage.fzo
    public final void e() {
        hI(4, a());
    }

    @Override // defpackage.fzo
    public final void f(fzl fzlVar) {
        Parcel a = a();
        bkh.f(a, fzlVar);
        hI(2, a);
    }
}
