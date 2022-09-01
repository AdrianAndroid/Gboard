package defpackage;

/* compiled from: PG */
/* renamed from: npo  reason: default package */
/* loaded from: classes2.dex */
public final class npo implements npn {
    public static final kju a;
    public static final kju b;
    public static final kju c;
    public static final kju d;
    public static final kju e;
    public static final kju f;
    public static final kju g;
    public static final kju h;

    static {
        kjs b2 = new kjs(kjg.a("com.google.android.gms.learning")).c().a().b();
        a = b2.f("DiagnosisFeature__clearcut_counters_alias_opt_out", "EXAMPLE_STORE_ERROR_COUNT,TRAINING_SYSTEM_LOW_MEM_STATE,TRAINING_PROCESS_MEM_IMPORTANCE_STATE,TRAINING_PROCESS_MEM_LRU_STATE,SCHEDULER_SKEW_SECONDS,OPSTATS_DB_SIZE_BYTES,OPSTATS_DB_NUM_ENTRIES,OPSTATS_NUM_PRUNED_ENTRIES,OPSTATS_OLDEST_PRUNED_ENTRY_TENURE_HOURS");
        b = b2.e("DiagnosisFeature__clearcut_counters_default_alias", 10L);
        c = b2.g("DiagnosisFeature__clearcut_counters_enabled", true);
        d = b2.g("DiagnosisFeature__clearcut_log_to_file_enabled_for_test", false);
        e = b2.e("DiagnosisFeature__clearcut_max_samples_per_counter", 200L);
        f = b2.g("DiagnosisFeature__debug_diag_enabled", false);
        b2.g("DiagnosisFeature__enable_clearcut_in_dynamite", true);
        b2.g("DiagnosisFeature__increment_learning_context_refcount_for_background_work", true);
        g = b2.g("DiagnosisFeature__log_tensorflow_error_messages", true);
        h = b2.g("DiagnosisFeature__production_diag_enabled", true);
        b2.g("DiagnosisFeature__stop_wrapping_or_ignoring_runtime_exceptions", true);
    }

    @Override // defpackage.npn
    public final long a() {
        return ((Long) b.c()).longValue();
    }

    @Override // defpackage.npn
    public final long b() {
        return ((Long) e.c()).longValue();
    }

    @Override // defpackage.npn
    public final String c() {
        return (String) a.c();
    }

    @Override // defpackage.npn
    public final boolean d() {
        return ((Boolean) c.c()).booleanValue();
    }

    @Override // defpackage.npn
    public final boolean e() {
        return ((Boolean) d.c()).booleanValue();
    }

    @Override // defpackage.npn
    public final boolean f() {
        return ((Boolean) f.c()).booleanValue();
    }

    @Override // defpackage.npn
    public final boolean g() {
        return ((Boolean) g.c()).booleanValue();
    }

    @Override // defpackage.npn
    public final boolean h() {
        return ((Boolean) h.c()).booleanValue();
    }
}
