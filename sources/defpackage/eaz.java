package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.expression.extension.IEmojiSearchExtension;
import com.google.android.inputmethod.latin.R;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* renamed from: eaz  reason: default package */
/* loaded from: classes.dex */
public final class eaz extends dyu implements IEmojiSearchExtension, htb {
    public static final ltg l = ltg.j("com/google/android/apps/inputmethod/libs/search/emoji/standard/EmojiSearchExtension");
    public boolean m;
    private final hso n;
    private ekn o;
    private cly p;
    private eau q;
    private final dxe r = new dxe();

    public eaz(hso hsoVar) {
        this.n = hsoVar;
    }

    @Override // defpackage.dbn
    protected final ids D() {
        return ctg.EMOJI_SEARCH_EXTENSION_SHOWN_TIME;
    }

    @Override // defpackage.dbn
    protected final String E() {
        return this.c.getString(R.string.f153950_resource_name_obfuscated_res_0x7f140330);
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

    @Override // defpackage.dbn, defpackage.hgb
    public final ids U(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 1) {
                return ctg.EXT_EMOJI_DEACTIVATE;
            }
            if (i2 == 2) {
                return ctg.EXT_EMOJI_KB_ACTIVATE;
            }
            if (i2 != 3) {
                return ctg.EXT_EMOJI_2ND_OR_LATER_STARTUP;
            }
            return ctg.EXT_EMOJI_1ST_STARTUP;
        }
        return ctg.EXT_EMOJI_ACTIVATE;
    }

    @Override // defpackage.dyu
    public final ekn Y() {
        if (this.o == null) {
            this.o = new ekn(this.c, "", hqp.e(), 0);
        }
        return this.o;
    }

    @Override // defpackage.dyu
    protected final String ab() {
        return this.c.getString(R.string.f154940_resource_name_obfuscated_res_0x7f1403a1);
    }

    @Override // defpackage.dyu
    public final String ac() {
        if (cuz.a.i(iin.m(this.n))) {
            return this.c.getString(R.string.f154960_resource_name_obfuscated_res_0x7f1403a3);
        }
        return this.c.getString(R.string.f154950_resource_name_obfuscated_res_0x7f1403a2);
    }

    @Override // defpackage.dyu
    protected final boolean ai() {
        return false;
    }

    @Override // defpackage.dyu
    protected final boolean aj() {
        return this.m;
    }

    @Override // defpackage.dyu, defpackage.dbn, defpackage.hfh
    public final boolean c(hfd hfdVar) {
        if (!this.h) {
            return false;
        }
        iay f = hfdVar.f();
        if (f != null) {
            int i = f.c;
            if (i == -10071) {
                if (this.f == ibz.a) {
                    String str = (String) f.e;
                    if (str == null) {
                        ((ltd) ((ltd) l.c()).k("com/google/android/apps/inputmethod/libs/search/emoji/standard/EmojiSearchExtension", "consumeEvent", 226, "EmojiSearchExtension.java")).t("COMMIT_TEXT_TO_APP received with null text; replaced with \"\"");
                        str = "";
                    }
                    z().x(str);
                }
            } else if (i == -30000) {
                super.c(hfdVar);
                this.g.e(ctd.SEARCH_EMOJI_SEARCHED, eeq.a(f).b);
                return true;
            }
            if (f.c == -10073) {
                Object obj = f.e;
                if (!(obj instanceof Collection)) {
                    ((ltd) l.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/emoji/standard/EmojiSearchExtension", "consumeEvent", 239, "EmojiSearchExtension.java")).w("REQUEST_EMOJI_SEARCH_SUGGESTIONS received with invalid payload: %s", f.e);
                    return true;
                }
                List list = (List) obj;
                hsy hsyVar = this.e;
                if (!(hsyVar instanceof ear)) {
                    ((ltd) l.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/emoji/standard/EmojiSearchExtension", "requestEmojiSearchSuggestions", 255, "EmojiSearchExtension.java")).w("REQUEST_EMOJI_SEARCH_SUGGESTIONS received in non-EmojiDisplay keyboard: %s", hsyVar);
                } else {
                    ((ear) hsyVar).N(this.r.f(list));
                }
                return true;
            }
        }
        return super.c(hfdVar);
    }

    @Override // defpackage.dbn
    protected final int d() {
        return R.xml.f210100_resource_name_obfuscated_res_0x7f170105;
    }

    @Override // defpackage.dbn, defpackage.gzv
    public final String getDumpableTag() {
        return "EmojiSearchExtension";
    }

    @Override // defpackage.dyu, defpackage.dbn, defpackage.ifw
    public final synchronized void gm(Context context, igg iggVar) {
        super.gm(context, iggVar);
        this.p = cly.a(context);
        llp s = llp.s(ibz.d, ibz.a(context.getString(R.string.f154950_resource_name_obfuscated_res_0x7f1403a2)));
        eas easVar = new eas(this, 4);
        eau eauVar = new eau(context, s, this.n);
        eauVar.g = new dbr(eauVar, context, eauVar.c());
        eauVar.f = new dvc(eauVar, easVar, 11);
        hhq.o(eauVar, eauVar.e);
        mks a = gxo.a(6);
        har.b().d(context, a, hdn.instance.h);
        hbj.g(context, a);
        if (!eau.b) {
            eau.b = true;
            if (!jam.s(context) && ((Boolean) eau.a.c()).booleanValue()) {
                gyc.b.execute(new eas(new eat(), 0));
            }
        }
        this.q = eauVar;
    }

    @Override // defpackage.dbn, defpackage.ifw
    public final void gn() {
        eau eauVar = this.q;
        hhq.q(eauVar);
        eauVar.g = null;
        eauVar.f = null;
        super.gn();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dbn
    public final boolean hv() {
        return this.f == ibz.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dbk
    public final CharSequence l() {
        return y().getString(R.string.f150910_resource_name_obfuscated_res_0x7f1401d1);
    }

    @Override // defpackage.dyu, defpackage.dbk, defpackage.dbn, defpackage.hfx
    public final synchronized boolean n(hqt hqtVar, EditorInfo editorInfo, boolean z, Map map, hfl hflVar) {
        clx clxVar;
        int i;
        ltg ltgVar = l;
        ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/search/emoji/standard/EmojiSearchExtension", "onActivate", 129, "EmojiSearchExtension.java")).u("onActivate(): params.size() = %d", map == null ? 0 : map.size());
        Context a = hqtVar.a();
        Locale e = hqp.e();
        if (!this.p.c(e)) {
            this.p.d(true, e, 1);
            cly clyVar = this.p;
            Locale e2 = hqp.e();
            if (clyVar.c(e2)) {
                clxVar = clx.AVAILABLE_ON_DEVICE;
            } else {
                jqm jqmVar = (jqm) clyVar.i.get();
                if (jqmVar == null) {
                    clxVar = clx.MANIFEST_NOT_YET_REGISTERED;
                } else if (TextUtils.equals("bundled_emoji", jqmVar.c())) {
                    clxVar = clx.NOT_YET_DOWNLOADED;
                } else if (cxq.a(clyVar.e, e2, jqmVar.i()) == null) {
                    clxVar = clx.NOT_AVAILABLE_WITH_CURRENT_METADATA;
                } else {
                    clxVar = clx.NOT_YET_DOWNLOADED;
                }
            }
            int ordinal = clxVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2 || ordinal == 3) {
                        i = R.string.f176690_resource_name_obfuscated_res_0x7f140cf0;
                    } else if (ordinal != 4 && ordinal != 5) {
                        i = 0;
                    }
                    ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/search/emoji/standard/EmojiSearchExtension", "syncData", 167, "EmojiSearchExtension.java")).w("Failed with error %s", clxVar);
                    ker.p(a, i, new Object[0]);
                    kcu.U(this.p.d.c("emoji"), new eay(clxVar, 0), gxo.c(11));
                    return false;
                }
            }
            i = R.string.f176700_resource_name_obfuscated_res_0x7f140cf1;
            ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/search/emoji/standard/EmojiSearchExtension", "syncData", 167, "EmojiSearchExtension.java")).w("Failed with error %s", clxVar);
            ker.p(a, i, new Object[0]);
            kcu.U(this.p.d.c("emoji"), new eay(clxVar, 0), gxo.c(11));
            return false;
        }
        this.r.g(a);
        super.n(hqtVar, editorInfo, z, map, hflVar);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dyu, defpackage.dbk, defpackage.dbn
    public final synchronized void r() {
        this.r.h();
        super.r();
        this.o = null;
    }

    @Override // defpackage.htb
    public final boolean s(ibz ibzVar) {
        return this.q.d.contains(ibzVar);
    }

    @Override // defpackage.htb
    public final void t(Context context, hsz hszVar, iav iavVar, ibz ibzVar, String str, jls jlsVar, hta htaVar) {
        eau eauVar = this.q;
        dzk dzkVar = new dzk(this, 6);
        if (eauVar.d()) {
            htaVar.a(ibzVar, null, null);
            return;
        }
        eauVar.d.add(ibzVar);
        eauVar.g.a(context, hszVar, iavVar, ibzVar, str, jlsVar, new csj(dzkVar, htaVar, 2));
    }

    @Override // defpackage.htb
    public final void u(Context context, ibz ibzVar, String str, jls jlsVar) {
        eau eauVar = this.q;
        if (eauVar.d()) {
            return;
        }
        eauVar.g.a(context, null, null, ibzVar, str, jlsVar, null);
    }
}
