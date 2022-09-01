package defpackage;

import android.content.Context;
import android.util.Printer;
import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: ccp  reason: default package */
/* loaded from: classes.dex */
public final class ccp implements ifw, gvl {
    private final Context a;

    public ccp(Context context) {
        this.a = context;
    }

    @Override // defpackage.gvl
    public final String c() {
        return "blocklist";
    }

    @Override // defpackage.gvl
    public final String d() {
        return "delight5_blocklist";
    }

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    @Override // defpackage.gvl
    public final void e(gvk gvkVar) {
        File[] d = bzw.d(this.a);
        if (d == null) {
            return;
        }
        for (File file : d) {
            gvkVar.b("delight5_blocklist", file.getName(), file);
        }
    }

    @Override // defpackage.gvj
    public final /* synthetic */ boolean f(boolean z, boolean z2) {
        return hgw.h(z, z2);
    }

    @Override // defpackage.gvl
    public final Collection g(Map map) {
        if (map.isEmpty()) {
            return llp.q();
        }
        List b = bzw.b(this.a, map);
        if (!hgw.f(b)) {
            Delight5Facilitator.h(this.a).z();
        }
        return b;
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "Delight5BlocklistBackupProviderModule";
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
    }

    @Override // defpackage.ifw
    public final void gn() {
    }
}
