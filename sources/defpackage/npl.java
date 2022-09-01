package defpackage;

import android.util.Base64;

/* compiled from: PG */
/* renamed from: npl  reason: default package */
/* loaded from: classes2.dex */
public final class npl implements npj {
    public static final kju a;
    public static final kju b;
    public static final kju c;

    static {
        kjs a2 = new kjs(kjg.a("com.google.android.gms.auth_account")).c().a();
        a2.d("getTokenRefactor__account_data_service_sample_percentage", 0.0d);
        a2.g("getTokenRefactor__account_data_service_tokenAPI_usable", true);
        a2.e("getTokenRefactor__account_manager_timeout_seconds", 20L);
        a2.e("getTokenRefactor__android_id_shift", 0L);
        a2.g("getTokenRefactor__authenticator_logic_improved", false);
        try {
            a = a2.h("getTokenRefactor__blocked_packages", (njc) nfm.w(njc.b, Base64.decode("ChNjb20uYW5kcm9pZC52ZW5kaW5nCiBjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5tZWV0aW5ncwohY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMubWVzc2FnaW5n", 3)), npk.a);
            a2.g("getTokenRefactor__chimera_get_token_evolved", true);
            a2.e("getTokenRefactor__clear_token_timeout_seconds", 20L);
            a2.e("getTokenRefactor__default_task_timeout_seconds", 20L);
            b = a2.g("getTokenRefactor__gaul_accounts_api_evolved", false);
            c = a2.g("getTokenRefactor__gaul_token_api_evolved", false);
            a2.e("getTokenRefactor__get_token_timeout_seconds", 120L);
            a2.g("getTokenRefactor__gms_account_authenticator_evolved", true);
            a2.d("getTokenRefactor__gms_account_authenticator_sample_percentage", 0.0d);
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.npj
    public final njc a() {
        return (njc) a.c();
    }

    @Override // defpackage.npj
    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }

    @Override // defpackage.npj
    public final boolean c() {
        return ((Boolean) c.c()).booleanValue();
    }
}
