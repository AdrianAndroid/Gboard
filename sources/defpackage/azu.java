package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* compiled from: PG */
/* renamed from: azu  reason: default package */
/* loaded from: classes.dex */
public final class azu implements azo {
    private final /* synthetic */ int a;
    private final Object b;

    public azu(int i) {
        this.a = i;
        this.b = new aqq((byte[]) null, (byte[]) null, (byte[]) null);
    }

    public azu(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    public azu(Resources resources, int i) {
        this.a = i;
        this.b = resources;
    }

    @Override // defpackage.azo
    public final void c() {
    }

    @Override // defpackage.azo
    public final azn b(azt aztVar) {
        switch (this.a) {
            case 0:
                return new azv((Resources) this.b, aztVar.a(Uri.class, AssetFileDescriptor.class), 0);
            case 1:
                return new azd((Context) this.b, 2);
            case 2:
                return new azv((Resources) this.b, aztVar.a(Uri.class, ParcelFileDescriptor.class), 0);
            case 3:
                return new azv((Resources) this.b, aztVar.a(Uri.class, InputStream.class), 0);
            case 4:
                return new azv((Resources) this.b, azs.a, 0);
            case 5:
                return new bad((aqq) this.b, null, null);
            case 6:
                return new azd((Context) this.b, 4, (byte[]) null);
            default:
                return new azd((Context) this.b, 5, (char[]) null);
        }
    }
}
