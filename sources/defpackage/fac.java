package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* renamed from: fac  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class fac implements gej {
    public static final /* synthetic */ fac a = new fac();

    private /* synthetic */ fac() {
    }

    @Override // defpackage.gej
    public final void a(gen genVar) {
        ltg ltgVar = fae.a;
        if (genVar.e()) {
            int i = ((Status) genVar.c()).f;
            ((ltd) ((ltd) fae.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/AuditRecordHelper", "lambda$writeAsync$1", 97, "AuditRecordHelper.java")).J("AuditRecord submitted successfully with status code: `%s` (%s) and message: %s", Integer.valueOf(i), i != 24500 ? fgy.e(i) : "REQUEST_NOT_ALLOWED", ((Status) genVar.c()).g);
            return;
        }
        ((ltd) ((ltd) ((ltd) fae.a.d()).i(genVar.b())).k("com/google/android/apps/inputmethod/libs/voiceime/AuditRecordHelper", "lambda$writeAsync$1", 'h', "AuditRecordHelper.java")).t("Failed to submit AuditRecord");
    }
}
