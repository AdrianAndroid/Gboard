package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hyk  reason: default package */
/* loaded from: classes.dex */
public final class hyk extends gxu {
    final /* synthetic */ hym a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hyk(hym hymVar) {
        super("SignatureCheckSecurityExceptionMetric");
        this.a = hymVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String string = this.a.c.getString("signature_check_security_exception_crash", "");
        if (!string.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (String str : lfy.c(',').i(string)) {
                try {
                    arrayList.add(Integer.valueOf(Integer.parseInt(str)));
                } catch (NumberFormatException unused) {
                }
            }
            SharedPreferences.Editor edit = this.a.c.edit();
            if (arrayList.isEmpty()) {
                edit.remove("signature_check_security_exception_crash").apply();
            } else if (arrayList.size() >= 2 || ((Integer) arrayList.get(0)).intValue() != gva.b() - 1) {
                edit.remove("signature_check_security_exception_crash").commit();
                this.a.e.e(idd.SIGNATURE_CHECK_SECURITY_EXCEPTION, Integer.valueOf(Math.min(arrayList.size(), 2)));
                ((ltd) ((ltd) hym.a.b()).k("com/google/android/libraries/inputmethod/lethe/UncaughtExceptionHandler$1", "run", 160, "UncaughtExceptionHandler.java")).t("Signature check SecurityException metric is reported");
            } else {
                ((ltd) ((ltd) hym.a.b()).k("com/google/android/libraries/inputmethod/lethe/UncaughtExceptionHandler$1", "run", 151, "UncaughtExceptionHandler.java")).t("SecurityException was raised last time, will report the metric next time");
            }
        }
    }
}
