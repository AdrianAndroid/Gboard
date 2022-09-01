package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: lbl  reason: default package */
/* loaded from: classes.dex */
public class lbl extends bkg implements IInterface {
    final /* synthetic */ lbg a;
    public final fxa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lbl(lbg lbgVar, fxa fxaVar, byte[] bArr) {
        super("com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
        this.a = lbgVar;
        this.b = fxaVar;
    }

    public void b(Bundle bundle) {
        this.a.b.f(this.b);
        lbg.c.g("onDeferredInstall", new Object[0]);
    }

    public void c(int i, Bundle bundle) {
        this.a.b.f(this.b);
        lbg.c.g("onStartInstall(%d)", Integer.valueOf(i));
    }

    @Override // defpackage.bkg
    protected final boolean hH(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                bkh.b(parcel);
                c(parcel.readInt(), (Bundle) bkh.a(parcel, Bundle.CREATOR));
                break;
            case 3:
                int readInt = parcel.readInt();
                Bundle bundle = (Bundle) bkh.a(parcel, Bundle.CREATOR);
                bkh.b(parcel);
                this.a.b.f(this.b);
                lbg.c.g("onCompleteInstall(%d)", Integer.valueOf(readInt));
                break;
            case 4:
                int readInt2 = parcel.readInt();
                Bundle bundle2 = (Bundle) bkh.a(parcel, Bundle.CREATOR);
                bkh.b(parcel);
                this.a.b.f(this.b);
                lbg.c.g("onCancelInstall(%d)", Integer.valueOf(readInt2));
                break;
            case 5:
                int readInt3 = parcel.readInt();
                Bundle bundle3 = (Bundle) bkh.a(parcel, Bundle.CREATOR);
                bkh.b(parcel);
                this.a.b.f(this.b);
                lbg.c.g("onGetSession(%d)", Integer.valueOf(readInt3));
                break;
            case 6:
                bkh.b(parcel);
                this.a.b.f(this.b);
                int i2 = ((Bundle) bkh.a(parcel, Bundle.CREATOR)).getInt("error_code");
                lbg.c.e("onError(%d)", Integer.valueOf(i2));
                this.b.e(new lau(i2));
                break;
            case 7:
                parcel.createTypedArrayList(Bundle.CREATOR);
                bkh.b(parcel);
                this.a.b.f(this.b);
                lbg.c.g("onGetSessionStates", new Object[0]);
                break;
            case 8:
                Bundle bundle4 = (Bundle) bkh.a(parcel, Bundle.CREATOR);
                bkh.b(parcel);
                this.a.b.f(this.b);
                lbg.c.g("onDeferredUninstall", new Object[0]);
                break;
            case 9:
                bkh.b(parcel);
                b((Bundle) bkh.a(parcel, Bundle.CREATOR));
                break;
            case 10:
                Bundle bundle5 = (Bundle) bkh.a(parcel, Bundle.CREATOR);
                bkh.b(parcel);
                this.a.b.f(this.b);
                lbg.c.g("onGetSplitsForAppUpdate", new Object[0]);
                break;
            case 11:
                Bundle bundle6 = (Bundle) bkh.a(parcel, Bundle.CREATOR);
                bkh.b(parcel);
                this.a.b.f(this.b);
                lbg.c.g("onCompleteInstallForAppUpdate", new Object[0]);
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Bundle bundle7 = (Bundle) bkh.a(parcel, Bundle.CREATOR);
                bkh.b(parcel);
                this.a.b.f(this.b);
                lbg.c.g("onDeferredLanguageInstall", new Object[0]);
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Bundle bundle8 = (Bundle) bkh.a(parcel, Bundle.CREATOR);
                bkh.b(parcel);
                this.a.b.f(this.b);
                lbg.c.g("onDeferredLanguageUninstall", new Object[0]);
                break;
            default:
                return false;
        }
        return true;
    }
}
