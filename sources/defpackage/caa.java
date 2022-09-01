package defpackage;

import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: caa  reason: default package */
/* loaded from: classes.dex */
public final class caa implements mix {
    private static final lug a = lug.i("Delight5Facilitator");
    private final cct b;
    private final Delight5Facilitator c;
    private final ino d;

    public caa(cct cctVar, ino inoVar, Delight5Facilitator delight5Facilitator) {
        this.b = cctVar;
        this.c = delight5Facilitator;
        this.d = inoVar;
    }

    @Override // defpackage.mix
    public final mko a() {
        mko mkoVar;
        lug lugVar = a;
        ((luc) ((luc) lugVar.b()).k("com/google/android/apps/inputmethod/libs/delight5/ContactsLanguageModelLoader", "call", 35, "ContactsLanguageModelLoader.java")).t("Running contacts language model loader");
        mvm b = this.b.b();
        if (!this.d.aj(R.string.f161460_resource_name_obfuscated_res_0x7f1406b3) || !irs.d()) {
            if (!this.c.D(b, mvk.DECODING)) {
                mkoVar = mkk.a;
            } else {
                mkoVar = this.c.h.d(b);
                this.c.B(b, mvk.UNUSED);
            }
            this.c.A(b, false);
            ((luc) ((luc) lugVar.b()).k("com/google/android/apps/inputmethod/libs/delight5/ContactsLanguageModelLoader", "call", 47, "ContactsLanguageModelLoader.java")).I("Contacts language model is unloaded: preferences=%s, deviceLocked=%s", this.d.aj(R.string.f161460_resource_name_obfuscated_res_0x7f1406b3), !irs.d());
            return mkoVar;
        }
        this.c.A(b, true);
        if (!this.c.D(b, mvk.UNUSED) || !this.b.b.exists()) {
            return mkk.a;
        }
        this.c.B(b, mvk.DECODING);
        return this.c.h.b(b);
    }
}
