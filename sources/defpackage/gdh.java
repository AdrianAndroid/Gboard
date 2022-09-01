package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.util.Pair;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* renamed from: gdh  reason: default package */
/* loaded from: classes.dex */
public final class gdh extends fnz {
    static {
        Pair.create(new gni(), gni.e(null));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public gdh(Context context) {
        super(context, gdd.a, fnv.a, fny.a, null, null, null, null);
    }

    public final gen a(String str) {
        fqf b = fqg.b();
        b.a = new flc(str, 6);
        return g(b.a());
    }

    public final gen b(String str, String str2, String str3) {
        fqf b = fqg.b();
        b.a = new gdf(str, str2, str3, 0);
        return g(b.a());
    }

    public final gen c(final String str, final int i, final String[] strArr, final byte[] bArr) {
        fqf b = fqg.b();
        b.a = new fpz() { // from class: gde
            @Override // defpackage.fpz
            public final void a(Object obj, Object obj2) {
                String str2 = str;
                int i2 = i;
                String[] strArr2 = strArr;
                byte[] bArr2 = bArr;
                gdo gdoVar = new gdo((fxa) obj2, 1, null, null);
                gdi gdiVar = (gdi) ((gdj) obj).w();
                Parcel a = gdiVar.a();
                bkh.f(a, gdoVar);
                a.writeString(str2);
                a.writeInt(i2);
                a.writeStringArray(strArr2);
                a.writeByteArray(bArr2);
                gdiVar.hI(1, a);
            }
        };
        return g(b.a());
    }

    public final gen d(final String str) {
        if (fmy.d.f(this.b, 12451000) != 0) {
            return gni.d(new fnx(new Status(16)));
        }
        fqf b = fqg.b();
        b.a = new fpz() { // from class: gdg
            public final /* synthetic */ String b = "";

            @Override // defpackage.fpz
            public final void a(Object obj, Object obj2) {
                String str2 = str;
                String str3 = this.b;
                gdo gdoVar = new gdo((fxa) obj2, 1, null, null);
                ((gdi) ((gdj) obj).w()).e(gdoVar, "CURRENT:" + str3 + ":" + str2);
            }
        };
        return g(b.a());
    }
}
