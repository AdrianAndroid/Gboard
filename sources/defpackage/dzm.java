package defpackage;

import android.content.Context;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.expression.extension.ContentSuggestionExtension;
import com.google.android.inputmethod.latin.R;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: dzm  reason: default package */
/* loaded from: classes.dex */
public final class dzm extends dbn implements ContentSuggestionExtension, inm, hho {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/search/contentsuggestion/ContentSuggestionExtensionImpl");
    public final dzi i;
    public iqh j;
    public hiz k;
    public hiz l;
    private final dzz o;
    private iqe q;
    private final ino n = ino.M(this.c);
    private final ijj p = new ckp(this, 3);
    public dat m = dat.a;

    public dzm(Context context) {
        dzi a2 = dzi.a(context);
        this.c = context;
        this.i = a2;
        this.o = new dzz(context);
        this.g = ieh.j();
    }

    private final String x() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.c.getResources().getString(R.string.f149760_resource_name_obfuscated_res_0x7f140141));
        if (((Boolean) dzn.o.c()).booleanValue()) {
            sb.append(",");
            sb.append(this.c.getResources().getString(R.string.f149750_resource_name_obfuscated_res_0x7f140140));
        }
        String str = (String) dzn.n.c();
        if (!str.isEmpty()) {
            sb.append(",");
            sb.append(str);
        }
        return sb.toString();
    }

    @Override // defpackage.dbn
    protected final int d() {
        return R.xml.f210080_resource_name_obfuscated_res_0x7f170103;
    }

    public final llp f() {
        return llp.o(ham.n(z().g()));
    }

    @Override // defpackage.dbn
    public final ibz g() {
        return ibz.a(this.c.getString(R.string.f154930_resource_name_obfuscated_res_0x7f14039f));
    }

    @Override // defpackage.hho
    public final void gW(Set set) {
        this.j.h(x());
    }

    @Override // defpackage.dbn, defpackage.ifw
    public final synchronized void gm(Context context, igg iggVar) {
        super.gm(context, iggVar);
        this.n.X(this, R.string.f160760_resource_name_obfuscated_res_0x7f14066c);
        this.q = iqe.e(dzn.b, 2);
        this.j = iqh.e(x());
        hhq.p(this, dzn.n, dzn.o);
        ijl.b().h(this.p, dzu.class, mjl.a);
    }

    @Override // defpackage.dbn, defpackage.ifw
    public final void gn() {
        super.gn();
        this.n.ad(this);
        this.q.close();
        this.j.close();
        hhq.q(this);
        ijl.b().d(this.p, dzu.class);
    }

    @Override // defpackage.inm
    public final void go(ino inoVar, String str) {
        if (!str.equals(this.c.getString(R.string.f160760_resource_name_obfuscated_res_0x7f14066c)) || inoVar.al(this.c.getString(R.string.f160760_resource_name_obfuscated_res_0x7f14066c), true, true)) {
            return;
        }
        cri.b(this.c, "recent_content_suggestion_shared").g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dbn
    public final boolean hv() {
        return true;
    }

    public final void l() {
        hji.h(this.k);
        this.k = null;
        hji.h(this.l);
        this.l = null;
    }

    @Override // defpackage.dbn, defpackage.hfx
    public final synchronized boolean n(hqt hqtVar, EditorInfo editorInfo, boolean z, Map map, hfl hflVar) {
        if (u()) {
            super.n(hqtVar, editorInfo, z, map, hflVar);
            this.o.a();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dbn
    public final synchronized void r() {
        super.r();
        this.o.b();
        this.m = dat.a;
        l();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [hga, hsz] */
    public final boolean u() {
        if (cuz.a.i(this.c) || z().X() || jam.r(this.c)) {
            return false;
        }
        EditorInfo g = z().g();
        if (ham.z(this.q, g)) {
            return ham.r(g, "image/png");
        }
        String str = g.packageName;
        return false;
    }
}
