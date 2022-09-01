package defpackage;

import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* renamed from: gam  reason: default package */
/* loaded from: classes.dex */
public final class gam extends bkf implements gao {
    public gam(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.internal.training.IInAppJobService");
    }

    @Override // defpackage.gao
    public final boolean init(ftm ftmVar, ftm ftmVar2) {
        Parcel a = a();
        bkh.f(a, ftmVar);
        bkh.f(a, ftmVar2);
        Parcel hG = hG(9, a);
        boolean g = bkh.g(hG);
        hG.recycle();
        return g;
    }

    @Override // defpackage.gao
    public final void onDestroy() {
        hI(2, a());
    }

    @Override // defpackage.gao
    public final void onRebind(Intent intent) {
        Parcel a = a();
        bkh.d(a, intent);
        hI(6, a);
    }

    @Override // defpackage.gao
    public final int onStartCommand(Intent intent, int i, int i2) {
        Parcel a = a();
        bkh.d(a, intent);
        a.writeInt(i);
        a.writeInt(i2);
        Parcel hG = hG(4, a);
        int readInt = hG.readInt();
        hG.recycle();
        return readInt;
    }

    @Override // defpackage.gao
    public final boolean onStartJob(JobParameters jobParameters) {
        Parcel a = a();
        bkh.d(a, jobParameters);
        Parcel hG = hG(7, a);
        boolean g = bkh.g(hG);
        hG.recycle();
        return g;
    }

    @Override // defpackage.gao
    public final boolean onStopJob(JobParameters jobParameters) {
        Parcel a = a();
        bkh.d(a, jobParameters);
        Parcel hG = hG(8, a);
        boolean g = bkh.g(hG);
        hG.recycle();
        return g;
    }

    @Override // defpackage.gao
    public final void onTrimMemory(int i) {
        Parcel a = a();
        a.writeInt(i);
        hI(3, a);
    }

    @Override // defpackage.gao
    public final boolean onUnbind(Intent intent) {
        Parcel a = a();
        bkh.d(a, intent);
        Parcel hG = hG(5, a);
        boolean g = bkh.g(hG);
        hG.recycle();
        return g;
    }
}
