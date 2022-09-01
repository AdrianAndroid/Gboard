package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.expression.expressionmoment.IExpressionMomentExtension;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: cjn  reason: default package */
/* loaded from: classes.dex */
public final class cjn extends cif {
    private static final ltg c = ltg.j("com/google/android/apps/inputmethod/libs/expression/candidatesupplier/ExpressionSelectCandidateConsumer");
    private final cjt d;

    public cjn(hso hsoVar, cjt cjtVar, idk idkVar, cpu cpuVar, cqa cqaVar) {
        super(hsoVar, idkVar, cpuVar, cqaVar);
        this.d = cjtVar;
    }

    @Override // defpackage.cif
    public final void d(hfd hfdVar, hln hlnVar) {
        Iterable r;
        boolean z;
        this.b.e(ciu.IMAGE_CANDIDATE_USAGE, 3);
        lfb f = dau.f(cjo.class, hlnVar.j);
        if (!f.e()) {
            return;
        }
        this.b.e(ciu.IMAGE_PREDICTION_CLICKED, hlnVar, ((cjo) f.a()).b());
        EditorInfo N = this.a.N();
        if (N == null) {
            dau.b("editor info is null");
            return;
        }
        hso hsoVar = this.a;
        ice iceVar = ice.HEADER;
        hsk hskVar = hsoVar.a;
        View L = hskVar == null ? null : hskVar.L(iceVar);
        if (L != null) {
            L = L.findViewById(R.id.softkey_holder_fixed_candidates);
        }
        cjm cjmVar = new cjm(hfdVar, 0);
        Objects.requireNonNull(SoftKeyView.class);
        lff lffVar = new lff(Arrays.asList(new cjm(SoftKeyView.class, 14), cjmVar));
        if (L == null) {
            r = llp.q();
        } else {
            r = !(L instanceof ViewGroup) ? llp.r(L) : new ojp(L, 1);
        }
        final SoftKeyView softKeyView = (SoftKeyView) ((View) SoftKeyView.class.cast((View) lre.am(r, lffVar)));
        Object[] objArr = {L};
        if (softKeyView == null) {
            dau.b(jdg.p("Anchor view is missing from %s", objArr));
        } else if (((Boolean) cit.G.c()).booleanValue() && ((cjo) f.a()).h()) {
            iay iayVar = new iay(-10059, null, llw.m("extension_interface", IExpressionMomentExtension.class, "query", (cjo) f.a()));
            hsk b = hsx.b();
            if (b == null) {
                ((ltd) ((ltd) c.d()).k("com/google/android/apps/inputmethod/libs/expression/candidatesupplier/ExpressionSelectCandidateConsumer", "openExpressionMomentExtension", 106, "ExpressionSelectCandidateConsumer.java")).t("InputMethodService is null.");
            } else {
                b.at(hfd.d(iayVar));
            }
            ieh.j().e(ctd.EXPRESSION_MOMENT_CAROUSEL_ENTRY_POINT_CLICKED, new Object[0]);
        } else {
            cjt cjtVar = this.d;
            cjo cjoVar = (cjo) f.a();
            cjo cjoVar2 = cjtVar.l;
            if (cjoVar2 != null && cjoVar2.equals(cjoVar)) {
                return;
            }
            cjtVar.c();
            cjs cjsVar = new cjs(cjtVar, softKeyView);
            softKeyView.getViewTreeObserver().addOnGlobalLayoutListener(cjsVar);
            cjtVar.k = cjsVar;
            cjtVar.l = cjoVar;
            boolean e = cjoVar.e().e();
            int i = R.layout.f134960_resource_name_obfuscated_res_0x7f0e00d6;
            if (!e || ((llp) cjoVar.e().a()).isEmpty()) {
                z = false;
            } else {
                i = R.layout.f143580_resource_name_obfuscated_res_0x7f0e0476;
                z = true;
            }
            cjtVar.m = -1.0f;
            gqj.d.e(cjtVar.n);
            hky a = hlf.a();
            a.p("expression_candidate_image_tooltip");
            a.s(i);
            a.m = 1;
            final ckh ckhVar = new ckh(ciz.j());
            ckhVar.setLayoutParams(new ViewGroup.LayoutParams(softKeyView.getWidth(), softKeyView.getHeight()));
            softKeyView.getLocationOnScreen(ckhVar.a);
            ckhVar.measure(View.MeasureSpec.makeMeasureSpec(softKeyView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(softKeyView.getHeight(), 1073741824));
            int[] iArr = ckhVar.a;
            int i2 = iArr[0];
            ckhVar.layout(i2, iArr[1], softKeyView.getWidth() + i2, ckhVar.a[1] + softKeyView.getHeight());
            lvw.e(new lth() { // from class: ckf
                @Override // defpackage.lth
                public final Object a() {
                    ckh ckhVar2 = ckh.this;
                    View view = softKeyView;
                    lfa T = jdg.T("PopupAnchorView");
                    T.f("locationOnScreenX", ckhVar2.a[0]);
                    T.f("locationOnScreenY", ckhVar2.a[1]);
                    T.f("width", view.getWidth());
                    T.f("height", view.getHeight());
                    return T;
                }
            });
            a.c = ckhVar;
            a.g(softKeyView.getContext().getString(R.string.f154060_resource_name_obfuscated_res_0x7f14033b));
            a.g = softKeyView.getContext().getString(R.string.f154080_resource_name_obfuscated_res_0x7f14033d);
            a.t(true);
            a.n();
            a.k(true);
            a.i(true);
            a.m(0L);
            a.d = new dwp(cjtVar, 1);
            a.k = new dwo(cjtVar, 1);
            a.i = new bxj(cjtVar, 8);
            a.b = z ? new cjp(cjtVar, cjoVar, N, 2) : new cjp(cjtVar, cjoVar, N, 0);
            hkq.b(a.a());
        }
    }
}
