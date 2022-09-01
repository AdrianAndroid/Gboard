package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.google.android.inputmethod.latin.R;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* renamed from: kdr  reason: default package */
/* loaded from: classes.dex */
public final class kdr {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public kdr(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.b = layoutParams;
        this.a = new Rect();
        this.c = new int[2];
        this.g = new int[2];
        this.e = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.f133430_resource_name_obfuscated_res_0x7f0e001b, (ViewGroup) null);
        this.f = inflate;
        this.d = (TextView) inflate.findViewById(R.id.f65790_resource_name_obfuscated_res_0x7f0b079b);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.f188410_resource_name_obfuscated_res_0x7f15000f;
        layoutParams.flags = 24;
    }

    public kdr(llw llwVar, llw llwVar2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        this.d = llwVar;
        this.c = llwVar2;
        this.e = "en-US";
        this.a = iArr;
        this.g = iArr2;
        this.b = iArr3;
        this.f = iArr4;
    }

    public static jav f(iaw iawVar, boe boeVar) {
        if (iawVar != null) {
            s(iawVar);
            if (boeVar != null && !boeVar.b(iawVar.a, false)) {
                return null;
            }
            return jav.f(iawVar.a);
        }
        return null;
    }

    private static void s(iaw iawVar) {
        int i = iawVar.e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oiy] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, oiy] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, oiy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, oiy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, oiy] */
    public final kdq a(Executor executor, nox noxVar, oiy oiyVar) {
        kdn kdnVar = (kdn) this.a.a();
        kdnVar.getClass();
        ?? r2 = this.b;
        kbv kbvVar = (kbv) this.c.a();
        kbvVar.getClass();
        Object a = this.d.a();
        ?? r5 = this.e;
        lfb lfbVar = (lfb) ((npf) this.f).b;
        lfbVar.getClass();
        lfb lfbVar2 = (lfb) ((npf) this.g).b;
        lfbVar2.getClass();
        executor.getClass();
        noxVar.getClass();
        return new kdq(kdnVar, r2, kbvVar, (khv) a, r5, lfbVar, lfbVar2, executor, noxVar, oiyVar);
    }

    public final iaw b(String str) {
        String str2;
        iaw iawVar = (iaw) ((llw) this.d).get(str);
        return (iawVar != null || (str2 = (String) ((llw) this.c).get(str)) == null) ? iawVar : (iaw) ((llw) this.d).get(str2);
    }

    public final iaw c(jav javVar) {
        return (iaw) ((llw) this.d).get(javVar.n);
    }

    public final String d(jav javVar) {
        iaw iawVar = (iaw) ((llw) this.d).get(javVar.n);
        if (iawVar != null) {
            return iawVar.b;
        }
        return null;
    }

    public final void e(jav javVar) {
        iaw iawVar = (iaw) ((llw) this.d).get(javVar.n);
    }

    public final llp g(boe boeVar) {
        llk e = llp.e();
        lsz it = ((llw) this.d).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            s((iaw) entry.getValue());
            if (boeVar == null || boeVar.b((String) entry.getKey(), false)) {
                e.h(jav.f((String) entry.getKey()));
            }
        }
        return e.g();
    }

    public final long h() {
        return ((AtomicLong) this.g).get();
    }

    public final long i() {
        return ((AtomicInteger) this.c).get();
    }

    public final long j() {
        return ((AtomicInteger) this.e).get();
    }

    public final long k() {
        return ((AtomicLong) this.a).get();
    }

    public final long l() {
        return ((AtomicLong) this.b).get();
    }

    public final long m() {
        return ((AtomicLong) this.f).get();
    }

    public final synchronized void n(awz awzVar, auw auwVar) {
        ((azp) this.d).i(auwVar, awzVar);
    }

    public final synchronized void o(awz awzVar, auw auwVar, axb axbVar) {
        if (axbVar != null) {
            if (axbVar.a) {
                ((awf) this.e).b(auwVar, axbVar);
            }
        }
        ((azp) this.d).i(auwVar, awzVar);
    }

    public final void p() {
        if (!q()) {
            return;
        }
        ((WindowManager) ((Context) this.e).getSystemService("window")).removeView((View) this.f);
    }

    public final boolean q() {
        return ((View) this.f).getParent() != null;
    }

    public final mop r(Context context, boe boeVar) {
        return new mop(this, context, boeVar, (byte[]) null);
    }

    public kdr(ayh ayhVar, aqr aqrVar, ayp aypVar, ayp aypVar2, ayp aypVar3, byte[] bArr) {
        this.g = ayhVar;
        bnc bncVar = new bnc(aqrVar, null);
        this.b = bncVar;
        awf awfVar = new awf();
        this.e = awfVar;
        synchronized (this) {
            synchronized (awfVar) {
            }
        }
        this.d = new azp((byte[]) null, (byte[]) null);
        this.f = new awv(aypVar, aypVar2, aypVar3, this, this, null, null);
        this.a = new knf(bncVar, (byte[]) null);
        this.c = new hxf();
        ayhVar.a = this;
    }

    public kdr() {
        this.d = ldt.a;
        this.c = new AtomicInteger();
        this.e = new AtomicInteger();
        this.b = new AtomicLong();
        this.a = new AtomicLong();
        this.f = new AtomicLong();
        this.g = new AtomicLong();
    }

    public kdr(oiy oiyVar, oiy oiyVar2, oiy oiyVar3, oiy oiyVar4, oiy oiyVar5, oiy oiyVar6, oiy oiyVar7) {
        oiyVar.getClass();
        this.a = oiyVar;
        oiyVar2.getClass();
        this.b = oiyVar2;
        oiyVar3.getClass();
        this.c = oiyVar3;
        oiyVar4.getClass();
        this.d = oiyVar4;
        oiyVar5.getClass();
        this.e = oiyVar5;
        oiyVar6.getClass();
        this.f = oiyVar6;
        oiyVar7.getClass();
        this.g = oiyVar7;
    }
}
