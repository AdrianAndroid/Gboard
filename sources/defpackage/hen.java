package defpackage;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: hen  reason: default package */
/* loaded from: classes.dex */
public class hen implements AutoCloseable {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/emoji/widget/EmojiListHolderController");
    public final hcp b;
    public final heo c;
    public final Context d;
    public final View e;
    public hep f;
    public int g = -1;
    public int h = -1;
    private final heq i;
    private final hbd j;
    private final hdz k;
    private final hdl l;
    private final boolean m;
    private final hej n;

    public hen(heq heqVar, View view, heo heoVar, int i, boolean z, boolean z2) {
        hcf hcfVar = new hcf(this, 2);
        this.n = hcfVar;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(heqVar.getContext(), i);
        this.d = contextThemeWrapper;
        this.i = heqVar;
        this.e = view;
        this.c = heoVar;
        this.m = z;
        boolean z3 = false;
        if (z && z2) {
            z3 = true;
        }
        heqVar.h(z3);
        this.k = hdz.a();
        this.j = hbd.h(contextThemeWrapper);
        this.l = hdn.instance.h;
        fat fatVar = new fat(heoVar, 15);
        hcp hcpVar = new hcp(contextThemeWrapper);
        this.b = hcpVar;
        hcpVar.c = fatVar;
        heqVar.f(hcfVar);
        heqVar.i(LayoutInflater.from(contextThemeWrapper));
    }

    public void a() {
        gqa.a(this.d).j(R.string.f149490_resource_name_obfuscated_res_0x7f14011b);
    }

    public void b() {
        gqa.a(this.d).j(R.string.f159360_resource_name_obfuscated_res_0x7f1405d1);
    }

    public final void c(String[] strArr) {
        llp q;
        llp q2;
        this.b.b();
        if (strArr == null || (r0 = strArr.length) == 0) {
            q = llp.q();
        } else {
            llk llkVar = new llk();
            int i = 0;
            for (String str : strArr) {
                if (this.k.g(str, this.l)) {
                    if (this.m) {
                        q2 = this.k.b(this.j.g().a(str), this.l);
                    } else {
                        q2 = llp.q();
                    }
                    if (((lrl) q2).c <= 1) {
                        q2 = llp.q();
                    }
                    llkVar.h(hei.c(str, i, -1, -1, q2, false));
                    i++;
                }
            }
            q = llkVar.g();
        }
        hep hepVar = this.f;
        if (hepVar != null) {
            hepVar.O(((lrl) q).c);
        }
        this.i.g(q);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.b.a();
    }

    public final void d(int i, int i2) {
        if (i <= 0) {
            i = -1;
        }
        this.g = i;
        if (i2 <= 0) {
            i2 = -1;
        }
        this.h = i2;
    }
}
