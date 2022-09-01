package defpackage;

import android.view.inputmethod.InputMethodSubtype;

/* compiled from: PG */
/* renamed from: jap  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jap implements lfe {
    public final /* synthetic */ boolean a;
    private final /* synthetic */ int b;

    public /* synthetic */ jap(boolean z, int i) {
        this.b = i;
        this.a = z;
    }

    @Override // defpackage.lfe
    public final boolean a(Object obj) {
        if (this.b == 0) {
            boolean z = this.a;
            InputMethodSubtype inputMethodSubtype = (InputMethodSubtype) obj;
            ltg ltgVar = jaq.a;
            return z || !inputMethodSubtype.isAuxiliary();
        }
        return cjf.f((mse) obj, this.a);
    }
}
