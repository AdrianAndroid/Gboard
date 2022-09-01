package defpackage;

import android.content.Context;
import android.os.Build;

/* compiled from: PG */
/* renamed from: fen  reason: default package */
/* loaded from: classes.dex */
public final class fen {
    public final Context a;
    public final /* synthetic */ feo b;

    public fen(feo feoVar, Context context) {
        this.b = feoVar;
        this.a = context.getApplicationContext();
    }

    public static final boolean a() {
        return Build.VERSION.SDK_INT < 26;
    }
}
