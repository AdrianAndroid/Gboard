package defpackage;

import android.content.Context;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.search.fastaccessbar.FastAccessBarExtension;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: ecp  reason: default package */
/* loaded from: classes.dex */
public final class ecp extends dbn implements FastAccessBarExtension, csi, ijj, hho {
    public static final /* synthetic */ int a = 0;
    private static final ltg i = ltg.j("com/google/android/apps/inputmethod/libs/search/fastaccessbar/FastAccessBarExtensionImpl");
    private static final hhl[] j = {ecq.v, ecq.q, ecq.c, ecq.r};
    private final ibz l;
    private final ino n;
    private int q;
    private boolean s;
    private boolean t;
    private final cpu k = cqh.a().b;
    private final iqe m = iqe.e(ecq.b, 3);
    private final ArrayList p = new ArrayList();
    private hiz r = hiz.n(0);
    private final inm o = new fdo(this, 1);

    public ecp(Context context) {
        this.l = ibz.a(context.getString(R.string.f154990_resource_name_obfuscated_res_0x7f1403a6));
        this.n = ino.M(context);
    }

    private final void Y() {
        if (this.q > 0 && !u()) {
            if (!this.r.isDone()) {
                this.r.cancel(true);
            }
            this.r = this.k.b(this.q).u(dzr.o, mjl.a);
        }
    }

    private final void Z() {
        this.q = ((Long) ecq.c.c()).intValue();
        this.p.clear();
        this.p.addAll(ecq.a(ecq.r));
        this.t = ((Boolean) ecq.q.c()).booleanValue();
        this.s = ((Boolean) ecq.v.c()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
        if (((java.lang.Boolean) defpackage.ecq.h.c()).booleanValue() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0082, code lost:
        if (defpackage.cuz.a.d(y(), r7) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0088, code lost:
        if (u() == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0093, code lost:
        if (r4.n.ah(com.google.android.inputmethod.latin.R.string.f160810_resource_name_obfuscated_res_0x7f140671) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009b, code lost:
        if (r4.n.aj(com.google.android.inputmethod.latin.R.string.f160810_resource_name_obfuscated_res_0x7f140671) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a6, code lost:
        if (r4.n.al("PREF_FAST_ACCESS_BAR_SHOWN", false, false) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00aa, code lost:
        if (r4.t != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ae, code lost:
        if (r4.s == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b1, code lost:
        r5 = r4.n.b("pref_fast_access_bar_onboarding_v2_shown_count", 0);
        r6 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bd, code lost:
        if (r5 <= 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c5, code lost:
        if (r5 > r4.p.size()) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e3, code lost:
        if (((r6 - r4.n.c("pref_fast_access_bar_onboarding_v2_last_shown_timestamp", r6)) / 1000) < ((java.lang.Long) r4.p.get(r5 - 1)).longValue()) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e5, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0074, code lost:
        if (defpackage.ham.aj(y(), r7) != false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean aa(defpackage.hqt r5, defpackage.ibz r6, android.view.inputmethod.EditorInfo r7) {
        /*
            r4 = this;
            android.content.Context r0 = r4.y()
            boolean r0 = defpackage.jam.r(r0)
            r1 = 0
            if (r0 != 0) goto Le7
            hga r0 = r4.z()
            iau r0 = r0.p()
            iau r2 = defpackage.iau.SOFT
            if (r0 != r2) goto Le7
            if (r5 == 0) goto L1e
            java.lang.String r5 = r5.p()
            goto L1f
        L1e:
            r5 = 0
        L1f:
            if (r5 == 0) goto L29
            java.lang.String r0 = "morse"
            boolean r5 = r5.startsWith(r0)
            if (r5 != 0) goto Le7
        L29:
            if (r6 == 0) goto L45
            hhl r5 = defpackage.ecq.i
            java.lang.Object r5 = r5.c()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r0 = ","
            java.lang.String[] r5 = r5.split(r0)
            java.util.List r5 = java.util.Arrays.asList(r5)
            java.lang.String r6 = r6.l
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto Le7
        L45:
            android.content.Context r5 = r4.y()
            boolean r5 = defpackage.ham.J(r5, r7)
            if (r5 == 0) goto L5e
            hhl r5 = defpackage.ecq.h
            java.lang.Object r5 = r5.c()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto Le7
            goto L78
        L5e:
            iqe r5 = r4.m
            boolean r5 = defpackage.ham.z(r5, r7)
            if (r5 != 0) goto L6c
            if (r7 == 0) goto Le7
            java.lang.String r5 = r7.packageName
            goto Le7
        L6c:
            android.content.Context r5 = r4.y()
            boolean r5 = defpackage.ham.aj(r5, r7)
            if (r5 == 0) goto L78
            goto Le7
        L78:
            cuz r5 = defpackage.cuz.a
            android.content.Context r6 = r4.y()
            boolean r5 = r5.d(r6, r7)
            if (r5 == 0) goto Le7
            boolean r5 = r4.u()
            if (r5 == 0) goto Le7
            ino r5 = r4.n
            r6 = 2132018801(0x7f140671, float:1.9675919E38)
            boolean r5 = r5.ah(r6)
            if (r5 == 0) goto L9e
            ino r5 = r4.n
            boolean r5 = r5.aj(r6)
            if (r5 == 0) goto Le7
            goto Le5
        L9e:
            ino r5 = r4.n
            java.lang.String r6 = "PREF_FAST_ACCESS_BAR_SHOWN"
            boolean r5 = r5.al(r6, r1, r1)
            if (r5 != 0) goto Le5
            boolean r5 = r4.t
            if (r5 != 0) goto Lb1
            boolean r5 = r4.s
            if (r5 == 0) goto Le5
            goto Le7
        Lb1:
            ino r5 = r4.n
            java.lang.String r6 = "pref_fast_access_bar_onboarding_v2_shown_count"
            int r5 = r5.b(r6, r1)
            long r6 = java.lang.System.currentTimeMillis()
            if (r5 <= 0) goto Le5
            java.util.ArrayList r0 = r4.p
            int r0 = r0.size()
            if (r5 > r0) goto Le7
            ino r0 = r4.n
            java.lang.String r2 = "pref_fast_access_bar_onboarding_v2_last_shown_timestamp"
            long r2 = r0.c(r2, r6)
            long r6 = r6 - r2
            r2 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r2
            java.util.ArrayList r0 = r4.p
            int r5 = r5 + (-1)
            java.lang.Object r5 = r0.get(r5)
            java.lang.Long r5 = (java.lang.Long) r5
            long r2 = r5.longValue()
            int r5 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r5 < 0) goto Le7
        Le5:
            r5 = 1
            return r5
        Le7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ecp.aa(hqt, ibz, android.view.inputmethod.EditorInfo):boolean");
    }

    private final void x(ibz ibzVar, EditorInfo editorInfo) {
        hsy hsyVar;
        if (!aa(A(), ibzVar, editorInfo)) {
            if (!R()) {
                return;
            }
            z().y();
            return;
        }
        if (R() && (hsyVar = this.e) != null && !hsyVar.fq()) {
            ((ltd) ((ltd) i.d()).k("com/google/android/apps/inputmethod/libs/search/fastaccessbar/FastAccessBarExtensionImpl", "maybeActivateOrDeactivate", 164, "FastAccessBarExtensionImpl.java")).t("FastAccessBarExtension is activated but its keyboard is not active.");
            z().y();
        }
        if (R()) {
            return;
        }
        z().ae();
    }

    @Override // defpackage.dbn, defpackage.hfh
    public final boolean c(hfd hfdVar) {
        return false;
    }

    @Override // defpackage.dbn
    protected final int d() {
        return R.xml.f210170_resource_name_obfuscated_res_0x7f17010c;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [hga, java.lang.Object] */
    @Override // defpackage.csi
    public final /* synthetic */ ctt f(csh cshVar) {
        boe boeVar = new boe(z());
        SoftKeyboardView softKeyboardView = ((csk) npd.c(csm.d(new cnj(cshVar, 3))).a()).a;
        csg csgVar = (csg) cshVar;
        Context context = csgVar.b;
        nxp.W(context);
        Context context2 = csgVar.b;
        nxp.W(context2);
        ino d = csd.d(context2);
        hsz hszVar = csgVar.c;
        nxp.W(hszVar);
        idk i2 = ciz.i();
        ctu ctuVar = csgVar.d;
        nxp.W(ctuVar);
        return new ede(softKeyboardView, context, d, hszVar, i2, ctuVar, boeVar.a);
    }

    @Override // defpackage.ijj
    public final /* synthetic */ void fd(ijg ijgVar) {
        cpv cpvVar = (cpv) ijgVar;
        Y();
    }

    @Override // defpackage.ijj
    public final /* synthetic */ void fe(Class cls) {
    }

    @Override // defpackage.dbn
    public final ibz g() {
        return this.l;
    }

    @Override // defpackage.hho
    public final void gW(Set set) {
        Z();
    }

    @Override // defpackage.dbn, defpackage.ifw
    public final synchronized void gm(Context context, igg iggVar) {
        super.gm(context, iggVar);
        Z();
        hhq.p(this, j);
        ijl.b().h(this, cpv.class, gyc.b);
        Y();
        this.n.X(this.o, R.string.f160810_resource_name_obfuscated_res_0x7f140671);
    }

    @Override // defpackage.dbn, defpackage.ifw
    public final void gn() {
        super.gn();
        hhq.q(this);
        ijl.b().d(this, cpv.class);
        this.r.cancel(true);
    }

    @Override // defpackage.dbn, defpackage.hfx
    public final void h(ibz ibzVar) {
        x(ibzVar, z().g());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dbn
    public final boolean hv() {
        return true;
    }

    @Override // defpackage.dbn
    public final void hw(hsy hsyVar) {
        cnx.c(hsyVar, this);
    }

    @Override // defpackage.dbn, defpackage.hfx
    public final void j(EditorInfo editorInfo, boolean z) {
        x(z().q(), editorInfo);
    }

    @Override // defpackage.csi
    public final lmz l() {
        return lmz.r(csl.a);
    }

    @Override // defpackage.dbn, defpackage.hfx
    public final synchronized boolean n(hqt hqtVar, EditorInfo editorInfo, boolean z, Map map, hfl hflVar) {
        if (aa(hqtVar, z().q(), editorInfo)) {
            super.n(hqtVar, editorInfo, z, map, hflVar);
            return true;
        }
        return false;
    }

    @Override // defpackage.dbn, defpackage.hfx
    public final boolean o() {
        return true;
    }

    @Override // defpackage.dbn, defpackage.hfx
    public final boolean p() {
        return true;
    }

    protected final boolean u() {
        return (this.s && this.n.ah(R.string.f160810_resource_name_obfuscated_res_0x7f140671)) || ((Integer) this.r.A(0)).intValue() >= this.q;
    }
}
