package defpackage;

import android.content.Context;
import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.keyboard.impl.Keyboard;
import j$.util.Collection$EL;
import j$.util.Objects;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: dzl  reason: default package */
/* loaded from: classes.dex */
public final class dzl implements AutoCloseable {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/search/contentsuggestion/ContentSuggestionConsumer");
    public static final llw b = llw.n(dzo.RECENTS, mba.RECENTS, dzo.CONTEXTUAL, mba.CONTEXTUAL, dzo.CURATED, mba.CURATED);
    public final Context c;
    public final idk d;
    public final eal g;
    public final cuj h;
    public hix i;
    public bfh j;
    public dat l;
    public Keyboard m;
    public EditorInfo n;
    public final dxs p;
    private final cri q;
    private final crf r;
    private final dzv s;
    public final eqv o = new eqv();
    public final eae k = new eae(dzn.l, gxo.c(1));
    public final int e = ((Long) dzn.j.c()).intValue();
    public final eaj f = new eaj();

    public dzl(Context context, idk idkVar) {
        dxs dxsVar = new dxs((byte[]) null);
        this.p = dxsVar;
        this.c = context;
        this.d = idkVar;
        this.r = new crf(context);
        this.q = cri.b(context, "recent_content_suggestion_shared");
        this.g = new eal(context);
        lls h = llw.h();
        gmi i = cnx.i();
        i.c = dar.p;
        boolean i2 = cuz.a.i(context);
        int i3 = R.layout.f133860_resource_name_obfuscated_res_0x7f0e0054;
        i.n(true != i2 ? R.layout.f133860_resource_name_obfuscated_res_0x7f0e0054 : R.layout.f133870_resource_name_obfuscated_res_0x7f0e0055, new cus(this, 17));
        i.n(R.layout.f134080_resource_name_obfuscated_res_0x7f0e0079, dar.q);
        i.n(true == cuz.a.i(context) ? R.layout.f133870_resource_name_obfuscated_res_0x7f0e0055 : i3, new cus(this, 18));
        i.n(R.layout.f134070_resource_name_obfuscated_res_0x7f0e0078, dar.l);
        i.n(R.layout.f134090_resource_name_obfuscated_res_0x7f0e007a, cut.I(new dzk(context, 1)));
        h.a(dzq.class, i.m());
        cuj f = cnx.f(h, context, null, null);
        this.h = f;
        dzv dzvVar = new dzv(f);
        this.s = dzvVar;
        dxsVar.n(dzvVar, dzvVar);
        this.l = dat.a;
    }

    public static long a(llp llpVar, dzo dzoVar) {
        return Collection$EL.stream(llpVar).filter(new cjx(dzoVar, 9)).count();
    }

    public static void e(Context context) {
        hsk b2 = hsx.b();
        if (b2 != null) {
            ins insVar = new ins(11);
            insVar.b(context, R.string.f162390_resource_name_obfuscated_res_0x7f140710, R.string.f160760_resource_name_obfuscated_res_0x7f14066c);
            b2.aC(insVar);
        }
    }

    private final boolean g() {
        return !this.h.H() && ((dzq) this.h.z(dzq.class, 0)).b() == 2;
    }

    public final void b() {
        this.h.B();
        this.o.c();
        if (this.j != null) {
            hjq.a(this.c).l(this.j);
            this.j = null;
        }
        hix hixVar = this.i;
        if (hixVar != null) {
            hixVar.close();
            this.i = null;
        }
        this.k.a();
    }

    public final void c(dzp dzpVar) {
        if (!g()) {
            return;
        }
        this.h.K(dzq.e(dzpVar));
        idk idkVar = this.d;
        csw cswVar = csw.EMOJI_KITCHEN_MIX_IMPRESSION;
        Object[] objArr = new Object[1];
        EditorInfo editorInfo = this.n;
        objArr[0] = editorInfo != null ? ham.m(editorInfo) : null;
        idkVar.e(cswVar, objArr);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f.close();
        this.p.p(this.s);
    }

    public final void d(Throwable th) {
        mdh mdhVar;
        if (!g()) {
            return;
        }
        Throwable c = th != null ? lgf.c(th) : null;
        this.h.K(dzg.a(ead.b(this.c, c)));
        idk idkVar = this.d;
        csw cswVar = csw.EMOJI_KITCHEN_MIX_ERROR;
        Object[] objArr = new Object[1];
        if (c instanceof NoSuchElementException) {
            mdhVar = mdh.UNSUPPORTED_COMBINATION;
        } else {
            mdhVar = mdh.UNKNOWN_ERROR;
        }
        objArr[0] = mdhVar;
        idkVar.e(cswVar, objArr);
    }

    public final void f(dzp dzpVar, int i) {
        EditorInfo editorInfo = this.n;
        if (editorInfo == null) {
            editorInfo = new EditorInfo();
        }
        if (this.m == null) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/search/contentsuggestion/ContentSuggestionConsumer", "onContentSuggestionClicked", 335, "ContentSuggestionConsumer.java")).t("Keyboard hasn't been set");
            return;
        }
        this.p.q(dzpVar.a);
        crf crfVar = this.r;
        cqz a2 = cra.a();
        a2.b(dzpVar.a);
        a2.c(i);
        a2.a = editorInfo;
        a2.d(this.q);
        Keyboard keyboard = this.m;
        Objects.requireNonNull(keyboard);
        a2.f(new drf(keyboard, 4));
        hiz a3 = crfVar.a(a2.a());
        afp afpVar = afp.STARTED;
        boolean z = jam.b;
        llk e = llp.e();
        llk e2 = llp.e();
        llk e3 = llp.e();
        e.h(new bqx(this, dzpVar, 6));
        a3.E(hjg.a(gyc.b, null, afpVar, z, e, e2, e3));
    }
}
