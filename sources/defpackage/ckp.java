package defpackage;

import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard;
import com.google.android.apps.inputmethod.libs.search.contentsuggestion.ContentSuggestionKeyboard;

/* compiled from: PG */
/* renamed from: ckp  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ckp implements ijj {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ckp(ckq ckqVar, int i) {
        this.b = i;
        this.a = ckqVar;
    }

    public /* synthetic */ ckp(Delight5Facilitator delight5Facilitator, int i) {
        this.b = i;
        this.a = delight5Facilitator;
    }

    public /* synthetic */ ckp(ContentSuggestionKeyboard contentSuggestionKeyboard, int i) {
        this.b = i;
        this.a = contentSuggestionKeyboard;
    }

    public /* synthetic */ ckp(dcu dcuVar, int i) {
        this.b = i;
        this.a = dcuVar;
    }

    public /* synthetic */ ckp(dzm dzmVar, int i) {
        this.b = i;
        this.a = dzmVar;
    }

    public /* synthetic */ ckp(eac eacVar, int i) {
        this.b = i;
        this.a = eacVar;
    }

    public /* synthetic */ ckp(hxu hxuVar, int i) {
        this.b = i;
        this.a = hxuVar;
    }

    @Override // defpackage.ijj
    public final /* synthetic */ void fe(Class cls) {
    }

    @Override // defpackage.ijj
    public final void fd(ijg ijgVar) {
        switch (this.b) {
            case 0:
                ((ckq) this.a).e.set(((clo) ijgVar).b());
                return;
            case 1:
                Object obj = this.a;
                exp expVar = (exp) ijgVar;
                if (!((Boolean) cas.N.c()).booleanValue()) {
                    return;
                }
                Delight5Facilitator delight5Facilitator = (Delight5Facilitator) obj;
                hji.c(ccd.d(expVar.a, delight5Facilitator.e, delight5Facilitator.b), new bxj(delight5Facilitator, 2), bxl.c, mjl.a);
                return;
            case 2:
                hsv hsvVar = (hsv) ijgVar;
                ((dcu) this.a).C = true;
                return;
            case 3:
                dzu dzuVar = (dzu) ijgVar;
                dzm dzmVar = (dzm) this.a;
                if (!dzmVar.u() || dzuVar.c() != 1 || dzuVar.b().equals(dzmVar.m)) {
                    return;
                }
                dzmVar.m = dzuVar.b();
                dat b = dzuVar.b();
                if (!dzmVar.j.j(b.b)) {
                    dzu.g();
                    return;
                }
                dzmVar.l();
                dzu.f();
                lfb lfbVar = b.c;
                if (lfbVar.e() && dzmVar.j.j((String) lfbVar.a())) {
                    dzmVar.l = dzmVar.i.b(b.d(), dzmVar.f()).u(dar.r, mjl.a).u(dar.s, mjl.a);
                }
                hiz u = dzmVar.i.b(b.b, dzmVar.f()).u(dar.t, mjl.a);
                afp afpVar = afp.DESTROYED;
                boolean z = jam.b;
                llk e = llp.e();
                llk e2 = llp.e();
                llk e3 = llp.e();
                e.h(new bqx(dzmVar, b, 7));
                e2.h(new bqx(dzmVar, b, 8));
                hsy hsyVar = dzmVar.e;
                u.E(hjg.a(gyc.b, hsyVar instanceof afv ? (afv) hsyVar : null, afp.CREATED, z, e, e2, e3));
                dzmVar.k = u;
                return;
            case 4:
                Object obj2 = this.a;
                dzu dzuVar2 = (dzu) ijgVar;
                mdi mdiVar = mdi.UNKNOWN;
                int c = dzuVar2.c() - 1;
                if (c == 1) {
                    ((ContentSuggestionKeyboard) obj2).l(mdi.NO_SUGGESTIONS_ERROR);
                    return;
                } else if (c != 2) {
                    if (c != 3) {
                        return;
                    }
                    ((ContentSuggestionKeyboard) obj2).l(mdi.INTERSTITIAL);
                    return;
                } else {
                    ContentSuggestionKeyboard contentSuggestionKeyboard = (ContentSuggestionKeyboard) obj2;
                    contentSuggestionKeyboard.h = dzuVar2.b();
                    contentSuggestionKeyboard.l(mdi.RETRYABLE_ERROR);
                    return;
                }
            case 5:
                cun cunVar = (cun) ijgVar;
                ContentSuggestionKeyboard contentSuggestionKeyboard2 = (ContentSuggestionKeyboard) this.a;
                if (contentSuggestionKeyboard2.e.get() != mdi.INTERSTITIAL && contentSuggestionKeyboard2.e.get() != mdi.ZERO) {
                    return;
                }
                if (cunVar.a == 0) {
                    contentSuggestionKeyboard2.l(mdi.RETRYABLE_ERROR);
                } else {
                    contentSuggestionKeyboard2.l(mdi.DISPLAY_CONTENT);
                }
                contentSuggestionKeyboard2.c.e(csw.RICH_CONTENT_SUGGESTION_IMAGES_LOADED, Integer.valueOf(cunVar.a), Integer.valueOf(cunVar.b));
                return;
            case 6:
                Object obj3 = this.a;
                dzu dzuVar3 = (dzu) ijgVar;
                mdi mdiVar2 = mdi.UNKNOWN;
                int c2 = dzuVar3.c() - 1;
                if (c2 != 0) {
                    if (c2 == 1) {
                        ((eac) obj3).a(mdi.NO_SUGGESTIONS_ERROR);
                        return;
                    } else if (c2 != 2) {
                        ((eac) obj3).a(mdi.INTERSTITIAL);
                        return;
                    } else {
                        eac eacVar = (eac) obj3;
                        eacVar.g(dzuVar3.b());
                        eacVar.a(mdi.RETRYABLE_ERROR);
                        return;
                    }
                }
                eac eacVar2 = (eac) obj3;
                LifecycleKeyboard lifecycleKeyboard = eacVar2.e;
                if (lifecycleKeyboard == null) {
                    return;
                }
                dzx dzxVar = eacVar2.n;
                EditorInfo editorInfo = eacVar2.d;
                if (editorInfo == null) {
                    editorInfo = new EditorInfo();
                }
                if (!dzxVar.f(editorInfo) || dzuVar3.c() != 1 || dzuVar3.b().equals(dzxVar.i)) {
                    return;
                }
                dzxVar.i = dzuVar3.b();
                dat b2 = dzuVar3.b();
                if (dzxVar.f.j(b2.b)) {
                    dzxVar.e();
                    dzu.f();
                    lfb lfbVar2 = b2.c;
                    if (lfbVar2.e() && dzxVar.f.j((String) lfbVar2.a())) {
                        dzxVar.h = dzxVar.c.b(b2.d(), dzx.c(editorInfo)).u(dzr.h, mjl.a).u(dzr.i, mjl.a);
                    }
                    hiz u2 = dzxVar.c.b(b2.b, dzx.c(editorInfo)).u(dzr.j, mjl.a);
                    afp afpVar2 = afp.DESTROYED;
                    boolean z2 = jam.b;
                    llk e4 = llp.e();
                    llk e5 = llp.e();
                    llk e6 = llp.e();
                    e4.h(new dzw(dzxVar, lifecycleKeyboard, b2, 0));
                    e5.h(new bqx(dzxVar, b2, 10));
                    u2.E(hjg.a(gyc.b, lifecycleKeyboard, afp.CREATED, z2, e4, e5, e6));
                    dzxVar.g = u2;
                    return;
                }
                dzu.g();
                return;
            case 7:
                cun cunVar2 = (cun) ijgVar;
                eac eacVar3 = (eac) this.a;
                if (eacVar3.a.get() != mdi.INTERSTITIAL && eacVar3.a.get() != mdi.ZERO) {
                    return;
                }
                if (cunVar2.a == 0) {
                    eacVar3.a(mdi.RETRYABLE_ERROR);
                } else {
                    eacVar3.a(mdi.DISPLAY_CONTENT);
                }
                eacVar3.c.hO().e(csw.RICH_CONTENT_SUGGESTION_IMAGES_LOADED, Integer.valueOf(cunVar2.a), Integer.valueOf(cunVar2.b));
                return;
            default:
                ijh ijhVar = (ijh) ijgVar;
                ((hxu) this.a).a();
                return;
        }
    }
}
