package defpackage;

import android.util.Base64;
import android.util.Log;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: kjq  reason: default package */
/* loaded from: classes.dex */
final class kjq extends kju {
    final /* synthetic */ kjr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kjq(kjs kjsVar, String str, Object obj, boolean z, kjr kjrVar) {
        super(kjsVar, str, obj, z);
        this.a = kjrVar;
    }

    @Override // defpackage.kju
    public final Object a(Object obj) {
        try {
            return this.a.a(Base64.decode((String) obj, 3));
        } catch (IOException | IllegalArgumentException unused) {
            String d = super.d();
            Log.e("PhenotypeFlag", "Invalid byte[] value for " + d + ": " + ((String) obj));
            return null;
        }
    }
}
