package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fdt  reason: default package */
/* loaded from: classes.dex */
public final class fdt extends irw {
    final /* synthetic */ fdu a;

    public fdt(fdu fduVar) {
        this.a = fduVar;
    }

    @Override // defpackage.irw
    public final void a() {
        hqt b;
        fes fesVar;
        long c = this.a.b.c("last_schedule_auto_download_time", 0L);
        if ((c == 0 || System.currentTimeMillis() - c > fdu.a) && (b = hqp.b()) != null) {
            fao faoVar = new fao(b.a());
            jav i = b.i();
            fex fexVar = (fex) faoVar.h.get();
            if ((fexVar != null && fexVar.a() == few.AIAI) || (fesVar = fao.b) == null) {
                return;
            }
            ((ltd) ((ltd) feb.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/OnDeviceRecognitionProvider", "maybeScheduleAutoPackDownload", 361, "OnDeviceRecognitionProvider.java")).w("maybeScheduleAutoPackDownload() : LanguageTag = %s", i);
            feb febVar = (feb) fesVar;
            if (febVar.j(i) || !febVar.i()) {
                return;
            }
            kcu.U(febVar.d.d(i), new bvo(febVar, i, 20), febVar.e);
        }
    }
}
