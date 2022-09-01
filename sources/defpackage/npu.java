package defpackage;

/* compiled from: PG */
/* renamed from: npu  reason: default package */
/* loaded from: classes2.dex */
public final class npu implements npt {
    public static final kky a;
    public static final kky b;
    public static final kky c;
    public static final kky d;
    public static final kky e;
    public static final kky f;
    public static final kky g;
    public static final kky h;

    static {
        klc d2 = new klc("com.google.android.libraries.consentverifier").d();
        a = d2.b("CollectionBasisVerifierFeatures__enable_all_features", false);
        b = d2.b("CollectionBasisVerifierFeatures__enable_logging", false);
        c = d2.b("CollectionBasisVerifierFeatures__enable_logging_field_not_annotated", false);
        d = d2.b("CollectionBasisVerifierFeatures__enable_logging_uc_never_collect", false);
        e = d2.b("CollectionBasisVerifierFeatures__enable_using_log_verifier_result", false);
        f = d2.a("CollectionBasisVerifierFeatures__failure_log_cooldown_period_ms", 86400000L);
        g = d2.a("CollectionBasisVerifierFeatures__max_stack_trace_size", 1000L);
        h = d2.a("CollectionBasisVerifierFeatures__min_app_version_code_to_log", -1L);
    }

    @Override // defpackage.npt
    public final long a() {
        return ((Long) f.a()).longValue();
    }

    @Override // defpackage.npt
    public final long b() {
        return ((Long) g.a()).longValue();
    }

    @Override // defpackage.npt
    public final long c() {
        return ((Long) h.a()).longValue();
    }

    @Override // defpackage.npt
    public final boolean d() {
        return ((Boolean) a.a()).booleanValue();
    }

    @Override // defpackage.npt
    public final boolean e() {
        return ((Boolean) b.a()).booleanValue();
    }

    @Override // defpackage.npt
    public final boolean f() {
        return ((Boolean) c.a()).booleanValue();
    }

    @Override // defpackage.npt
    public final boolean g() {
        return ((Boolean) d.a()).booleanValue();
    }

    @Override // defpackage.npt
    public final boolean h() {
        return ((Boolean) e.a()).booleanValue();
    }
}
