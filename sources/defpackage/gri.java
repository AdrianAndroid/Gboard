package defpackage;

import android.content.Context;
import android.util.Printer;
import android.view.View;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: gri  reason: default package */
/* loaded from: classes.dex */
final class gri implements gqv {
    private final Context a;
    private Context b;
    private SoftKeyView c;
    private final List d = new ArrayList();
    private gqh e;

    public gri(Context context) {
        this.a = context;
    }

    private final int e(String str) {
        int i = 0;
        while (i < this.d.size() && !str.equals(((gqh) this.d.get(i)).a)) {
            i++;
        }
        return i;
    }

    private final gqh f() {
        int size = this.d.size();
        if (size > 0) {
            return (gqh) this.d.get(size - 1);
        }
        return null;
    }

    private final void g(SoftKeyView softKeyView, gqh gqhVar) {
        this.e = gqhVar;
        if (gqhVar == null) {
            softKeyView.n(null);
            return;
        }
        Context context = this.b;
        if (context == null) {
            context = this.a;
        }
        ico d = ict.d();
        d.v();
        d.x = true;
        int i = gqhVar.b;
        if (i != 0) {
            d.s(R.id.f56210_resource_name_obfuscated_res_0x7f0b0265, jgd.g(context, i));
        }
        int i2 = gqhVar.c;
        if (i2 != 0) {
            d.f(R.id.f65200_resource_name_obfuscated_res_0x7f0b0745, context.getString(i2));
        }
        int i3 = gqhVar.d;
        if (i3 != 0) {
            d.h = context.getString(i3);
        }
        Integer num = (Integer) gqhVar.c("layout");
        if (num != null && num.intValue() != 0) {
            d.n = num.intValue();
        }
        llp llpVar = gqhVar.f;
        if (llpVar != null) {
            d.c = (ial[]) llpVar.toArray(new ial[0]);
        }
        softKeyView.n(d.c());
        gqhVar.e(softKeyView);
    }

    private final void h() {
        SoftKeyView softKeyView = this.c;
        if (softKeyView == null) {
            gqh gqhVar = this.e;
            if (gqhVar == null) {
                return;
            }
            gqhVar.d();
            this.e = null;
            return;
        }
        gqh f = f();
        if (Objects.equals(f, this.e)) {
            return;
        }
        gqh gqhVar2 = this.e;
        if (gqhVar2 != null) {
            gqhVar2.d();
        }
        g(softKeyView, f);
    }

    private static boolean i(gqh gqhVar) {
        return gqhVar.c("default") == Boolean.TRUE;
    }

    @Override // defpackage.gqv
    public final void a(gqh gqhVar, boolean z) {
        gqh f;
        if (!z || (f = f()) == null || i(f) || f.a.equals(gqhVar.a)) {
            int e = e(gqhVar.a);
            if (e < this.d.size()) {
                this.d.set(e, gqhVar);
            } else if (i(gqhVar)) {
                this.d.add(0, gqhVar);
            } else {
                this.d.add(gqhVar);
            }
            h();
            gqhVar.g();
            return;
        }
        int e2 = e(gqhVar.a);
        if (e2 < this.d.size()) {
            this.d.remove(e2);
        }
        gqhVar.f();
    }

    @Override // defpackage.gqv
    public final void b(String str) {
        int e = e(str);
        if (e < this.d.size()) {
            this.d.remove(e);
            h();
        }
    }

    @Override // defpackage.gqv
    public final void c(View view) {
        SoftKeyView softKeyView = this.c;
        if (softKeyView != view) {
            if (softKeyView != null) {
                softKeyView.n(null);
            }
            if (view == null || (view instanceof SoftKeyView)) {
                this.c = (SoftKeyView) view;
            } else {
                this.c = null;
            }
        }
        SoftKeyView softKeyView2 = this.c;
        if (softKeyView2 != null) {
            gqh gqhVar = this.e;
            if (gqhVar == null) {
                gqhVar = f();
            }
            g(softKeyView2, gqhVar);
            return;
        }
        gqh gqhVar2 = this.e;
        if (gqhVar2 == null) {
            return;
        }
        gqhVar2.d();
        this.e = null;
    }

    @Override // defpackage.gqv
    public final void d(Context context) {
        this.b = context;
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        StringBuilder sb = new StringBuilder();
        int size = this.d.size();
        int i = 0;
        while (i < size) {
            sb.append(i == 0 ? "" : ", ");
            sb.append(this.d.get(i));
            i++;
        }
        printer.println("AccessPointDefs = ".concat(sb.toString()));
        printer.println("CurrentAccessPoint = ".concat(String.valueOf(String.valueOf(this.e))));
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }
}
