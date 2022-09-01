package defpackage;

import android.content.Context;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.expression.extension.IBitmojiExtension;
import com.google.android.inputmethod.latin.R;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* renamed from: efy  reason: default package */
/* loaded from: classes.dex */
public final class efy extends efw implements IBitmojiExtension {
    private final cwf x;
    private static final ltg r = ltg.j("com/google/android/apps/inputmethod/libs/search/sticker/BitmojiExtension");
    public static final hhl o = hhq.a("enable_bitmoji_open_search_box", false);
    private static final hhl s = hhq.a("enable_transformer_model_for_query_suggestion", false);
    public static final hhl p = hhq.f("limit_bitmoji_search_query_suggestion", 1);
    static final hhl q = hhq.h("bitmoji_search_supported_locales", "*");
    private final csi t = ehw.b;
    private final csi u = new ehx(1);
    private final iqi v = iqi.a(q);
    private hiz w = hiz.n(llp.q());
    private final iqi y = iqi.a(cwz.a);

    public efy(Context context) {
        this.x = new cwf(context);
    }

    @Override // defpackage.dbn
    protected final String E() {
        return this.c.getString(R.string.f148320_resource_name_obfuscated_res_0x7f140091);
    }

    @Override // defpackage.dbn
    protected final void L() {
        J();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dbn
    public final void M() {
        super.M();
        if (!((Boolean) iho.a(this.c).c()).booleanValue()) {
            Q();
        }
    }

    @Override // defpackage.dyu
    protected final String ac() {
        return this.c.getString(R.string.f154910_resource_name_obfuscated_res_0x7f14039d);
    }

    @Override // defpackage.efw, defpackage.dyu
    public final List ag() {
        return ffb.j((List) this.w.A(llp.q()), ae(this.l));
    }

    @Override // defpackage.efw
    public final int ak() {
        return cuz.a.i(this.c) ? R.xml.f210060_resource_name_obfuscated_res_0x7f170101 : R.xml.f210050_resource_name_obfuscated_res_0x7f170100;
    }

    @Override // defpackage.efw
    protected final csi al() {
        return cuz.a.i(y()) ? this.u : this.t;
    }

    @Override // defpackage.efw
    protected final cwx am(Context context) {
        return new cvx(context);
    }

    @Override // defpackage.efw
    protected final String an() {
        return "bitmoji_recent_queries_%s";
    }

    @Override // defpackage.efw
    protected final void ao(iay iayVar) {
        String str = eeq.a(iayVar).b;
        idk idkVar = this.g;
        ctd ctdVar = ctd.SEARCH_PERFORMED;
        Object[] objArr = new Object[1];
        nfh t = mbc.p.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbc mbcVar = (mbc) t.b;
        mbcVar.b = 4;
        mbcVar.a = 1 | mbcVar.a;
        mbc mbcVar2 = (mbc) t.b;
        mbcVar2.c = 2;
        int i = 2 | mbcVar2.a;
        mbcVar2.a = i;
        str.getClass();
        mbcVar2.a = i | 1024;
        mbcVar2.j = str;
        objArr[0] = t.cz();
        idkVar.e(ctdVar, objArr);
    }

    @Override // defpackage.dbn
    protected final int d() {
        return cuz.a.i(y()) ? R.xml.f210040_resource_name_obfuscated_res_0x7f1700ff : R.xml.f210030_resource_name_obfuscated_res_0x7f1700fe;
    }

    @Override // defpackage.dbn, defpackage.gzv
    public final String getDumpableTag() {
        return "BitmojiExtension";
    }

    @Override // defpackage.efw, defpackage.dbn, defpackage.ifw
    public final void gn() {
        super.gn();
        this.v.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dbk
    public final CharSequence l() {
        return y().getString(R.string.f148360_resource_name_obfuscated_res_0x7f140095);
    }

    @Override // defpackage.dyu, defpackage.dbk, defpackage.dbn, defpackage.hfx
    public final synchronized boolean n(hqt hqtVar, EditorInfo editorInfo, boolean z, Map map, hfl hflVar) {
        hiz b;
        this.w.cancel(false);
        if (!this.y.l()) {
            this.w = hiz.n(llp.q());
        } else {
            if (((Boolean) s.c()).booleanValue()) {
                b = this.x.a();
            } else {
                b = clr.a().b();
            }
            this.w = b.u(dzr.u, mjl.a);
        }
        super.n(hqtVar, editorInfo, z, map, hflVar);
        return true;
    }

    @Override // defpackage.dbk, defpackage.dbn
    public final synchronized void w(Map map, hfl hflVar) {
        ap();
        if (!this.v.o()) {
            ((ltd) ((ltd) r.d()).k("com/google/android/apps/inputmethod/libs/search/sticker/BitmojiExtension", "openExtensionViewInternal", 130, "BitmojiExtension.java")).G("Search disabled for system (%s) and keyboard (%s) locales", Locale.getDefault(), cuz.m());
            ker.p(y(), R.string.f176710_resource_name_obfuscated_res_0x7f140cf2, new Object[0]);
            return;
        }
        super.w(map, hflVar);
    }

    @Override // defpackage.dbn, defpackage.hgb
    public final ids U(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 1) {
                return ctg.EXT_BITMOJI_DEACTIVATE;
            }
            if (i2 == 2) {
                return ctg.EXT_BITMOJI_KB_ACTIVATE;
            }
            return idf.a;
        }
        return ctg.EXT_BITMOJI_ACTIVATE;
    }
}
