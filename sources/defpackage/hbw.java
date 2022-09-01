package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.support.v7.widget.AppCompatTextView;
import android.text.method.LinkMovementMethod;
import android.util.Printer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.inputmethod.latin.R;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: hbw  reason: default package */
/* loaded from: classes.dex */
public final class hbw extends hcy implements gzv {
    public static final ltg d = ltg.j("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerBodyAdapter");
    private static int p = 0;
    public final int e;
    public final int f;
    public hdb g;
    public final int h;
    hej j;
    public final Runnable k;
    public final boolean l;
    public final hbg m;
    public final hbe n;
    private final float q;
    private final int r;
    private final LayoutInflater s;
    private final String[] t;
    private final int u;
    private final lgb w;
    private final lgb x;
    private final Runnable y;
    private final View.OnClickListener z;
    public final Map i = new HashMap();
    private final long v = SystemClock.elapsedRealtime();

    public hbw(Context context, String[] strArr, float f, int i, int i2, int i3, hej hejVar, boolean z, int i4, lgb lgbVar, lgb lgbVar2, Runnable runnable, Runnable runnable2, hbg hbgVar, hbe hbeVar, View.OnClickListener onClickListener) {
        int i5 = p + 1;
        p = i5;
        ((ltd) ((ltd) d.b()).k("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerBodyAdapter", "<init>", 131, "EmojiPickerBodyAdapter.java")).u("EmojiPickerBodyAdapter created (instance count = %s)", i5);
        this.o = context;
        this.e = i2;
        this.q = f;
        this.r = i;
        this.f = i3;
        this.t = strArr;
        this.j = hejVar;
        llk e = llp.e();
        this.l = z;
        this.h = i4;
        for (int i6 = 0; i6 < strArr.length; i6++) {
            e.h(llp.q());
        }
        hdb hdbVar = new hdb(e.g(), i3, i2, z, i4);
        this.g = hdbVar;
        this.u = hdbVar.f;
        this.s = LayoutInflater.from(context);
        this.w = lgbVar;
        this.x = lgbVar2;
        this.y = runnable;
        this.k = runnable2;
        this.m = hbgVar;
        this.n = hbeVar;
        this.z = onClickListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0076 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A(defpackage.hct r10) {
        /*
            r9 = this;
            hdb r0 = r9.g
            int r0 = r0.d()
            if (r0 >= 0) goto L9
            return
        L9:
            hdb r0 = r9.g
            boolean r1 = r0.e
            r2 = -1
            if (r1 != 0) goto L12
        L10:
            r10 = -1
            goto L74
        L12:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.List r3 = r0.b
            int r4 = r0.d()
            java.lang.Object r3 = r3.get(r4)
            java.util.Collection r3 = (java.util.Collection) r3
            r1.<init>(r3)
            int r3 = r1.size()
            int r3 = r3 + r2
            if (r3 >= 0) goto L2b
            goto L10
        L2b:
            java.lang.Object r4 = r1.get(r3)
            boolean r4 = r4 instanceof defpackage.hde
            if (r4 == 0) goto L3b
            java.lang.Object r4 = defpackage.lre.ac(r0)
            boolean r4 = r4 instanceof defpackage.hde
            if (r4 != 0) goto L56
        L3b:
            ltg r4 = defpackage.hdb.a
            ltv r4 = r4.c()
            ltd r4 = (defpackage.ltd) r4
            r5 = 108(0x6c, float:1.51E-43)
            java.lang.String r6 = "ItemViewDataFlatList.java"
            java.lang.String r7 = "com/google/android/libraries/inputmethod/emoji/picker/ItemViewDataFlatList"
            java.lang.String r8 = "updatePaginatedErrorText"
            ltv r4 = r4.k(r7, r8, r5, r6)
            ltd r4 = (defpackage.ltd) r4
            java.lang.String r5 = "Expect last item to be loading view if replacing with error loading."
            r4.t(r5)
        L56:
            java.lang.Object r4 = r1.get(r3)
            boolean r4 = r4 instanceof defpackage.hde
            if (r4 == 0) goto L61
            r1.set(r3, r10)
        L61:
            java.util.List r10 = r0.b
            int r3 = r0.d()
            llp r1 = defpackage.llp.o(r1)
            r10.set(r3, r1)
            r0.f()
            int r10 = r0.f
            int r10 = r10 + r2
        L74:
            if (r10 != r2) goto L77
            return
        L77:
            r9.hg(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hbw.A(hct):void");
    }

    public final void B(llp llpVar) {
        this.g.g(llpVar);
        j(0, y(0));
    }

    public final void C(llp llpVar) {
        if (this.h < 0) {
            return;
        }
        hdb hdbVar = this.g;
        hdbVar.b.set(hdbVar.d, llpVar);
        if (llpVar.size() > hdbVar.c) {
            ((ltd) ((ltd) hdb.a.d()).k("com/google/android/libraries/inputmethod/emoji/picker/ItemViewDataFlatList", "updateSuggestions", 75, "ItemViewDataFlatList.java")).y("suggestions has too many emojis: %d > %d", llpVar.size(), hdbVar.c);
        }
        hdbVar.f();
        int i = this.h;
        j(i, y(i));
    }

    @Override // defpackage.ls
    public final mo d(ViewGroup viewGroup, int i) {
        View inflate;
        View inflate2;
        if (i == hbl.a) {
            inflate = this.s.inflate(R.layout.f133660_resource_name_obfuscated_res_0x7f0e003e, viewGroup, false);
            inflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        } else {
            if (i == hcs.a) {
                inflate2 = this.s.inflate(R.layout.f134120_resource_name_obfuscated_res_0x7f0e007d, viewGroup, false);
                if (this.q < 0.0f) {
                    inflate2.setLayoutParams(new ViewGroup.LayoutParams(-1, this.r));
                } else {
                    inflate2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    inflate2.setMinimumHeight((int) (viewGroup.getMeasuredHeight() / this.q));
                }
            } else if (i == hbn.a) {
                inflate2 = new View(this.o);
                inflate2.setLayoutParams(new ViewGroup.LayoutParams(E(viewGroup) / this.e, this.q < 0.0f ? this.r : (int) (viewGroup.getMeasuredHeight() / this.q)));
            } else if (i == hdf.a) {
                inflate2 = this.s.inflate(R.layout.f143350_resource_name_obfuscated_res_0x7f0e0457, viewGroup, false);
                inflate2.setLayoutParams(new ViewGroup.LayoutParams(E(viewGroup) / this.e, this.q < 0.0f ? this.r : (int) (viewGroup.getMeasuredHeight() / this.q)));
            } else if (i == hcq.a) {
                return new hcr(viewGroup, this.s, E(viewGroup) / this.e, this.q < 0.0f ? this.r : (int) (viewGroup.getMeasuredHeight() / this.q), this.j);
            } else if (i == hde.a) {
                inflate = this.s.inflate(R.layout.f143340_resource_name_obfuscated_res_0x7f0e0456, viewGroup, false);
            } else if (i == hct.a) {
                inflate = this.s.inflate(R.layout.f134310_resource_name_obfuscated_res_0x7f0e0090, viewGroup, false);
            } else {
                return new hcx(viewGroup, E(viewGroup) / this.e, this.q < 0.0f ? this.r : (int) (viewGroup.getMeasuredHeight() / this.q), this.z);
            }
            inflate = inflate2;
        }
        return new mo(inflate);
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        printer.println(getClass().getSimpleName());
        int i = this.g.f;
        printer.println("  flattenSource.size = " + i);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.v;
        printer.println("  instanceLifeTime(ms) = " + (elapsedRealtime - j));
        int i2 = p;
        printer.println("  instanceCreationCount = " + i2);
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }

    @Override // defpackage.ls
    public final int ha() {
        int i = this.g.f;
        if (i == this.u) {
            return 0;
        }
        return i;
    }

    @Override // defpackage.ls
    public final int he(int i) {
        return this.g.get(i).a();
    }

    @Override // defpackage.ls
    public final long hf(int i) {
        return this.g.get(i).g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v25, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.ls
    public final void o(mo moVar, int i) {
        int i2 = moVar.f;
        View view = moVar.a;
        if (i2 == hbl.a) {
            int a = this.g.a(i);
            String str = ((hbl) this.g.get(i)).b;
            if (str.isEmpty()) {
                if (a == 0) {
                    str = this.t[0];
                } else {
                    int i3 = this.h;
                    if (a == i3) {
                        str = this.o.getString(R.string.f150760_resource_name_obfuscated_res_0x7f1401c2);
                    } else {
                        str = this.t[a - (i3 >= 0 ? 1 : 0)];
                    }
                }
            }
            if (!str.isEmpty()) {
                gqa.q(view, str);
            }
            AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.f52860_resource_name_obfuscated_res_0x7f0b00e0);
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) view.findViewById(R.id.f129280_resource_name_obfuscated_res_0x7f0b214c);
            if (a == 0) {
                ?? a2 = this.w.a();
                if (a2 == 0) {
                    appCompatTextView.setText(this.o.getString(R.string.f150750_resource_name_obfuscated_res_0x7f1401c1));
                } else {
                    appCompatTextView.setText((CharSequence) a2);
                }
                appCompatTextView.setVisibility(0);
                Object a3 = this.x.a();
                if (a3 != null) {
                    appCompatTextView2.setText(this.o.getString(R.string.f162910_resource_name_obfuscated_res_0x7f14074a, a3));
                    appCompatTextView2.setVisibility(0);
                    appCompatTextView2.setOnClickListener(new fat(this, 11));
                    return;
                }
                appCompatTextView2.setVisibility(8);
                appCompatTextView2.setText((CharSequence) null);
                appCompatTextView2.setOnClickListener(null);
                return;
            }
            if (str.isEmpty()) {
                appCompatTextView.setVisibility(8);
            } else {
                appCompatTextView.setText(str);
                appCompatTextView.setVisibility(0);
            }
            appCompatTextView2.setVisibility(8);
            appCompatTextView2.setText((CharSequence) null);
            appCompatTextView2.setOnClickListener(null);
        } else if (i2 == hcs.a) {
            AppCompatTextView appCompatTextView3 = (AppCompatTextView) view.findViewById(R.id.f54200_resource_name_obfuscated_res_0x7f0b0188);
            String str2 = ((hcs) this.g.get(i)).c;
            if (str2.isEmpty()) {
                str2 = this.o.getString(x(i) == 0 ? R.string.f150820_resource_name_obfuscated_res_0x7f1401c8 : R.string.f150810_resource_name_obfuscated_res_0x7f1401c7);
            }
            appCompatTextView3.setText(str2);
        } else if (i2 == hcq.a) {
            hcq hcqVar = (hcq) this.g.get(i);
            int x = x(i);
            ((hcr) moVar).F(icu.q(hcqVar, i - z(x), x, y(x), this.m), hcqVar.e);
            if (x > this.h && !this.n.a(hcqVar.d).isEmpty()) {
                this.i.put(this.n.b(hcqVar.d), new hbv(x, i - z(x)));
            }
            D(view, hcqVar);
        } else if (i2 == hcw.a) {
            hcx hcxVar = (hcx) moVar;
            z(x(i));
            icu icuVar = ((hcw) this.g.get(i)).b;
            throw null;
        } else if (i2 == hde.a) {
            this.y.run();
        } else if (i2 != hct.a) {
        } else {
            TextView textView = (TextView) view.findViewById(R.id.f54440_resource_name_obfuscated_res_0x7f0b01a2);
            textView.setText(((hct) this.g.get(i)).b);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public final int x(int i) {
        return this.g.a(i);
    }

    public final int y(int i) {
        return this.g.b(i);
    }

    public final int z(int i) {
        return this.g.c(i);
    }
}
