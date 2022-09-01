package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: fla  reason: default package */
/* loaded from: classes.dex */
public final class fla extends bkg implements IInterface {
    final /* synthetic */ fxa a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fla(fxa fxaVar, int i, byte[] bArr) {
        super("com.google.android.gms.auth.account.data.IGetTokenWithDetailsCallback");
        this.b = i;
        this.a = fxaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fla(fxa fxaVar, int i, byte[] bArr, byte[] bArr2) {
        super("com.google.android.gms.auth.account.data.IGetAccountsCallback");
        this.b = i;
        this.a = fxaVar;
    }

    @Override // defpackage.bkg
    protected final boolean hH(int i, Parcel parcel, Parcel parcel2) {
        if (this.b == 0) {
            if (i != 2) {
                return false;
            }
            bkh.b(parcel);
            flf.a((Status) bkh.a(parcel, Status.CREATOR), (Bundle) bkh.a(parcel, Bundle.CREATOR), this.a);
            return true;
        } else if (i != 2) {
            return false;
        } else {
            ArrayList createTypedArrayList = parcel.createTypedArrayList(Account.CREATOR);
            bkh.b(parcel);
            flf.a((Status) bkh.a(parcel, Status.CREATOR), createTypedArrayList, this.a);
            return true;
        }
    }
}
