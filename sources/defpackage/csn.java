package defpackage;

import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;

/* compiled from: PG */
/* renamed from: csn  reason: default package */
/* loaded from: classes.dex */
public final class csn implements npe {
    private final oiy a;
    private final /* synthetic */ int b;

    public csn(oiy oiyVar, int i) {
        this.b = i;
        this.a = oiyVar;
    }

    public static csn b(oiy oiyVar) {
        return new csn(oiyVar, 0);
    }

    public static csn d(oiy oiyVar) {
        return new csn(oiyVar, 1);
    }

    @Override // defpackage.oiy
    public final /* synthetic */ Object a() {
        return this.b != 0 ? c() : c();
    }

    public final SoftKeyboardView c() {
        return this.b != 0 ? ((csk) this.a.a()).a : ((csk) this.a.a()).a;
    }
}
