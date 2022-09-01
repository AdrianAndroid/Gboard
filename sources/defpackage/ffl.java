package defpackage;

/* compiled from: PG */
/* renamed from: ffl  reason: default package */
/* loaded from: classes.dex */
final class ffl extends irw {
    final /* synthetic */ ffn a;

    public ffl(ffn ffnVar) {
        this.a = ffnVar;
    }

    @Override // defpackage.irw
    public final void a() {
        ffn ffnVar = this.a;
        fbr fbrVar = ffnVar.f;
        hsk b = hsx.b();
        if (b == null) {
            ((ltd) ((ltd) fbr.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceImeUtils", "sendStopVoiceEventToInputBundle", 394, "VoiceImeUtils.java")).t("Service is null and could not be acquired.");
        } else {
            fbrVar.f.execute(new fal(b, 7));
        }
        ffnVar.f.e();
    }
}
