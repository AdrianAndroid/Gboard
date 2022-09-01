package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* renamed from: foe  reason: default package */
/* loaded from: classes.dex */
public interface foe {
    void a(Status status);
}yk {
    public fyi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.dynamite.training.IInAppTrainingResultCallback");
    }

    @Override // defpackage.fyk
    public final void e(byte[] bArr, int i) {
        Parcel a = a();
        a.writeByteArray(bArr);
        a.writeInt(i);
        hI(6, a);
    }
}
