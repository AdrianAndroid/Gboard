package defpackage;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* renamed from: gay  reason: default package */
/* loaded from: classes.dex */
public final class gay extends bkf implements gba {
    public gay(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.internal.training.IInAppTrainingService");
    }

    @Override // defpackage.gba
    public final void addHttpUrlConnectionFactory(String str, gal galVar) {
        Parcel a = a();
        a.writeString("cronet");
        bkh.f(a, galVar);
        hI(9, a);
    }

    @Override // defpackage.gba
    public final IBinder onBind(Intent intent) {
        Parcel a = a();
        bkh.d(a, intent);
        Parcel hG = hG(3, a);
        IBinder readStrongBinder = hG.readStrongBinder();
        hG.recycle();
        return readStrongBinder;
    }

    @Override // defpackage.gba
    public final void onCreate(ftm ftmVar) {
        Parcel a = a();
        bkh.f(a, ftmVar);
        hI(1, a);
    }

    @Override // defpackage.gba
    public final void onDestroy() {
        hI(2, a());
    }

    @Override // defpackage.gba
    public final void onRebind(Intent intent) {
        Parcel a = a();
        bkh.d(a, intent);
        hI(7, a);
    }

    @Override // defpackage.gba
    public final int onStartCommand(Intent intent, int i, int i2) {
        Parcel a = a();
        bkh.d(a, intent);
        a.writeInt(i);
        a.writeInt(i2);
        Parcel hG = hG(5, a);
        int readInt = hG.readInt();
        hG.recycle();
        return readInt;
    }

    @Override // defpackage.gba
    public final void onTrimMemory(int i) {
        Parcel a = a();
        a.writeInt(i);
        hI(4, a);
    }

    @Override // defpackage.gba
    public final boolean onUnbind(Intent intent) {
        Parcel a = a();
        bkh.d(a, intent);
        Parcel hG = hG(6, a);
        boolean g = bkh.g(hG);
        hG.recycle();
        return g;
    }

    @Override // defpackage.gba
    public final void setPRFSdkImpl() {
        throw null;
    }
}
