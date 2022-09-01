package defpackage;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: ept  reason: default package */
/* loaded from: classes.dex */
public final class ept extends ald {
    private static final int[] c = {R.layout.f146640_resource_name_obfuscated_res_0x7f0e05d9, R.layout.f146630_resource_name_obfuscated_res_0x7f0e05d8};
    public final epw a;
    public final epu[] b;
    private final View[] d;

    public ept(Context context, eps epsVar, epw epwVar, int i) {
        this.b = r6;
        this.d = r1;
        this.a = epwVar;
        ess essVar = new ess(context, new eqg(""), 1, false);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context.getApplicationContext(), 0);
        jco.d(essVar, contextThemeWrapper);
        int[] iArr = c;
        View[] viewArr = {View.inflate(context, iArr[0], null), View.inflate(context, iArr[1], null)};
        epu[] epuVarArr = {new epr(viewArr[0], contextThemeWrapper, epsVar, epwVar), new epo(viewArr[1], contextThemeWrapper, epsVar, epwVar, i)};
    }

    @Override // defpackage.ald
    public final int a() {
        return 2;
    }

    @Override // defpackage.ald
    public final Object b(ViewGroup viewGroup, int i) {
        if (this.d[i].getParent() != viewGroup) {
            viewGroup.addView(this.d[i]);
        }
        return this.d[i];
    }

    @Override // defpackage.ald
    public final void c(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // defpackage.ald
    public final boolean h(View view, Object obj) {
        return view == obj;
    }
}
