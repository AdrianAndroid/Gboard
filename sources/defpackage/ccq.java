package defpackage;

import android.content.Context;
import android.util.Printer;
import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import com.google.android.inputmethod.latin.R;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: ccq  reason: default package */
/* loaded from: classes.dex */
public final class ccq implements ifw, gvl {
    private final Context a;

    public ccq(Context context) {
        this.a = context;
    }

    @Override // defpackage.gvl
    public final String c() {
        return "user_history";
    }

    @Override // defpackage.gvl
    public final String d() {
        return "delight5_user_history";
    }

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    @Override // defpackage.gvl
    public final void e(gvk gvkVar) {
        Delight5Facilitator.h(this.a).u();
        for (mvm mvmVar : cfm.b(this.a, ino.M(this.a).y(R.string.f160340_resource_name_obfuscated_res_0x7f14063f))) {
            File file = new File(mvmVar.d);
            gvkVar.b("delight5_user_history", file.getName(), file);
        }
    }

    @Override // defpackage.gvj
    public final /* synthetic */ boolean f(boolean z, boolean z2) {
        return hgw.h(z, z2);
    }

    @Override // defpackage.gvl
    public final Collection g(Map map) {
        if (hgw.f(map.entrySet())) {
            return llp.q();
        }
        List d = cfm.d(this.a, map);
        if (!hgw.f(d)) {
            Delight5Facilitator.h(this.a).z();
        }
        return d;
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "Delight5UserHistoryBackupProviderModule";
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
    }

    @Override // defpackage.ifw
    public final void gn() {
    }
}
