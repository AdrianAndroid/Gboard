package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.animation.LinearInterpolator;
import com.google.android.libraries.search.p6glow.AssistantP6GlowView;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: kme  reason: default package */
/* loaded from: classes.dex */
public final class kme implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public kme(kmf kmfVar, ghr ghrVar, okf okfVar, int i) {
        this.d = i;
        this.b = kmfVar;
        this.a = ghrVar;
        this.c = okfVar;
    }

    public kme(kmf kmfVar, okf okfVar, okf okfVar2, int i) {
        this.d = i;
        this.a = kmfVar;
        this.b = okfVar;
        this.c = okfVar2;
    }

    public kme(lab labVar, List list, lam lamVar, int i) {
        this.d = i;
        this.a = labVar;
        this.c = list;
        this.b = lamVar;
    }

    public /* synthetic */ kme(lbs lbsVar, List list, List list2, int i) {
        this.d = i;
        this.a = lbsVar;
        this.b = list;
        this.c = list2;
    }

    public /* synthetic */ kme(nwn nwnVar, ArrayList arrayList, nvu nvuVar, int i) {
        this.d = i;
        this.b = nwnVar;
        this.c = arrayList;
        this.a = nvuVar;
    }

    public kme(nzn nznVar, nvu nvuVar, num numVar, int i) {
        this.d = i;
        this.c = nznVar;
        this.b = nvuVar;
        this.a = numVar;
    }

    public kme(nzo nzoVar, nxp nxpVar, num numVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.d = i;
        this.c = nzoVar;
        this.a = nxpVar;
        this.b = numVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, okf] */
    /* JADX WARN: Type inference failed for: r0v18, types: [lam, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, okf] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, okf] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [lam, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [lam, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.List, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        if (i == 0) {
            AssistantP6GlowView assistantP6GlowView = ((kmf) this.a).b;
            LinearInterpolator linearInterpolator = klu.a;
            assistantP6GlowView.m(klu.f);
            this.b.a();
            this.c.a();
        } else if (i == 1) {
            if (((kmf) this.b).b.getAlpha() > 0.0f) {
                ((ghr) this.a).b(1.0f, kmf.a);
                return;
            }
            AssistantP6GlowView assistantP6GlowView2 = ((kmf) this.b).b;
            LinearInterpolator linearInterpolator2 = klu.a;
            assistantP6GlowView2.m(klu.f);
            this.c.a();
        } else if (i == 2) {
            try {
                lac lacVar = ((lab) this.a).b;
                for (Intent intent : this.c) {
                    if (!lacVar.a.f(intent.getStringExtra("split_id")).exists()) {
                        Object obj = this.a;
                        ?? r1 = this.c;
                        ?? r2 = this.b;
                        Integer a = ((lab) obj).a(r1);
                        if (a == null) {
                            return;
                        }
                        if (a.intValue() == 0) {
                            r2.c();
                            return;
                        } else {
                            r2.b(a.intValue());
                            return;
                        }
                    }
                }
                Object obj2 = this.a;
                ?? r22 = this.b;
                try {
                    if (!kzz.b(lby.d(((lab) obj2).a), true)) {
                        Log.e("SplitCompat", "Emulating splits failed.");
                        r22.b(-12);
                        return;
                    }
                    Log.i("SplitCompat", "Splits installed.");
                    r22.a();
                } catch (Exception e) {
                    Log.e("SplitCompat", "Error emulating splits.", e);
                    r22.b(-12);
                }
            } catch (Exception e2) {
                Log.e("SplitCompat", "Error checking verified files.", e2);
                this.b.b(-11);
            }
        } else if (i == 3) {
            Object obj3 = this.a;
            ?? r23 = this.b;
            ?? r9 = this.c;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (File file : r23) {
                String a2 = lby.a(file);
                Uri fromFile = Uri.fromFile(file);
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setDataAndType(fromFile, ((lbs) obj3).b.getContentResolver().getType(fromFile));
                intent2.addFlags(1);
                intent2.putExtra("module_name", lbs.i(a2));
                intent2.putExtra("split_id", a2);
                arrayList.add(intent2);
                arrayList2.add(lbs.i(lby.a(file)));
            }
            lbs lbsVar = (lbs) obj3;
            lbh h = lbsVar.h();
            if (h == null) {
                return;
            }
            lbsVar.c.execute(new lbn(lbsVar, h.d, arrayList, arrayList2, (List) r9, 0));
        } else if (i == 4) {
            Object obj4 = this.b;
            ?? r12 = this.c;
            Object obj5 = this.a;
            int size = r12.size();
            for (int i2 = 0; i2 < size; i2++) {
                nwy nwyVar = (nwy) r12.get(i2);
                synchronized (nwyVar) {
                    nwyVar.h((nvu) obj5);
                }
            }
            nwn nwnVar = (nwn) obj4;
            nwnVar.h();
            nwnVar.i();
        } else {
            if (i == 5) {
                ((nzo) this.c).b.a((nxp) this.a, (num) this.b);
                return;
            }
            ((nzn) this.c).c.h((nvu) this.b, (num) this.a);
        }
    }
}
