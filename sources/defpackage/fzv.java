package defpackage;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* renamed from: fzv  reason: default package */
/* loaded from: classes.dex */
public final class fzv extends bkf implements fzx {
    public fzv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.internal.IInAppExampleStoreProxy");
    }

    @Override // defpackage.fzx
    public final void init(ftm ftmVar, fzu fzuVar) {
        Parcel a = a();
        bkh.f(a, ftmVar);
        bkh.f(a, fzuVar);
        hI(1, a);
    }

    @Override // defpackage.fzx
    public final IBinder onBind(Intent intent) {
        Parcel a = a();
        bkh.d(a, intent);
        Parcel hG = hG(3, a);
        IBinder readStrongBinder = hG.readStrongBinder();
        hG.recycle();
        return readStrongBinder;
    }

    @Override // defpackage.fzx
    public final void onDestroy() {
        hI(2, a());
    }

    @Override // defpackage.fzx
    public final void onRebind(Intent intent) {
        Parcel a = a();
        bkh.d(a, intent);
        hI(6, a);
    }

    @Override // defpackage.fzx
    public final void onTrimMemory(int i) {
        Parcel a = a();
        a.writeInt(i);
        hI(4, a);
    }

    @Override // defpackage.fzx
    public final boolean onUnbind(Intent intent) {
        Parcel a = a();
        bkh.d(a, intent);
        Parcel hG = hG(5, a);
        boolean g = bkh.g(hG);
        hG.recycle();
        return g;
    }
}
