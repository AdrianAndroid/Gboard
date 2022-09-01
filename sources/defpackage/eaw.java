package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.inputmethod.libs.expression.extension.ContentSuggestionExtension;
import com.google.android.apps.inputmethod.libs.expression.extension.IEmojiSearchExtension;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;

/* compiled from: PG */
/* renamed from: eaw  reason: default package */
/* loaded from: classes.dex */
public final class eaw {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/search/emoji/standard/EmojiPickerKeyboardCommon");
    private final hsz b;
    private final Context c;
    private final cpu d;
    private final idk e;
    private dyz g;
    private ino h;
    private ean i;
    private dxe k;
    private boolean j = false;
    private final iqi f = iqi.m(ean.d, 3);

    public eaw(hsz hszVar, Context context) {
        cpu cpuVar = cqh.a().b;
        ieh j = ieh.j();
        this.b = hszVar;
        this.c = context;
        this.d = cpuVar;
        this.e = j;
    }

    private final void i() {
        idk idkVar = this.e;
        ctd ctdVar = ctd.IMPRESSION;
        Object[] objArr = new Object[1];
        nfh t = mbc.p.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbc mbcVar = (mbc) t.b;
        mbcVar.b = 1;
        mbcVar.a |= 1;
        mbc mbcVar2 = (mbc) t.b;
        mbcVar2.c = 1;
        mbcVar2.a |= 2;
        nfh t2 = mbt.e.t();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mbt mbtVar = (mbt) t2.b;
        mbtVar.c = 15;
        mbtVar.a |= 2;
        t.dM(t2);
        objArr[0] = t.cz();
        idkVar.e(ctdVar, objArr);
    }

    public final hby a(SoftKeyboardView softKeyboardView) {
        int integer;
        int integer2;
        hbx a2 = hby.a();
        a2.d();
        if (!((Boolean) cvb.l.c()).booleanValue() || softKeyboardView == null) {
            if (cuz.a.c(this.c)) {
                integer = this.c.getResources().getInteger(R.integer.f132790_resource_name_obfuscated_res_0x7f0c0139);
            } else {
                integer = this.c.getResources().getInteger(R.integer.f131250_resource_name_obfuscated_res_0x7f0c0024);
            }
            a2.g(integer / 10.0f);
        } else {
            float a3 = softKeyboardView.a();
            ino inoVar = this.h;
            float f = 1.0f;
            if (inoVar != null) {
                f = inoVar.A(R.string.f161550_resource_name_obfuscated_res_0x7f1406bc, 1.0f);
            }
            int dimension = (int) (this.c.getResources().getDimension(R.dimen.f33090_resource_name_obfuscated_res_0x7f07010d) * f);
            if (cuz.a.c(this.c)) {
                integer2 = this.c.getResources().getInteger(R.integer.f132800_resource_name_obfuscated_res_0x7f0c013a);
            } else {
                integer2 = this.c.getResources().getInteger(R.integer.f132260_resource_name_obfuscated_res_0x7f0c00b8);
            }
            ean eanVar = this.i;
            int i = eanVar != null ? eanVar.g : 9;
            a2.b(i);
            a2.f(dimension);
            a2.c(integer2 * i);
            a2.e(i * ((int) Math.ceil(a3 / dimension)));
        }
        return a2.a();
    }

    public final hck b() {
        llp g;
        this.k = (!((Boolean) ean.c.c()).booleanValue() || !this.f.l() || !irs.d()) ? null : new dxe(this.c, null, null);
        hcj a2 = hck.a();
        if (!((Boolean) cvb.j.c()).booleanValue()) {
            g = llp.r(new eap(this.c, 0));
        } else if (!((Boolean) cvb.k.c()).booleanValue()) {
            g = llp.r(new eap(this.c, 1, null));
        } else {
            llk e = llp.e();
            if (((aia) new dxe(this.c, (byte[]) null).a).b("pref_key_active_emoji_recent_category", 1) != 1) {
                e.h(new eap(this.c, 1, null));
                e.h(new eap(this.c, 0));
            } else {
                e.h(new eap(this.c, 0));
                e.h(new eap(this.c, 1, null));
            }
            g = e.g();
        }
        a2.a = g;
        a2.d = this.k;
        a2.b(irs.d());
        return a2.a();
    }

    public final void c(ino inoVar, ean eanVar, View view) {
        this.h = inoVar;
        this.i = eanVar;
        if (view == null) {
            ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/search/emoji/standard/EmojiPickerKeyboardCommon", "prepareAndRunCorpusChangeAnimation", 169, "EmojiPickerKeyboardCommon.java")).t("Container view is null, cannot run corpus selector animation.");
        } else {
            if (this.g == null) {
                this.g = new dyx(this.c);
            }
            this.g.a(view, R.id.key_pos_non_prime_category_1);
        }
        inoVar.j("PREF_LAST_ACTIVE_TAB", IEmojiSearchExtension.class.getName());
        this.b.z(hfd.d(new iay(-10105, null, ContentSuggestionExtension.class)));
    }

    public final void d(hci hciVar, hei heiVar, boolean z, boolean z2, String str) {
        hsz hszVar = this.b;
        if (hszVar == null || hciVar == null) {
            return;
        }
        hszVar.z(hfd.d(new iay(-10027, iax.COMMIT, heiVar.b)));
        int i = heiVar.d;
        int a2 = hciVar.a(i);
        mba h = h(hciVar, i);
        nfh t = mdl.h.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mdl mdlVar = (mdl) t.b;
        mdlVar.b = 1;
        int i2 = mdlVar.a | 1;
        mdlVar.a = i2;
        mdlVar.a = i2 | 4;
        mdlVar.d = z;
        nfh t2 = mbc.p.t();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mbc mbcVar = (mbc) t2.b;
        mbcVar.b = 1;
        mbcVar.a |= 1;
        mdl mdlVar2 = (mdl) t.cz();
        mdlVar2.getClass();
        mbcVar.k = mdlVar2;
        mbcVar.a |= 2048;
        if (z2 && str != null) {
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            mbc mbcVar2 = (mbc) t2.b;
            mbcVar2.c = 2;
            int i3 = mbcVar2.a | 2;
            mbcVar2.a = i3;
            mbcVar2.a = i3 | 1024;
            mbcVar2.j = str;
        } else {
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            mbc mbcVar3 = (mbc) t2.b;
            mbcVar3.c = 1;
            mbcVar3.a |= 2;
        }
        nfh t3 = mbb.g.t();
        if (t3.c) {
            t3.cD();
            t3.c = false;
        }
        mbb mbbVar = (mbb) t3.b;
        int i4 = mbbVar.a | 4;
        mbbVar.a = i4;
        mbbVar.d = a2;
        mbbVar.e = h.e;
        mbbVar.a = i4 | 8;
        if (h == mba.CONTEXTUAL) {
            int i5 = heiVar.c;
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mdl mdlVar3 = (mdl) t.b;
            mdlVar3.a |= 2;
            mdlVar3.c = i5;
            int i6 = heiVar.e;
            if (t3.c) {
                t3.cD();
                t3.c = false;
            }
            mbb mbbVar2 = (mbb) t3.b;
            mbbVar2.a |= 16;
            mbbVar2.f = i6;
        }
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mbc mbcVar4 = (mbc) t2.b;
        mbb mbbVar3 = (mbb) t3.cz();
        mbbVar3.getClass();
        mbcVar4.e = mbbVar3;
        mbcVar4.a |= 8;
        this.b.hO().e(ctd.EMOJI_OR_TEXT_SHARE, heiVar.b, t2.cz());
        this.d.c(heiVar.b);
    }

    public final void e() {
        i();
        this.j = true;
    }

    public final void f() {
        this.f.close();
        this.b.z(hfd.d(new iay(-10060, null, ContentSuggestionExtension.class)));
    }

    public final void g(hsy hsyVar, int i, int i2, hci hciVar) {
        if (hciVar == null) {
            ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/search/emoji/standard/EmojiPickerKeyboardCommon", "changedActiveCategory", 191, "EmojiPickerKeyboardCommon.java")).t("Emoji picker controller is null");
            return;
        }
        int a2 = hciVar.a(i);
        hsyVar.fp(iby.o, false);
        hsyVar.fp(((Long) iby.K.get(a2)).longValue(), true);
        mba h = h(hciVar, i);
        idk idkVar = this.e;
        ctd ctdVar = ctd.CATEGORY_SWITCH;
        Object[] objArr = new Object[1];
        nfh t = mbc.p.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbc mbcVar = (mbc) t.b;
        mbcVar.b = 1;
        mbcVar.a |= 1;
        mbc mbcVar2 = (mbc) t.b;
        mbcVar2.c = 1;
        mbcVar2.a |= 2;
        nfh t2 = mbb.g.t();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mbb mbbVar = (mbb) t2.b;
        mbbVar.c = i2 - 1;
        int i3 = mbbVar.a | 2;
        mbbVar.a = i3;
        int i4 = i3 | 4;
        mbbVar.a = i4;
        mbbVar.d = a2;
        mbbVar.e = h.e;
        mbbVar.a = i4 | 8;
        mbb mbbVar2 = (mbb) t2.cz();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbc mbcVar3 = (mbc) t.b;
        mbbVar2.getClass();
        mbcVar3.e = mbbVar2;
        mbcVar3.a |= 8;
        objArr[0] = t.cz();
        idkVar.e(ctdVar, objArr);
        if (h != mba.CONTEXTUAL) {
            this.j = false;
        } else if (this.j) {
        } else {
            i();
            this.j = true;
        }
    }

    private static mba h(hci hciVar, int i) {
        if (!hci.k(i)) {
            return (!hciVar.j || hciVar.i != i) ? mba.UNKNOWN : mba.CONTEXTUAL;
        }
        return mba.RECENTS;
    }
}
