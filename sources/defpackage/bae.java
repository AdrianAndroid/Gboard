package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;

/* compiled from: PG */
/* renamed from: bae  reason: default package */
/* loaded from: classes.dex */
public final class bae implements azo {
    private final Context a;
    private final Class b;

    public bae(Context context, Class cls) {
        this.a = context;
        this.b = cls;
    }

    @Override // defpackage.azo
    public final azn b(azt aztVar) {
        return new bag(this.a, aztVar.a(File.class, this.b), aztVar.a(Uri.class, this.b), this.b);
    }

    @Override // defpackage.azo
    public final void c() {
    }
}
