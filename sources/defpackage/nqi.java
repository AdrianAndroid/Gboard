package defpackage;

/* compiled from: PG */
/* renamed from: nqi  reason: default package */
/* loaded from: classes2.dex */
public final class nqi implements nqh {
    public static final kju a;

    static {
        kjs a2 = new kjs(kjg.a("com.google.android.gms.droidguard")).a();
        a = a2.g("droidguard_enable_local_apk_signature_verification_in_client", true);
        a2.g("droidguard_enable_local_apk_signature_verification_in_module", true);
    }

    @Override // defpackage.nqh
    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }
}
