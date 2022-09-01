package defpackage;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kjm  reason: default package */
/* loaded from: classes.dex */
public final class kjm extends kju {
    public kjm(kjs kjsVar, String str, Long l) {
        super(kjsVar, str, l, true);
    }

    @Override // defpackage.kju
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            String d = super.d();
            Log.e("PhenotypeFlag", "Invalid long value for " + d + ": " + ((String) obj));
            return null;
        }
    }
}
