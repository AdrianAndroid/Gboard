package defpackage;

import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;

/* compiled from: PG */
/* renamed from: caz  reason: default package */
/* loaded from: classes.dex */
public final class caz implements mix {
    private static final lug a = lug.i("Delight5Facilitator");
    private final Delight5Facilitator b;
    private final dbf c;

    public caz(dbf dbfVar, Delight5Facilitator delight5Facilitator, byte[] bArr) {
        this.c = dbfVar;
        this.b = delight5Facilitator;
    }

    @Override // defpackage.mix
    public final mko a() {
        mko mkoVar;
        lug lugVar = a;
        ((luc) ((luc) lugVar.b()).k("com/google/android/apps/inputmethod/libs/delight5/EmailLanguageModelLoader", "call", 30, "EmailLanguageModelLoader.java")).t("Running email language model loader");
        mvm d = this.c.d();
        if (!((Boolean) cas.S.c()).booleanValue() || irs.d()) {
            if (!this.b.D(d, mvk.UNUSED) || !this.c.e().exists()) {
                return mkk.a;
            }
            this.b.A(d, true);
            this.b.B(d, mvk.DECODING);
            return this.b.h.b(d);
        }
        this.b.A(d, false);
        if (!this.b.D(d, mvk.DECODING)) {
            mkoVar = mkk.a;
        } else {
            mkoVar = this.b.h.d(d);
            this.b.B(d, mvk.UNUSED);
        }
        ((luc) ((luc) lugVar.b()).k("com/google/android/apps/inputmethod/libs/delight5/EmailLanguageModelLoader", "call", 44, "EmailLanguageModelLoader.java")).w("Email language model is unloaded: deviceLocked=%s", Boolean.valueOf(!irs.d()));
        return mkoVar;
    }
}
