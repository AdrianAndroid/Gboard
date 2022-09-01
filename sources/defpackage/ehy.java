package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.expression.extension.IStickerExtension;
import com.google.android.inputmethod.latin.R;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* renamed from: ehy  reason: default package */
/* loaded from: classes.dex */
public final class ehy extends efw implements IStickerExtension {
    private final csi t = ehw.a;
    private final csi u = new ehx(0);
    private final iqi v = iqi.m(o, 3);
    private static final ltg s = ltg.j("com/google/android/apps/inputmethod/libs/search/sticker/StickerExtension");
    static final hhl o = hhq.h("enabled_sticker_search_locales", "ar,de,en,es,fr,hi-Latn,id,it,ja,ko,nl,pl,pt,ru,th,tr,zh-CN,zh-HK,zh-TW");
    public static final hhl p = hhq.a("enable_prioritize_recent_stickers", false);
    public static final hhl q = hhq.a("default_sticker_tab_open_to_featured_pack", false);
    public static final hhl r = hhq.a("add_featured_pack_on_sticker_share", false);

    private final ehs aq() {
        return (ehs) igr.d(this.c).b(ehs.class);
    }

    @Override // defpackage.dbn
    protected final String E() {
        return this.c.getString(R.string.f153970_resource_name_obfuscated_res_0x7f140332);
    }

    @Override // defpackage.dbn
    protected final void L() {
        ehs aq = aq();
        if (aq == null) {
            J();
            return;
        }
        gqt gqtVar = aq.a;
        if (gqtVar == null) {
            return;
        }
        gqtVar.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dbn
    public final void M() {
        super.M();
        if (!((Boolean) iho.a(this.c).c()).booleanValue()) {
            ehs aq = aq();
            if (aq == null) {
                Q();
                return;
            }
            gqt gqtVar = aq.a;
            if (gqtVar == null) {
                return;
            }
            gqtVar.c();
        }
    }

    @Override // defpackage.dyu
    protected final String ac() {
        return this.c.getString(R.string.f155020_resource_name_obfuscated_res_0x7f1403a9);
    }

    @Override // defpackage.efw
    public final int ak() {
        return cuz.a.i(this.c) ? R.xml.f210260_resource_name_obfuscated_res_0x7f170115 : R.xml.f210250_resource_name_obfuscated_res_0x7f170114;
    }

    @Override // defpackage.efw
    protected final csi al() {
        return cuz.a.i(y()) ? this.u : this.t;
    }

    @Override // defpackage.efw
    protected final cwx am(Context context) {
        return cwo.a(context);
    }

    @Override // defpackage.efw
    public final String an() {
        return "sticker_recent_queries_%s";
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
        mbcVar.b = 3;
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
        return cuz.a.i(this.c) ? R.xml.f210240_resource_name_obfuscated_res_0x7f170113 : R.xml.f210230_resource_name_obfuscated_res_0x7f170112;
    }

    @Override // com.google.android.apps.inputmethod.libs.expression.extension.IStickerExtension
    public final boolean f(EditorInfo editorInfo, dba dbaVar) {
        if (editorInfo == null || this.c == null) {
            return false;
        }
        ekm ekmVar = new ekm(editorInfo, ekm.a(this.c.getString(R.string.f155020_resource_name_obfuscated_res_0x7f1403a9), dip.i(hfl.INTERNAL, dbaVar)));
        ekmVar.f = SystemClock.uptimeMillis();
        if (!ekm.c.add(ekmVar)) {
            return true;
        }
        ekmVar.g.g(mjl.a);
        return true;
    }

    @Override // defpackage.dbn, defpackage.gzv
    public final String getDumpableTag() {
        return "StickerExtension";
    }

    @Override // defpackage.efw, defpackage.dbn, defpackage.ifw
    public final void gn() {
        super.gn();
        this.v.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dbk
    public final CharSequence l() {
        return y().getString(R.string.f167260_resource_name_obfuscated_res_0x7f140936);
    }

    @Override // defpackage.dbk, defpackage.dbn
    public final synchronized void w(Map map, hfl hflVar) {
        ap();
        if (!this.v.o()) {
            ((ltd) ((ltd) s.d()).k("com/google/android/apps/inputmethod/libs/search/sticker/StickerExtension", "openExtensionViewInternal", 109, "StickerExtension.java")).G("Search disabled for system (%s) and keyboard (%s) locales", Locale.getDefault(), cuz.m());
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
                return ctg.EXT_STICKER_DEACTIVATE;
            }
            if (i2 == 2) {
                return ctg.EXT_STICKER_KB_ACTIVATE;
            }
            return idf.a;
        }
        return ctg.EXT_STICKER_ACTIVATE;
    }
}
