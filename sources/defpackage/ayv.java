package defpackage;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* compiled from: PG */
/* renamed from: ayv  reason: default package */
/* loaded from: classes.dex */
public final class ayv implements azo {
    private final /* synthetic */ int a;

    public ayv(int i) {
        this.a = i;
    }

    @Override // defpackage.azo
    public final void c() {
    }

    @Override // defpackage.azo
    public final azn b(azt aztVar) {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                return new azd(new ayu(1), 1);
            }
            if (i == 2) {
                return new ayx();
            }
            if (i == 3) {
                return new azd(aztVar.a(Uri.class, AssetFileDescriptor.class), 3);
            }
            return i != 4 ? new azd(aztVar.a(Uri.class, InputStream.class), 3) : new azd(aztVar.a(Uri.class, ParcelFileDescriptor.class), 3);
        }
        return new azd(new ayu(0), 1);
    }
}
