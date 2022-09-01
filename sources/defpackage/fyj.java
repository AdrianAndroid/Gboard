package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* renamed from: fyj  reason: default package */
/* loaded from: classes.dex */
public abstract class fyj extends bkg implements fyk {
    public fyj() {
        super("com.google.android.gms.learning.dynamite.training.IInAppTrainingResultCallback");
    }

    @Override // defpackage.bkg
    protected final boolean hH(int i, Parcel parcel, Parcel parcel2) {
        if (i == 6) {
            byte[] createByteArray = parcel.createByteArray();
            int readInt = parcel.readInt();
            bkh.b(parcel);
            e(createByteArray, readInt);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
