package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: PG */
/* renamed from: hat  reason: default package */
/* loaded from: classes.dex */
public final class hat implements hbh {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/emoji/data/DefaultStickyPreferencesProtoProvider");
    public static final jan b = jan.b;
    public final File f;
    public final File g;
    public final mkr c = gxo.a(9);
    public final Object e = new Object();
    public final hav d = new hav();

    public hat(Context context) {
        File file = new File(context.getFilesDir(), "emoji");
        this.f = file;
        this.g = new File(file, "sticky_variant_prefs");
    }

    public final void a(hax haxVar) {
        hiz p = hiz.p(new gnq(this, haxVar, 4), this.c);
        afp afpVar = afp.STARTED;
        boolean z = jam.b;
        llk e = llp.e();
        llk e2 = llp.e();
        llk e3 = llp.e();
        e.h(new eii(this, haxVar, 5));
        e2.h(ebj.d);
        p.E(hjg.a(this.c, null, afpVar, z, e, e2, e3));
    }
}
