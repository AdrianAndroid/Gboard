package defpackage;

import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Build;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.inputmethod.libs.expression.header.StartElementScrollBehavior;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.featuresplit.metrics.FeatureSplitMultiprocessMetricsService;
import com.google.android.libraries.inputmethod.nativelib.NativeLibHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: boe  reason: default package */
/* loaded from: classes.dex */
public final class boe {
    private static volatile boe b;
    public final Object a;

    public boe(Context context) {
        this.a = context;
    }

    public boe(fjv fjvVar) {
        this.a = fjvVar;
    }

    public boe(hga hgaVar) {
        this.a = hgaVar;
    }

    public boe(String str) {
        this.a = str;
    }

    public boe(mks mksVar) {
        this.a = mksVar;
    }

    public boe(byte[] bArr) {
        this.a = new ArrayList();
    }

    public static boe a() {
        boe boeVar = b;
        if (boeVar == null) {
            synchronized (boe.class) {
                boeVar = b;
                if (boeVar == null) {
                    boeVar = new boe();
                    b = boeVar;
                }
            }
        }
        return boeVar;
    }

    static int c(Paint paint) {
        paint.setTextSize(30.0f);
        float measureText = paint.measureText("က္တ");
        float measureText2 = paint.measureText("က");
        float measureText3 = paint.measureText("တ္တ");
        float measureText4 = paint.measureText("တ္ဆ");
        if (Math.abs(measureText4 - measureText3) / measureText4 > 0.1d) {
            return 3;
        }
        return ((double) (Math.abs(measureText - measureText2) / measureText)) < 0.1d ? 1 : 2;
    }

    public static boe h(String str) {
        return new boe(str);
    }

    public static void i(View view, int i) {
        View findViewById = view.findViewById(R.id.f59400_resource_name_obfuscated_res_0x7f0b04ef);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.f59380_resource_name_obfuscated_res_0x7f0b04ec);
        if (appCompatTextView != null) {
            appCompatTextView.setText(i);
        }
        View findViewById2 = view.findViewById(R.id.f53520_resource_name_obfuscated_res_0x7f0b0126);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(bwk.c);
        }
    }

    public static void m() {
        new hso().at(hfd.d(new iay(-10004, null, ibz.a.l)));
    }

    public static int s(izq izqVar) {
        return izqVar.m - 1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    public final ipt A() {
        return new ipt(llw.k(this.a));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map, java.lang.Object] */
    public final void B(ipt iptVar, Collection collection) {
        if (iptVar != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Object obj = iptVar.a.get(str);
                if (obj != null) {
                    this.a.put(str, obj);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final void C(String str, boolean z) {
        this.a.put(str, Boolean.valueOf(z));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final void D(String str, int i) {
        this.a.put(str, Integer.valueOf(i));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final void E(String str, String str2) {
        this.a.put(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(java.lang.String r5, boolean r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.a
            llw r0 = (defpackage.llw) r0
            java.lang.Object r0 = r0.get(r5)
            bod r0 = (defpackage.bod) r0
            r1 = 1
            if (r0 != 0) goto Le
            return r1
        Le:
            if (r6 != 0) goto L14
            boolean r6 = r0.b
            if (r6 != 0) goto L6f
        L14:
            android.text.TextPaint r6 = new android.text.TextPaint
            r6.<init>()
            java.lang.String r2 = r0.a
            boolean r6 = defpackage.vs.a(r6, r2)
            r0.c = r6
            boolean r6 = r0.c
            if (r6 == 0) goto L6d
            int r6 = r5.hashCode()
            r2 = 104314209(0x637b561, float:3.455173E-35)
            r3 = 0
            if (r6 == r2) goto L3f
            r2 = 1461848535(0x572209d7, float:1.78163146E14)
            if (r6 == r2) goto L35
            goto L49
        L35:
            java.lang.String r6 = "my-Qaag"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L49
            r5 = 1
            goto L4a
        L3f:
            java.lang.String r6 = "my-MM"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L49
            r5 = 0
            goto L4a
        L49:
            r5 = -1
        L4a:
            r6 = 2
            if (r5 == 0) goto L5f
            if (r5 == r1) goto L50
            goto L6d
        L50:
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>()
            int r5 = c(r5)
            if (r5 != r6) goto L5c
            r3 = 1
        L5c:
            r0.c = r3
            goto L6d
        L5f:
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>()
            int r5 = c(r5)
            if (r5 == r6) goto L6b
            r3 = 1
        L6b:
            r0.c = r3
        L6d:
            r0.b = r1
        L6f:
            boolean r5 = r0.c
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.boe.b(java.lang.String, boolean):boolean");
    }

    final void d(hgu hguVar) {
        Object obj = this.a;
        oll.e(hguVar, "type");
        Intent intent = new Intent();
        Context context = (Context) obj;
        intent.setComponent(new ComponentName(context, FeatureSplitMultiprocessMetricsService.class));
        intent.setAction(hguVar.name());
        hgv hgvVar = new hgv(context);
        if (!context.getApplicationContext().bindService(intent, hgvVar, 1)) {
            hgw.a(context, hgvVar);
        }
    }

    public final boolean e() {
        try {
            if (lby.e((Context) this.a).d().contains("brella_feature_split")) {
                NativeLibHelper.a("tensorflow_jni", true);
                d(hgu.BRELLA_JNI_LOADED_FROM_FEATURE_SPLIT);
            } else {
                NativeLibHelper.loadIntegratedSharedObjectLibrary(true);
                d(hgu.BRELLA_JNI_LOADED_FROM_EMBEDDED_SHARED_OBJECT);
            }
            return true;
        } catch (UnsatisfiedLinkError unused) {
            d(hgu.BRELLA_JNI_FAILED_IN_LOADING);
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, avd] */
    public final synchronized avd f(Class cls) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            bek bekVar = (bek) this.a.get(i);
            if (((Class) bekVar.a).isAssignableFrom(cls)) {
                return bekVar.b;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public final synchronized void g(Class cls, avd avdVar) {
        this.a.add(new bek(cls, avdVar));
    }

    public final void j() {
        ViewGroup.LayoutParams layoutParams;
        Object obj = this.a;
        if (obj != null) {
            StartElementScrollBehavior startElementScrollBehavior = (StartElementScrollBehavior) obj;
            startElementScrollBehavior.d = 0;
            View view = startElementScrollBehavior.f;
            if (view != null && (layoutParams = view.getLayoutParams()) != null) {
                layoutParams.width = startElementScrollBehavior.b;
                startElementScrollBehavior.f.setLayoutParams(layoutParams);
            }
            startElementScrollBehavior.c = 0;
        }
    }

    public final void k() {
        Object obj = this.a;
        if (obj != null) {
            ((StartElementScrollBehavior) obj).k = true;
        }
    }

    public final void l(int i) {
        StartElementScrollBehavior startElementScrollBehavior;
        View view;
        RecyclerView recyclerView;
        View childAt;
        RecyclerView recyclerView2;
        Object obj = this.a;
        if (obj == null || (view = (startElementScrollBehavior = (StartElementScrollBehavior) obj).h) == null) {
            return;
        }
        int measuredWidth = view.getMeasuredWidth() - startElementScrollBehavior.d;
        if (measuredWidth > 0 && (recyclerView = startElementScrollBehavior.i) != null && ((childAt = recyclerView.getChildAt(i)) == null || (startElementScrollBehavior.j != 1 ? !((recyclerView2 = startElementScrollBehavior.i) == null || recyclerView2.getWidth() >= childAt.getRight() + measuredWidth) : childAt.getLeft() < measuredWidth))) {
            ValueAnimator valueAnimator = (ValueAnimator) AnimatorInflater.loadAnimator(startElementScrollBehavior.a, R.animator.f450_resource_name_obfuscated_res_0x7f02000c);
            valueAnimator.setIntValues(0, measuredWidth);
            valueAnimator.addUpdateListener(new op(startElementScrollBehavior, 8));
            startElementScrollBehavior.t(valueAnimator);
        }
        RecyclerView recyclerView3 = startElementScrollBehavior.i;
        if (recyclerView3 == null) {
            return;
        }
        recyclerView3.ae(i);
    }

    public final void n(lmz lmzVar) {
        lmzVar.size();
        ((AtomicReference) this.a).set(lmzVar);
    }

    public final long o() {
        return ((AtomicLong) this.a).incrementAndGet();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [lgb, java.lang.Object] */
    public final jic p() {
        return (jic) this.a.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final void q(String str, jjk jjkVar) {
        ?? r0 = this.a;
        jdg.u(str);
        jdg.u(jjkVar);
        r0.put(str, jjkVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [fjv, java.lang.Object] */
    public final jex r() {
        return Build.VERSION.SDK_INT < 26 ? new jew(1) : new jew(this.a, 0);
    }

    public final long t(int i, String str) {
        return u(izq.a(i + 1), str);
    }

    public final long u(izq izqVar, String str) {
        Long l = (Long) ((lrk) this.a).e.get(iyi.a(s(izqVar), str));
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }

    public final iyi v(long j) {
        iyi iyiVar = (iyi) ((lle) this.a).get(Long.valueOf(j));
        return iyiVar == null ? iyi.a(-1, "") : iyiVar;
    }

    public final lmz w(ipl iplVar) {
        ipq ipqVar = (ipq) ((llw) this.a).get(iplVar);
        if (ipqVar == null) {
            return lrr.a;
        }
        return ipqVar.b.keySet();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    public final synchronized llp x() {
        llp o;
        o = llp.o(this.a);
        this.a.clear();
        return o;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    public final synchronized void y() {
        this.a.clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List, java.lang.Object] */
    public final synchronized boolean z(Collection collection) {
        this.a.addAll(collection);
        return ((long) this.a.size()) >= ((Long) iwt.b.c()).longValue();
    }

    public boe() {
        lls i = llw.i(80);
        i.a("aii-IQ", new bod("ܓ"));
        i.a("aii-SY", new bod("ܓ"));
        i.a("ak-GH", new bod("Ɛ"));
        i.a("ak-x-akuapem", new bod("Ɛ"));
        i.a("ak-x-asante", new bod("Ɛ"));
        i.a("az-AZ", new bod("Ə"));
        i.a("az-IR", new bod("ؽ"));
        i.a("ban-Bali", new bod("ᬳ"));
        i.a("bax-CM", new bod("ꚩ"));
        i.a("bci-CI", new bod("Ɛ"));
        i.a("ber-Latn", new bod("Ǝ"));
        i.a("ber-Tfng", new bod("ⵦ"));
        i.a("bhb-Gujr", new bod("ક"));
        i.a("bku-PH", new bod("ᝌ"));
        i.a("blt-VN", new bod("ꪀ"));
        i.a("bm-ML", new bod("Ɛ"));
        i.a("bm-Nkoo", new bod("ߊ"));
        i.a("bo-CN", new bod("ཀ"));
        i.a("btm-Batk", new bod("ᯤ"));
        i.a("bts-Batk", new bod("ᯙ"));
        i.a("bug-Bugi", new bod("ᨁ"));
        i.a("ccp-BD", new bod("𑄇"));
        i.a("chr-US", new bod("Ꭰ"));
        i.a("chr-x-dual", new bod("ꭰ"));
        i.a("cja-KH", new bod("ꨀ"));
        i.a("cjm-VN", new bod("ꨀ"));
        i.a("cld-IQ", new bod("ܓ"));
        i.a("cop-EG", new bod("ⲁ"));
        i.a("cr-Cans-CA", new bod("ᐃ"));
        i.a("din", new bod("Ɛ"));
        i.a("dv-MV", new bod("ހ"));
        i.a("dz", new bod("ཀ"));
        i.a("ee", new bod("Ɛ"));
        i.a("fan-GQ", new bod("Ɛ"));
        i.a("fat-GH", new bod("Ɛ"));
        i.a("ff-Adlm", new bod("𞤀"));
        i.a("fil-Tglg", new bod("ᜈ"));
        i.a("gno-Telu", new bod("క"));
        i.a("gu-IN", new bod("ક"));
        i.a("hlb-Orya", new bod("କ"));
        i.a("hnn-PH", new bod("ᜫ"));
        i.a("ii-CN", new bod("ꀀ"));
        i.a("iu-Cans-CA", new bod("ᐃ"));
        i.a("jv-Java", new bod("ꦲ"));
        i.a("kfr-IN", new bod("ક"));
        i.a("khb-CN", new bod("ᦀ"));
        i.a("km-KH", new bod("ក"));
        i.a("kr-NG", new bod("Ǝ"));
        i.a("kri-SL", new bod("Ɛ"));
        i.a("ks-Deva", new bod("ॷ"));
        i.a("kyu-MM", new bod("ꤊ"));
        i.a("laj-UG", new bod("Ɛ"));
        i.a("lep-IN", new bod("ᰢ"));
        i.a("lif-Limb", new bod("᥀"));
        i.a("lis-Lisu", new bod("ꓪ"));
        i.a("lmn-Telu", new bod("క"));
        i.a("ln", new bod("Ɛ"));
        i.a("ln-AO", new bod("Ɛ"));
        i.a("lo-LA", new bod("ກ"));
        i.a("mas-KE", new bod("Ɛ"));
        i.a("mni-Mtei", new bod("ꯀ"));
        i.a("mos-BF", new bod("Ɛ"));
        i.a("my", new bod("က"));
        i.a("my-MM", new bod("က"));
        i.a("my-Qaag", new bod("က"));
        i.a("or-IN", new bod("କ"));
        i.a("osa-US", new bod("𐓯"));
        i.a("pa-Guru", new bod("ਕ"));
        i.a("rej-Rjng", new bod("ꤺ"));
        i.a("sat-Olck", new bod("ᱚ"));
        i.a("saz-IN", new bod("ꢂ"));
        i.a("shn-MM", new bod("ꧤ"));
        i.a("si-LK", new bod("ක"));
        i.a("su-Sund", new bod("ᮃ"));
        i.a("syc-IQ", new bod("ܓ"));
        i.a("syl-Sylo", new bod("ꠇ"));
        i.a("tdd-CN", new bod("ᥪ"));
        i.a("tbw-PH", new bod("ᝤ"));
        i.a("te-IN", new bod("క"));
        i.a("vai-LR", new bod("ꔀ"));
        this.a = i.l();
    }

    public boe(byte[] bArr, byte[] bArr2) {
        this.a = new AtomicLong(0L);
    }

    public boe(char[] cArr) {
        this.a = new AtomicReference(null);
    }

    public boe(Context context, View view, int i) {
        this(context, i, view.findViewById(R.id.f59380_resource_name_obfuscated_res_0x7f0b04ec), view.findViewById(R.id.f59390_resource_name_obfuscated_res_0x7f0b04ed), view.findViewById(R.id.f59430_resource_name_obfuscated_res_0x7f0b04f2));
    }

    public boe(Context context, int i, View view, View view2, View view3) {
        tr trVar;
        StartElementScrollBehavior startElementScrollBehavior = null;
        if (view3 != null && (trVar = (tr) view3.getLayoutParams()) != null) {
            startElementScrollBehavior = (StartElementScrollBehavior) trVar.a;
        }
        this.a = startElementScrollBehavior;
        if (startElementScrollBehavior != null) {
            startElementScrollBehavior.e = view;
            startElementScrollBehavior.f = view2;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f37100_resource_name_obfuscated_res_0x7f070322);
            int e = jbt.e(context, R.attr.f3680_resource_name_obfuscated_res_0x7f0400a0);
            int i2 = i - 1;
            if (i2 == 1) {
                startElementScrollBehavior.w(dimensionPixelSize, e);
            } else if (i2 == 2) {
                startElementScrollBehavior.w(dimensionPixelSize, dimensionPixelSize);
            } else {
                startElementScrollBehavior.w(0, 0);
            }
        }
    }

    public boe(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new HashMap();
    }

    public boe(byte[] bArr, char[] cArr) {
        this.a = new ArrayList();
    }

    public boe(llp llpVar) {
        lls h = llw.h();
        int i = ((lrl) llpVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            ipq ipqVar = (ipq) llpVar.get(i2);
            h.a(ipqVar.a, ipqVar);
        }
        this.a = h.l();
    }

    public boe(izu izuVar) {
        llc a = lle.a();
        for (izs izsVar : izuVar.a) {
            izr izrVar = izsVar.b;
            int i = izq.a((izrVar == null ? izr.c : izrVar).a).m - 1;
            for (int i2 = 0; i2 < izsVar.c.size(); i2++) {
                a.e(Long.valueOf((i2 << 32) | i), iyi.a(i, (String) izsVar.c.get(i2)));
            }
        }
        this.a = a.l();
    }

    public boe(short[] sArr) {
        this.a = new HashMap();
    }

    public boe(jhy jhyVar) {
        this.a = jdg.n(new ihp(jhyVar, 5));
    }
}
