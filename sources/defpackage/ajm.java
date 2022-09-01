package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.UserManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: ajm  reason: default package */
/* loaded from: classes.dex */
final class ajm extends beh {
    private static final List a = Collections.unmodifiableList(Arrays.asList("url", "email", "phone"));
    private static ajm b;

    public static ajm a(Context context) {
        if (b == null) {
            int i = ajl.a;
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            Object systemService = applicationContext.getSystemService("user");
            Bundle userRestrictions = systemService instanceof UserManager ? ((UserManager) systemService).getUserRestrictions() : new Bundle();
            nq.g(applicationContext);
            nq.g(packageManager);
            nq.g(userRestrictions);
            b = new ajm();
        }
        return b;
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0198 A[LOOP:5: B:85:0x0196->B:86:0x0198, LOOP_END] */
    @Override // defpackage.beh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ajt b(defpackage.ajr r17) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajm.b(ajr):ajt");
    }
}
