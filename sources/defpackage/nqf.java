package defpackage;

/* compiled from: PG */
/* renamed from: nqf  reason: default package */
/* loaded from: classes2.dex */
public final class nqf implements nqe {
    public static final kju a;
    public static final kju b;
    public static final kju c;

    static {
        kjs a2 = new kjs(kjg.a("com.google.android.gms.droidguard")).a();
        a2.g("FallbackResponseFeature__catch_all_signal_exceptions", false);
        a2.g("FallbackResponseFeature__enable_signal_selector", true);
        a = a2.g("FallbackResponseFeature__include_build_fingerprint_in_plaintext", true);
        a2.g("FallbackResponseFeature__include_copied_extra_keys", true);
        a2.g("FallbackResponseFeature__include_exception_and_versions_in_plaintext", true);
        b = a2.g("FallbackResponseFeature__include_exception_and_versions_in_plaintext_generalized", true);
        a2.g("FallbackResponseFeature__include_gms_core_version", true);
        a2.g("FallbackResponseFeature__include_gsid", true);
        a2.g("FallbackResponseFeature__include_key_attestation", false);
        c = a2.g("FallbackResponseFeature__include_versions_in_client_plaintext", true);
        a2.f("FallbackResponseFeature__main_signals", "5,7,8,9,0,1,2,3,4,6,10,11,12,13,14,19,20,21,27,24,25,26,28,22,29");
        a2.f("FallbackResponseFeature__per_flow_signal_overrides", "");
        a2.f("FallbackResponseFeature__safe_flows", "");
        a2.f("FallbackResponseFeature__safe_signals", "5,0,2,3,6,10,11,12,13,14,19,20,21,23,24,25,26");
    }

    @Override // defpackage.nqe
    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    @Override // defpackage.nqe
    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }

    @Override // defpackage.nqe
    public final boolean c() {
        return ((Boolean) c.c()).booleanValue();
    }
}
