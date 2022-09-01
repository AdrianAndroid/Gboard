package defpackage;

/* compiled from: PG */
/* renamed from: gif  reason: default package */
/* loaded from: classes.dex */
public final class gif {
    public static final ltg a = ltg.j("com/google/android/libraries/assistant/soda/SodaJniLoader");
    public static final llp b = llp.x("google_speech_jni", "google_speech_with_aec_jni", "soda_dev_jni", "soda_jni", "soda_jni_init_google", "soda_jni_no_terse_init_google", "soda_jni_wearos", "soda_jni_wearos_init_google", "soda_with_benchmark_jni", "soda_euphonia_jni", "soda_langid_jni", "dps_soda_pixel_s_jni", "dps_soda_jni", "dps_soda_dev_jni");
    public static final llp c = llp.s("soda_jni_no_terse", "soda_jni_no_terse_init_google");

    public static boolean a() {
        llp llpVar = b;
        int i = ((lrl) llpVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            try {
                lzb.a((String) llpVar.get(i2));
                return true;
            } catch (bke | UnsatisfiedLinkError unused) {
            }
        }
        return false;
    }

    public static boolean b() {
        llp llpVar = c;
        int i = ((lrl) llpVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            try {
                lzb.a((String) llpVar.get(i2));
                return true;
            } catch (bke | UnsatisfiedLinkError unused) {
            }
        }
        return false;
    }
}
