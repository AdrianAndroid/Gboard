package defpackage;

/* compiled from: PG */
/* renamed from: nqc  reason: default package */
/* loaded from: classes2.dex */
public final class nqc implements nqb {
    public static final kju a;

    static {
        kjs a2 = new kjs(kjg.a("com.google.android.gms.droidguard")).a();
        a2.e("DroidguardCore__backend_reachability_check_timeout_millis", 30000L);
        a2.e("droidguard_client_timeout_millis", 60000L);
        a = a2.e("DroidguardCore__default_client_library_request_timeout_millis", 60000L);
        a2.g("DroidguardCore__disable_posix_signals_handling", false);
        a2.g("DroidguardCore__enable_backend_reachability_check", false);
        a2.g("DroidguardCore__enable_task_required_uri_reachability_check", false);
        a2.e("DroidguardCore__fetch_creation_response_max_attempts", 2L);
        a2.e("droidguard_connection_timeout_millis", 30000L);
        a2.e("droidguard_read_timeout_millis", 30000L);
        a2.e("gms:droidguard:retry_backoff_seconds_base", 900L);
        a2.e("gms:droidguard:retry_backoff_seconds_limit", 28800L);
        a2.g("DroidguardCore__use_migrated_network_stack", false);
        a2.e("DroidguardCore__wait_on_init_timeout_millis", 0L);
    }

    @Override // defpackage.nqb
    public final long a() {
        return ((Long) a.c()).longValue();
    }
}
