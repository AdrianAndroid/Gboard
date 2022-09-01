package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* renamed from: fpn  reason: default package */
/* loaded from: classes.dex */
public abstract class fpn extends bkg implements fpo {
    public fpn() {
        super("com.google.android.gms.common.api.internal.IStatusCallback");
    }

    @Override // defpackage.bkg
    protected final boolean hH(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            bkh.b(parcel);
            b((Status) bkh.a(parcel, Status.CREATOR));
            return true;
        }
        return false;
    }
}
