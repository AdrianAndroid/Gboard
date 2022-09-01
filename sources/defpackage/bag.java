package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;

/* compiled from: PG */
/* renamed from: bag  reason: default package */
/* loaded from: classes.dex */
public final class bag implements azn {
    private final Context a;
    private final azn b;
    private final azn c;
    private final Class d;

    public bag(Context context, azn aznVar, azn aznVar2, Class cls) {
        this.a = context.getApplicationContext();
        this.b = aznVar;
        this.c = aznVar2;
        this.d = cls;
    }

    @Override // defpackage.azn
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && cf.d((Uri) obj);
    }

    @Override // defpackage.azn
    public final /* bridge */ /* synthetic */ fws b(Object obj, int i, int i2, ava avaVar) {
        Uri uri = (Uri) obj;
        return new fws(new bfu(uri), new baf(this.a, this.b, this.c, uri, i, i2, avaVar, this.d));
    }
}
