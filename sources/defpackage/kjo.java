package defpackage;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kjo  reason: default package */
/* loaded from: classes.dex */
public final class kjo extends kju {
    public kjo(kjs kjsVar, String str, Double d) {
        super(kjsVar, str, d, true);
    }

    @Override // defpackage.kju
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            String d = super.d();
            Log.e("PhenotypeFlag", "Invalid double value for " + d + ": " + ((String) obj));
            return null;
        }
    }
}
