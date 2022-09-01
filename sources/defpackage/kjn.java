package defpackage;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kjn  reason: default package */
/* loaded from: classes.dex */
public final class kjn extends kju {
    public kjn(kjs kjsVar, String str, Boolean bool) {
        super(kjsVar, str, bool, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kju
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        if (gfp.c.matcher(obj).matches()) {
            return true;
        }
        if (!gfp.d.matcher(obj).matches()) {
            String d = super.d();
            Log.e("PhenotypeFlag", "Invalid boolean value for " + d + ": " + ((String) obj));
            return null;
        }
        return false;
    }
}
