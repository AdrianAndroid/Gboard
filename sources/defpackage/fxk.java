package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* renamed from: fxk  reason: default package */
/* loaded from: classes.dex */
public final class fxk extends bkf implements fxm {
    public fxk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.dynamite.proxy.IExampleStoreChunkingIterator");
    }

    @Override // defpackage.fxm
    public final void e(fpo fpoVar) {
        Parcel a = a();
        bkh.f(a, fpoVar);
        hJ(3, a);
    }

    @Override // defpackage.fxm
    public final void f(fxp fxpVar, int i) {
        Parcel a = a();
        bkh.f(a, fxpVar);
        a.writeInt(i);
        hJ(2, a);
    }
}
