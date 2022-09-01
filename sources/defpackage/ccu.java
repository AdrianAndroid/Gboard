package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: PG */
/* renamed from: ccu  reason: default package */
/* loaded from: classes.dex */
public final class ccu {
    public static final hhl a = hhq.a("dlam_training_enabled", false);
    static final hhl b = hhq.a("dlam_multilang_users_only", true);
    public static final hhl c = hhq.a("dlam_use_dictionary", false);
    static final hhl d = hhq.a("dlam_ignore_training_threshold", false);
    public static final hhl e = hhq.e("dlam_auto_correction_revert_threshold", 0.5d);
    static final hhl f = hhq.f("dlam_threshold_min_sample", 300);
    static final hhl g = hhq.f("dlam_result_ttl_days", 7);
    public static final hic h = hhq.k("dlam_language_identification_strategy", ghf.d);
    public static final hic i = hhq.k("dlam_to_klp_assignment", ghd.c);
    private static volatile ccu j;
    private final String k;

    private ccu(Context context) {
        String valueOf = String.valueOf(context.getFilesDir());
        String str = File.separator;
        this.k = valueOf + str + "dlam";
    }

    public static ccu a(Context context) {
        ccu ccuVar = j;
        if (ccuVar == null) {
            synchronized (ccu.class) {
                ccuVar = j;
                if (ccuVar == null) {
                    ccuVar = new ccu(context);
                    j = ccuVar;
                }
            }
        }
        return ccuVar;
    }

    public static final boolean c() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final File b() {
        return new File(jan.b.b(this.k), "dlam_properties.data");
    }
}
