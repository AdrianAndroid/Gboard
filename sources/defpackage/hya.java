package defpackage;

import android.content.Context;
import android.util.Printer;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.launchericon.LauncherIconVisibilityInitializer;

/* compiled from: PG */
/* renamed from: hya  reason: default package */
/* loaded from: classes.dex */
public final class hya implements ifw {
    private inm a;

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        if (!jam.B()) {
            LauncherIconVisibilityInitializer.a(context);
        }
        if (!LauncherIconVisibilityInitializer.b(context)) {
            this.a = new fdo(context, 11);
            ino.L().X(this.a, R.string.f162530_resource_name_obfuscated_res_0x7f14071e);
        }
    }

    @Override // defpackage.ifw
    public final void gn() {
        if (this.a != null) {
            ino.L().ae(this.a, R.string.f162530_resource_name_obfuscated_res_0x7f14071e);
            this.a = null;
        }
    }
}
