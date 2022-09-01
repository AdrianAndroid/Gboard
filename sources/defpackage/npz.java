package defpackage;

/* compiled from: PG */
/* renamed from: npz  reason: default package */
/* loaded from: classes2.dex */
public final class npz implements npy {
    public static final kju a;
    public static final kju b;

    static {
        kjs a2 = new kjs(kjg.a("com.google.android.gms.droidguard")).a();
        a = a2.g("droidguard_enable_client_library_telemetry", false);
        b = a2.f("droidguard_flows_with_fine_client_library_telemetry", "");
    }

    @Override // defpackage.npy
    public final String a() {
        return (String) b.c();
    }

    @Override // defpackage.npy
    public final boolean b() {
        return ((Boolean) a.c()).booleanValue();
    }
}
