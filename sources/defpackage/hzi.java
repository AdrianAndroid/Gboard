package defpackage;

import android.os.PersistableBundle;
import com.google.android.libraries.inputmethod.mdd.MDDTaskScheduler$Runner;

/* compiled from: PG */
/* renamed from: hzi  reason: default package */
/* loaded from: classes.dex */
public final class hzi {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/mdd/MDDTaskScheduler");
    private final isf b;

    public hzi(isf isfVar) {
        this.b = isfVar;
    }

    public final void a(boolean z, boolean z2) {
        int i = 1;
        String format = String.format("%s_%s", true != z ? "unmetered" : "metered", true != z2 ? "battery" : "charging");
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("mdd_task_tag", "download");
        persistableBundle.putBoolean("network", z);
        persistableBundle.putBoolean("charging", z2);
        isn a2 = iso.a("mdd_download_task_".concat(String.valueOf(format)), MDDTaskScheduler$Runner.class.getName());
        if (true != z) {
            i = 3;
        }
        a2.k = i;
        a2.l = z2;
        a2.b();
        a2.i = persistableBundle;
        this.b.c(a2.a());
    }

    public final void b(String str, long j, int i) {
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("mdd_task_tag", str);
        isn a2 = iso.a("mdd_periodical_task_".concat(str), MDDTaskScheduler$Runner.class.getName());
        a2.e(j * 1000);
        a2.b();
        a2.i = persistableBundle;
        int i2 = i - 1;
        int i3 = 1;
        if (i2 != 0) {
            i3 = i2 != 1 ? 0 : 3;
        }
        a2.k = i3;
        this.b.c(a2.a());
    }
}
